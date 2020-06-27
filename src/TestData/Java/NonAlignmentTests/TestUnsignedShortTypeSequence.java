import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestUnsignedShortTypeSequenceNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.UnsignedShortType[] v = new IntegrationWithExternalNotAligned.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedShortType((byte) 12, (short) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedShortTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.UnsignedShortType[] v = new IntegrationWithExternalNotAligned.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedShortType((byte) 12, (short) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedShortTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.UnsignedShortType[] v = new IntegrationWithExternalNotAligned.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedShortType((byte) 12, (short) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedShortTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.UnsignedShortType[] v = new IntegrationWithExternalNotAligned.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedShortType((byte) 12, (short) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedShortTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.UnsignedShortType[] v = new IntegrationWithExternalNotAligned.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedShortType((byte) 12, (short) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedShortTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.UnsignedShortType[] v = new IntegrationWithExternalNotAligned.UnsignedShortType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.UnsignedShortType((byte) 12, (short) ('A' + i));
        }
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequence data = new IntegrationWithExternalNotAligned.UnsignedShortTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.UnsignedShortTypeSequenceHelper.id());
    }


}