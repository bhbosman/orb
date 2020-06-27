import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestOctetTypeArray extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte)('A' + i);
        }

        IntegrationWithExternal.OctetTypeArray data = new IntegrationWithExternal.OctetTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.OctetTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte)('A' + i);
        }

        IntegrationWithExternal.OctetTypeArray data = new IntegrationWithExternal.OctetTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.OctetTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte) ('A' + i);
        }

        IntegrationWithExternal.OctetTypeArray data = new IntegrationWithExternal.OctetTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.OctetTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte) ('A' + i);
        }

        IntegrationWithExternal.OctetTypeArray data = new IntegrationWithExternal.OctetTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.OctetTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte) ('A' + i);
        }

        IntegrationWithExternal.OctetTypeArray data = new IntegrationWithExternal.OctetTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.OctetTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        byte[] v = new byte[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (byte) ('A' + i);
        }

        IntegrationWithExternal.OctetTypeArray data = new IntegrationWithExternal.OctetTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.OctetTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.OctetTypeArrayHelper.id());
    }


}