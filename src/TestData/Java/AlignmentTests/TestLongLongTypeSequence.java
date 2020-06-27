import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestLongLongTypeSequence extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        IntegrationWithExternal.LongLongType[] v = new IntegrationWithExternal.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongLongType((char)('A' + i));
        }
        IntegrationWithExternal.LongLongTypeSeqSequence data = new IntegrationWithExternal.LongLongTypeSeqSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongLongTypeSeqSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.LongLongType[] v = new IntegrationWithExternal.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongLongType((char)('A' + i));
        }
        IntegrationWithExternal.LongLongTypeSeqSequence data = new IntegrationWithExternal.LongLongTypeSeqSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongLongTypeSeqSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.LongLongType[] v = new IntegrationWithExternal.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongLongType((char) ('A' + i));
        }
        IntegrationWithExternal.LongLongTypeSeqSequence data = new IntegrationWithExternal.LongLongTypeSeqSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongLongTypeSeqSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.LongLongType[] v = new IntegrationWithExternal.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongLongType((char) ('A' + i));
        }
        IntegrationWithExternal.LongLongTypeSeqSequence data = new IntegrationWithExternal.LongLongTypeSeqSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongLongTypeSeqSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.LongLongType[] v = new IntegrationWithExternal.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongLongType((char) ('A' + i));
        }
        IntegrationWithExternal.LongLongTypeSeqSequence data = new IntegrationWithExternal.LongLongTypeSeqSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongLongTypeSeqSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.LongLongType[] v = new IntegrationWithExternal.LongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongLongType((char) ('A' + i));
        }
        IntegrationWithExternal.LongLongTypeSeqSequence data = new IntegrationWithExternal.LongLongTypeSeqSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.LongLongTypeSeqSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongLongTypeSeqSequenceHelper.id());
    }


}