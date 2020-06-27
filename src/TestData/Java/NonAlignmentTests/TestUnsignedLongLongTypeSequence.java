import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestUnsignedLongLongTypeSequenceNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.UnsignedLongLongType[] v = new IntegrationWithExternalNotAligned.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedLongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.UnsignedLongLongType[] v = new IntegrationWithExternalNotAligned.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedLongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.UnsignedLongLongType[] v = new IntegrationWithExternalNotAligned.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedLongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.UnsignedLongLongType[] v = new IntegrationWithExternalNotAligned.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedLongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.UnsignedLongLongType[] v = new IntegrationWithExternalNotAligned.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedLongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.UnsignedLongLongType[] v = new IntegrationWithExternalNotAligned.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedLongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.id());
    }


}