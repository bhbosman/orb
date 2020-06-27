import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestOctetTypeSequenceNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.OctetType[] v = new IntegrationWithExternalNotAligned.OctetType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.OctetType((byte) 12, (byte) ('A' + i));
        }
        IntegrationWithExternalNotAligned.OctetTypeSequence data = new IntegrationWithExternalNotAligned.OctetTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.OctetType[] v = new IntegrationWithExternalNotAligned.OctetType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.OctetType((byte) 12, (byte) ('A' + i));
        }
        IntegrationWithExternalNotAligned.OctetTypeSequence data = new IntegrationWithExternalNotAligned.OctetTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.OctetType[] v = new IntegrationWithExternalNotAligned.OctetType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.OctetType((byte) 12, (byte) ('A' + i));
        }
        IntegrationWithExternalNotAligned.OctetTypeSequence data = new IntegrationWithExternalNotAligned.OctetTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.OctetType[] v = new IntegrationWithExternalNotAligned.OctetType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.OctetType((byte) 12, (byte) ('A' + i));
        }
        IntegrationWithExternalNotAligned.OctetTypeSequence data = new IntegrationWithExternalNotAligned.OctetTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.OctetType[] v = new IntegrationWithExternalNotAligned.OctetType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.OctetType((byte) 12, (byte) ('A' + i));
        }
        IntegrationWithExternalNotAligned.OctetTypeSequence data = new IntegrationWithExternalNotAligned.OctetTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.OctetType[] v = new IntegrationWithExternalNotAligned.OctetType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.OctetType((byte) 12, (byte) ('A' + i));
        }
        IntegrationWithExternalNotAligned.OctetTypeSequence data = new IntegrationWithExternalNotAligned.OctetTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.OctetTypeSequenceHelper.id());
    }


}