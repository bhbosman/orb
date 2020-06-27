import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestUnsignedLongLongTypeSequence extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        IntegrationWithExternal.UnsignedLongLongType[] v = new IntegrationWithExternal.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedLongLongType((char)('A' + i));
        }
        IntegrationWithExternal.UnsignedLongLongTypeSequence data = new IntegrationWithExternal.UnsignedLongLongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.UnsignedLongLongType[] v = new IntegrationWithExternal.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedLongLongType((char)('A' + i));
        }
        IntegrationWithExternal.UnsignedLongLongTypeSequence data = new IntegrationWithExternal.UnsignedLongLongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.UnsignedLongLongType[] v = new IntegrationWithExternal.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedLongLongType((char) ('A' + i));
        }
        IntegrationWithExternal.UnsignedLongLongTypeSequence data = new IntegrationWithExternal.UnsignedLongLongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.UnsignedLongLongType[] v = new IntegrationWithExternal.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedLongLongType((char) ('A' + i));
        }
        IntegrationWithExternal.UnsignedLongLongTypeSequence data = new IntegrationWithExternal.UnsignedLongLongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.UnsignedLongLongType[] v = new IntegrationWithExternal.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedLongLongType((char) ('A' + i));
        }
        IntegrationWithExternal.UnsignedLongLongTypeSequence data = new IntegrationWithExternal.UnsignedLongLongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.UnsignedLongLongType[] v = new IntegrationWithExternal.UnsignedLongLongType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedLongLongType((char) ('A' + i));
        }
        IntegrationWithExternal.UnsignedLongLongTypeSequence data = new IntegrationWithExternal.UnsignedLongLongTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedLongLongTypeSequenceHelper.id());
    }


}