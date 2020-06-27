import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestUnsignedLongTypeArray extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;

        int[] v = new int[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char)('A' + i);
        }
        IntegrationWithExternal.UnsignedLongTypeArray data = new IntegrationWithExternal.UnsignedLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.UnsignedLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;

        int[] v = new int[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char)('A' + i);
        }
        IntegrationWithExternal.UnsignedLongTypeArray data = new IntegrationWithExternal.UnsignedLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.UnsignedLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;

        int[] v = new int[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }
        IntegrationWithExternal.UnsignedLongTypeArray data = new IntegrationWithExternal.UnsignedLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.UnsignedLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;

        int[] v = new int[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }
        IntegrationWithExternal.UnsignedLongTypeArray data = new IntegrationWithExternal.UnsignedLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.UnsignedLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;

        int[] v = new int[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }
        IntegrationWithExternal.UnsignedLongTypeArray data = new IntegrationWithExternal.UnsignedLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.UnsignedLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;

        int[] v = new int[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (char) ('A' + i);
        }
        IntegrationWithExternal.UnsignedLongTypeArray data = new IntegrationWithExternal.UnsignedLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.UnsignedLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongTypeArrayHelper.id());
    }


}