import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestDoubleTypeSequence extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        IntegrationWithExternal.DoubleType[] v = new IntegrationWithExternal.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.DoubleType((char)('A' + i));
        }

        IntegrationWithExternal.DoubleTypeSequence data = new IntegrationWithExternal.DoubleTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeSequenceHelper.id());
    }
    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.DoubleType[] v = new IntegrationWithExternal.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.DoubleType(3333);
        }

        IntegrationWithExternal.DoubleTypeSequence data = new IntegrationWithExternal.DoubleTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeSequenceHelper.id());
    }
    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.DoubleType[] v = new IntegrationWithExternal.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.DoubleType(45333);
        }

        IntegrationWithExternal.DoubleTypeSequence data = new IntegrationWithExternal.DoubleTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.DoubleType[] v = new IntegrationWithExternal.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.DoubleType((char) ('A' + i));
        }

        IntegrationWithExternal.DoubleTypeSequence data = new IntegrationWithExternal.DoubleTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.DoubleType[] v = new IntegrationWithExternal.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.DoubleType(3333);
        }

        IntegrationWithExternal.DoubleTypeSequence data = new IntegrationWithExternal.DoubleTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.DoubleType[] v = new IntegrationWithExternal.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.DoubleType(45333);
        }

        IntegrationWithExternal.DoubleTypeSequence data = new IntegrationWithExternal.DoubleTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeSequenceHelper.id());
    }


}