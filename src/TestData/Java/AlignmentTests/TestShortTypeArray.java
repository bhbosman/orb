import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestShortTypeArray extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        short[] v = new short[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (short) 0x1234;
        }

        IntegrationWithExternal.ShortTypeArray data = new IntegrationWithExternal.ShortTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.ShortTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.ShortTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        short[] v = new short[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (short) 0x1234;
        }

        IntegrationWithExternal.ShortTypeArray data = new IntegrationWithExternal.ShortTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.ShortTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.ShortTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        short[] v = new short[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (short) 0x1234;
        }

        IntegrationWithExternal.ShortTypeArray data = new IntegrationWithExternal.ShortTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.ShortTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.ShortTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        short[] v = new short[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (short) 0x1234;
        }

        IntegrationWithExternal.ShortTypeArray data = new IntegrationWithExternal.ShortTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.ShortTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.ShortTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        short[] v = new short[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (short) 0x1234;
        }

        IntegrationWithExternal.ShortTypeArray data = new IntegrationWithExternal.ShortTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.ShortTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.ShortTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        short[] v = new short[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (short) 0x1234;
        }

        IntegrationWithExternal.ShortTypeArray data = new IntegrationWithExternal.ShortTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.ShortTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.ShortTypeArrayHelper.id());
    }


}