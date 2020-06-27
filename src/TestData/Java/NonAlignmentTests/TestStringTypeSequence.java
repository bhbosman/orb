import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestStringTypeSequenceNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.StringType[] v = new IntegrationWithExternalNotAligned.StringType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.StringType((byte) 12, "ABCDEFFHI");
        }

        IntegrationWithExternalNotAligned.StringTypeSequence data = new IntegrationWithExternalNotAligned.StringTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.StringTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.StringTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.StringType[] v = new IntegrationWithExternalNotAligned.StringType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.StringType((byte) 12, "ABCDEFFHI");
        }

        IntegrationWithExternalNotAligned.StringTypeSequence data = new IntegrationWithExternalNotAligned.StringTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.StringTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.StringTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.StringType[] v = new IntegrationWithExternalNotAligned.StringType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.StringType((byte) 12, "ABCDEFFHI");
        }

        IntegrationWithExternalNotAligned.StringTypeSequence data = new IntegrationWithExternalNotAligned.StringTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.StringTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.StringTypeSequenceHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.StringType[] v = new IntegrationWithExternalNotAligned.StringType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.StringType((byte) 12, "ABCDEFFHI");
        }

        IntegrationWithExternalNotAligned.StringTypeSequence data = new IntegrationWithExternalNotAligned.StringTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.StringTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.StringTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.StringType[] v = new IntegrationWithExternalNotAligned.StringType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.StringType((byte) 12, "ABCDEFFHI");
        }

        IntegrationWithExternalNotAligned.StringTypeSequence data = new IntegrationWithExternalNotAligned.StringTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.StringTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.StringTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.StringType[] v = new IntegrationWithExternalNotAligned.StringType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.StringType((byte) 12, "ABCDEFFHI");
        }

        IntegrationWithExternalNotAligned.StringTypeSequence data = new IntegrationWithExternalNotAligned.StringTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.StringTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.StringTypeSequenceHelper.id());
    }


}