import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


class TestCharTypeArray extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char)('A' + i);
        }

        IntegrationWithExternal.CharTypeArray data = new IntegrationWithExternal.CharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.CharTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char)('A' + i);
        }

        IntegrationWithExternal.CharTypeArray data = new IntegrationWithExternal.CharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.CharTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternal.CharTypeArray data = new IntegrationWithExternal.CharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.CharTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternal.CharTypeArray data = new IntegrationWithExternal.CharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.CharTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternal.CharTypeArray data = new IntegrationWithExternal.CharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.CharTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternal.CharTypeArray data = new IntegrationWithExternal.CharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.CharTypeArrayHelper.id());
    }


}