import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestWideCharTypeSequence extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        IntegrationWithExternal.WideCharType[] v = new IntegrationWithExternal.WideCharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.WideCharType((char)('A' + i));
        }

        IntegrationWithExternal.WideCharTypeSequence data = new IntegrationWithExternal.WideCharTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.WideCharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.WideCharType[] v = new IntegrationWithExternal.WideCharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.WideCharType((char)('A' + i));
        }

        IntegrationWithExternal.WideCharTypeSequence data = new IntegrationWithExternal.WideCharTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.WideCharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.WideCharType[] v = new IntegrationWithExternal.WideCharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.WideCharType((char) ('A' + i));
        }

        IntegrationWithExternal.WideCharTypeSequence data = new IntegrationWithExternal.WideCharTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.WideCharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.WideCharType[] v = new IntegrationWithExternal.WideCharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.WideCharType((char) ('A' + i));
        }

        IntegrationWithExternal.WideCharTypeSequence data = new IntegrationWithExternal.WideCharTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.WideCharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.WideCharType[] v = new IntegrationWithExternal.WideCharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.WideCharType((char) ('A' + i));
        }

        IntegrationWithExternal.WideCharTypeSequence data = new IntegrationWithExternal.WideCharTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.WideCharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.WideCharType[] v = new IntegrationWithExternal.WideCharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternal.WideCharType((char) ('A' + i));
        }

        IntegrationWithExternal.WideCharTypeSequence data = new IntegrationWithExternal.WideCharTypeSequence(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.WideCharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.WideCharTypeSequenceHelper.id());
    }


}