import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestUnsignedShortTypeSequence extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        IntegrationWithExternal.UnsignedShortType[] v = new IntegrationWithExternal.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedShortType((short) ('A' + i));
        }
        IntegrationWithExternal.UnsignedShortTypeSequence data = new IntegrationWithExternal.UnsignedShortTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedShortTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.UnsignedShortType[] v = new IntegrationWithExternal.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedShortType((short) ('A' + i));
        }
        IntegrationWithExternal.UnsignedShortTypeSequence data = new IntegrationWithExternal.UnsignedShortTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedShortTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.UnsignedShortType[] v = new IntegrationWithExternal.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedShortType((short) ('A' + i));
        }
        IntegrationWithExternal.UnsignedShortTypeSequence data = new IntegrationWithExternal.UnsignedShortTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedShortTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.UnsignedShortType[] v = new IntegrationWithExternal.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedShortType((short) ('A' + i));
        }
        IntegrationWithExternal.UnsignedShortTypeSequence data = new IntegrationWithExternal.UnsignedShortTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedShortTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.UnsignedShortType[] v = new IntegrationWithExternal.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedShortType((short) ('A' + i));
        }
        IntegrationWithExternal.UnsignedShortTypeSequence data = new IntegrationWithExternal.UnsignedShortTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedShortTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.UnsignedShortType[] v = new IntegrationWithExternal.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.UnsignedShortType((short) ('A' + i));
        }
        IntegrationWithExternal.UnsignedShortTypeSequence data = new IntegrationWithExternal.UnsignedShortTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.UnsignedShortTypeSequenceHelper.id());
    }


}