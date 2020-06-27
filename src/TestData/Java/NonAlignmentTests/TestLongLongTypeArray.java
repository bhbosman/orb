import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestLongLongTypeArrayNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long) ('A' + i);
        }
        IntegrationWithExternalNotAligned.LongLongTypeArray data = new IntegrationWithExternalNotAligned.LongLongTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long) ('A' + i);
        }
        IntegrationWithExternalNotAligned.LongLongTypeArray data = new IntegrationWithExternalNotAligned.LongLongTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long) ('A' + i);
        }
        IntegrationWithExternalNotAligned.LongLongTypeArray data = new IntegrationWithExternalNotAligned.LongLongTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long) ('A' + i);
        }
        IntegrationWithExternalNotAligned.LongLongTypeArray data = new IntegrationWithExternalNotAligned.LongLongTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long) ('A' + i);
        }
        IntegrationWithExternalNotAligned.LongLongTypeArray data = new IntegrationWithExternalNotAligned.LongLongTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;

        long[] v = new long[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (long) ('A' + i);
        }
        IntegrationWithExternalNotAligned.LongLongTypeArray data = new IntegrationWithExternalNotAligned.LongLongTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.id());
    }

}