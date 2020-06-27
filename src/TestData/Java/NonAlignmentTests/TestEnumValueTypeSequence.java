import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestEnumValueTypeSequenceNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.EnumValueType[] v = new IntegrationWithExternalNotAligned.EnumValueType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.EnumValueType((byte) 12, IntegrationWithExternalNotAligned.EnumValue.ValueA);
        }

        IntegrationWithExternalNotAligned.EnumValueTypeSequence data = new IntegrationWithExternalNotAligned.EnumValueTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.EnumValueType[] v = new IntegrationWithExternalNotAligned.EnumValueType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.EnumValueType((byte) 12, IntegrationWithExternalNotAligned.EnumValue.ValueA);
        }

        IntegrationWithExternalNotAligned.EnumValueTypeSequence data = new IntegrationWithExternalNotAligned.EnumValueTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.EnumValueType[] v = new IntegrationWithExternalNotAligned.EnumValueType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.EnumValueType((byte) 12, IntegrationWithExternalNotAligned.EnumValue.ValueA);
        }

        IntegrationWithExternalNotAligned.EnumValueTypeSequence data = new IntegrationWithExternalNotAligned.EnumValueTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.EnumValueType[] v = new IntegrationWithExternalNotAligned.EnumValueType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.EnumValueType((byte) 12, IntegrationWithExternalNotAligned.EnumValue.ValueA);
        }

        IntegrationWithExternalNotAligned.EnumValueTypeSequence data = new IntegrationWithExternalNotAligned.EnumValueTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.EnumValueType[] v = new IntegrationWithExternalNotAligned.EnumValueType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.EnumValueType((byte) 12, IntegrationWithExternalNotAligned.EnumValue.ValueA);
        }

        IntegrationWithExternalNotAligned.EnumValueTypeSequence data = new IntegrationWithExternalNotAligned.EnumValueTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.EnumValueType[] v = new IntegrationWithExternalNotAligned.EnumValueType[32];
        for (int i = 0; i < 32; i++) {
            v[i] = new IntegrationWithExternalNotAligned.EnumValueType((byte) 12, IntegrationWithExternalNotAligned.EnumValue.ValueA);
        }

        IntegrationWithExternalNotAligned.EnumValueTypeSequence data = new IntegrationWithExternalNotAligned.EnumValueTypeSequence((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.EnumValueTypeSequenceHelper.id());
    }

}