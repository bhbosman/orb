import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestUnsignedLongLongTypeArray extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long)('A' + i);
        }
        IntegrationWithExternal.UnsignedLongLongTypeArray data = new IntegrationWithExternal.UnsignedLongLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long)('A' + i);
        }
        IntegrationWithExternal.UnsignedLongLongTypeArray data = new IntegrationWithExternal.UnsignedLongLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long) ('A' + i);
        }
        IntegrationWithExternal.UnsignedLongLongTypeArray data = new IntegrationWithExternal.UnsignedLongLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long) ('A' + i);
        }
        IntegrationWithExternal.UnsignedLongLongTypeArray data = new IntegrationWithExternal.UnsignedLongLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long) ('A' + i);
        }
        IntegrationWithExternal.UnsignedLongLongTypeArray data = new IntegrationWithExternal.UnsignedLongLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long) ('A' + i);
        }
        IntegrationWithExternal.UnsignedLongLongTypeArray data = new IntegrationWithExternal.UnsignedLongLongTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeArrayHelper.id());
    }


}