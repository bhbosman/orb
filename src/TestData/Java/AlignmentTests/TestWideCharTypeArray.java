import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestWideCharTypeArray extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char)('A' + i);
        }

        IntegrationWithExternal.WideCharTypeArray data = new IntegrationWithExternal.WideCharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.WideCharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char)('A' + i);
        }

        IntegrationWithExternal.WideCharTypeArray data = new IntegrationWithExternal.WideCharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.WideCharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternal.WideCharTypeArray data = new IntegrationWithExternal.WideCharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.WideCharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternal.WideCharTypeArray data = new IntegrationWithExternal.WideCharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.WideCharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternal.WideCharTypeArray data = new IntegrationWithExternal.WideCharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.WideCharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternal.WideCharTypeArray data = new IntegrationWithExternal.WideCharTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.WideCharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeArrayHelper.id());
    }


}