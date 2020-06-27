import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestLongLongTypeSequenceNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.LongLongType[] v = new IntegrationWithExternalNotAligned.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.LongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequence data = new IntegrationWithExternalNotAligned.LongLongTypeSeqSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.LongLongType[] v = new IntegrationWithExternalNotAligned.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.LongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequence data = new IntegrationWithExternalNotAligned.LongLongTypeSeqSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.LongLongType[] v = new IntegrationWithExternalNotAligned.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.LongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequence data = new IntegrationWithExternalNotAligned.LongLongTypeSeqSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.LongLongType[] v = new IntegrationWithExternalNotAligned.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.LongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequence data = new IntegrationWithExternalNotAligned.LongLongTypeSeqSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.LongLongType[] v = new IntegrationWithExternalNotAligned.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.LongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequence data = new IntegrationWithExternalNotAligned.LongLongTypeSeqSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.LongLongType[] v = new IntegrationWithExternalNotAligned.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.LongLongType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequence data = new IntegrationWithExternalNotAligned.LongLongTypeSeqSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.LongLongTypeSeqSequenceHelper.id());
    }


}