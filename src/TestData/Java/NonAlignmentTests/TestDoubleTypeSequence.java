import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestDoubleTypeSequenceNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.DoubleType[] v = new IntegrationWithExternalNotAligned.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.DoubleType((byte) 12, (char) ('A' + i));
        }

        IntegrationWithExternalNotAligned.DoubleTypeSequence data = new IntegrationWithExternalNotAligned.DoubleTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.DoubleType[] v = new IntegrationWithExternalNotAligned.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.DoubleType((byte) 12, 3333);
        }

        IntegrationWithExternalNotAligned.DoubleTypeSequence data = new IntegrationWithExternalNotAligned.DoubleTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.DoubleType[] v = new IntegrationWithExternalNotAligned.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.DoubleType((byte) 12, 45333);
        }

        IntegrationWithExternalNotAligned.DoubleTypeSequence data = new IntegrationWithExternalNotAligned.DoubleTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.DoubleType[] v = new IntegrationWithExternalNotAligned.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.DoubleType((byte) 12, (char) ('A' + i));
        }

        IntegrationWithExternalNotAligned.DoubleTypeSequence data = new IntegrationWithExternalNotAligned.DoubleTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.DoubleType[] v = new IntegrationWithExternalNotAligned.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.DoubleType((byte) 12, 3333);
        }

        IntegrationWithExternalNotAligned.DoubleTypeSequence data = new IntegrationWithExternalNotAligned.DoubleTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.DoubleType[] v = new IntegrationWithExternalNotAligned.DoubleType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.DoubleType((byte) 12, 45333);
        }

        IntegrationWithExternalNotAligned.DoubleTypeSequence data = new IntegrationWithExternalNotAligned.DoubleTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.id());
    }


}