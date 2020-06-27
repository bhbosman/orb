import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestCharTypeSequenceNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.CharType[] v = new IntegrationWithExternalNotAligned.CharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.CharType((byte) 12, (char) ('A' + i));
        }

        IntegrationWithExternalNotAligned.CharTypeSequence data = new IntegrationWithExternalNotAligned.CharTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.CharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.CharType[] v = new IntegrationWithExternalNotAligned.CharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.CharType((byte) 12, (char) ('A' + i));
        }

        IntegrationWithExternalNotAligned.CharTypeSequence data = new IntegrationWithExternalNotAligned.CharTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.CharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.CharType[] v = new IntegrationWithExternalNotAligned.CharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.CharType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.CharTypeSequence data = new IntegrationWithExternalNotAligned.CharTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.CharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.CharType[] v = new IntegrationWithExternalNotAligned.CharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.CharType((byte) 12, (char) ('A' + i));
        }

        IntegrationWithExternalNotAligned.CharTypeSequence data = new IntegrationWithExternalNotAligned.CharTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.CharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.CharType[] v = new IntegrationWithExternalNotAligned.CharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.CharType((byte) 12, (char) ('A' + i));
        }

        IntegrationWithExternalNotAligned.CharTypeSequence data = new IntegrationWithExternalNotAligned.CharTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.CharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.CharType[] v = new IntegrationWithExternalNotAligned.CharType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.CharType((byte) 12, (char) ('A' + i));
        }
        IntegrationWithExternalNotAligned.CharTypeSequence data = new IntegrationWithExternalNotAligned.CharTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.CharTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.CharTypeSequenceHelper.id());
    }


}