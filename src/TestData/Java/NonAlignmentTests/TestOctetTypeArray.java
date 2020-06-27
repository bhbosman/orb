import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestOctetTypeArrayNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte) ('A' + i);
        }

        IntegrationWithExternalNotAligned.OctetTypeArray data = new IntegrationWithExternalNotAligned.OctetTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte) ('A' + i);
        }

        IntegrationWithExternalNotAligned.OctetTypeArray data = new IntegrationWithExternalNotAligned.OctetTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte) ('A' + i);
        }

        IntegrationWithExternalNotAligned.OctetTypeArray data = new IntegrationWithExternalNotAligned.OctetTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte) ('A' + i);
        }

        IntegrationWithExternalNotAligned.OctetTypeArray data = new IntegrationWithExternalNotAligned.OctetTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte) ('A' + i);
        }

        IntegrationWithExternalNotAligned.OctetTypeArray data = new IntegrationWithExternalNotAligned.OctetTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte) ('A' + i);
        }

        IntegrationWithExternalNotAligned.OctetTypeArray data = new IntegrationWithExternalNotAligned.OctetTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeArrayHelper.id());
    }


}