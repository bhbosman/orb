import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


class TestCharTypeArrayNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternalNotAligned.CharTypeArray data = new IntegrationWithExternalNotAligned.CharTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternalNotAligned.CharTypeArray data = new IntegrationWithExternalNotAligned.CharTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternalNotAligned.CharTypeArray data = new IntegrationWithExternalNotAligned.CharTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternalNotAligned.CharTypeArray data = new IntegrationWithExternalNotAligned.CharTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternalNotAligned.CharTypeArray data = new IntegrationWithExternalNotAligned.CharTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        char[] v = new char[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }

        IntegrationWithExternalNotAligned.CharTypeArray data = new IntegrationWithExternalNotAligned.CharTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.CharTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeArrayHelper.id());
    }


}