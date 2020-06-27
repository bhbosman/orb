import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestLongTypeSequence extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        IntegrationWithExternal.LongType[] v = new IntegrationWithExternal.LongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongType((char)('A' + i));
        }
        IntegrationWithExternal.LongTypeSequence data = new IntegrationWithExternal.LongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.LongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongTypeSequenceHelper.id());
    }
    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.LongType[] v = new IntegrationWithExternal.LongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongType((char)('A' + i));
        }
        IntegrationWithExternal.LongTypeSequence data = new IntegrationWithExternal.LongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.LongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongTypeSequenceHelper.id());
    }
    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.LongType[] v = new IntegrationWithExternal.LongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongType((char) ('A' + i));
        }
        IntegrationWithExternal.LongTypeSequence data = new IntegrationWithExternal.LongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.LongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.LongType[] v = new IntegrationWithExternal.LongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongType((char) ('A' + i));
        }
        IntegrationWithExternal.LongTypeSequence data = new IntegrationWithExternal.LongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.LongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.LongType[] v = new IntegrationWithExternal.LongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongType((char) ('A' + i));
        }
        IntegrationWithExternal.LongTypeSequence data = new IntegrationWithExternal.LongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.LongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.LongType[] v = new IntegrationWithExternal.LongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.LongType((char) ('A' + i));
        }
        IntegrationWithExternal.LongTypeSequence data = new IntegrationWithExternal.LongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.LongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.LongTypeSequenceHelper.id());
    }


}