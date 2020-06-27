import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestEnumValueTypeArray extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        IntegrationWithExternal.EnumValue[] v = new IntegrationWithExternal.EnumValue[16];
        for (int i = 0; i < 16; i++) {
            v[i] = IntegrationWithExternal.EnumValue.ValueA;
        }

        IntegrationWithExternal.EnumValueArray data = new IntegrationWithExternal.EnumValueArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.EnumValueArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.EnumValueArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.EnumValue[] v = new IntegrationWithExternal.EnumValue[16];
        for (int i = 0; i < 16; i++) {
            v[i] = IntegrationWithExternal.EnumValue.ValueA;
        }

        IntegrationWithExternal.EnumValueArray data = new IntegrationWithExternal.EnumValueArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.EnumValueArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.EnumValueArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.EnumValue[] v = new IntegrationWithExternal.EnumValue[16];
        for (int i = 0; i < 16; i++) {
            v[i] = IntegrationWithExternal.EnumValue.ValueA;
        }

        IntegrationWithExternal.EnumValueArray data = new IntegrationWithExternal.EnumValueArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.EnumValueArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.EnumValueArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.EnumValue[] v = new IntegrationWithExternal.EnumValue[16];
        for (int i = 0; i < 16; i++) {
            v[i] = IntegrationWithExternal.EnumValue.ValueA;
        }

        IntegrationWithExternal.EnumValueArray data = new IntegrationWithExternal.EnumValueArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.EnumValueArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.EnumValueArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.EnumValue[] v = new IntegrationWithExternal.EnumValue[16];
        for (int i = 0; i < 16; i++) {
            v[i] = IntegrationWithExternal.EnumValue.ValueA;
        }

        IntegrationWithExternal.EnumValueArray data = new IntegrationWithExternal.EnumValueArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.EnumValueArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.EnumValueArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.EnumValue[] v = new IntegrationWithExternal.EnumValue[16];
        for (int i = 0; i < 16; i++) {
            v[i] = IntegrationWithExternal.EnumValue.ValueA;
        }

        IntegrationWithExternal.EnumValueArray data = new IntegrationWithExternal.EnumValueArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.EnumValueArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.EnumValueArrayHelper.id());
    }


}