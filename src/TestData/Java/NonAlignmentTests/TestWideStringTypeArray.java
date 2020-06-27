import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestWideStringTypeArrayNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        String[] v = new String[16];
        for (int i = 0; i < 16; i++) {
            v[i] = "ABCDEFGHI";
        }
        IntegrationWithExternalNotAligned.WideStringTypeArray data = new IntegrationWithExternalNotAligned.WideStringTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.id());
    }


    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        String[] v = new String[16];
        for (int i = 0; i < 16; i++) {
            v[i] = "ABCDEFGHI";
        }
        IntegrationWithExternalNotAligned.WideStringTypeArray data = new IntegrationWithExternalNotAligned.WideStringTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        String[] v = new String[16];
        for (int i = 0; i < 16; i++) {
            v[i] = "ABCDEFGHI";
        }
        IntegrationWithExternalNotAligned.WideStringTypeArray data = new IntegrationWithExternalNotAligned.WideStringTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        String[] v = new String[16];
        for (int i = 0; i < 16; i++) {
            v[i] = "ABCDEFGHI";
        }
        IntegrationWithExternalNotAligned.WideStringTypeArray data = new IntegrationWithExternalNotAligned.WideStringTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        String[] v = new String[16];
        for (int i = 0; i < 16; i++) {
            v[i] = "ABCDEFGHI";
        }
        IntegrationWithExternalNotAligned.WideStringTypeArray data = new IntegrationWithExternalNotAligned.WideStringTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        String[] v = new String[16];
        for (int i = 0; i < 16; i++) {
            v[i] = "ABCDEFGHI";
        }
        IntegrationWithExternalNotAligned.WideStringTypeArray data = new IntegrationWithExternalNotAligned.WideStringTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.WideStringTypeArrayHelper.id());
    }


}