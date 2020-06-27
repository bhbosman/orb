import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestBooleanTypeArray extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        boolean[] v = new boolean[16];
        for (int i = 0; i < 16; i++) {
            v[i] = true;
        }

        IntegrationWithExternal.BooleanTypeArray data = new IntegrationWithExternal.BooleanTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(false, GIOPVersion.V1_0);
        IntegrationWithExternal.BooleanTypeArrayHelper.write(outputStream, data);
        SaveData(false, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        boolean[] v = new boolean[16];
        for (int i = 0; i < 16; i++) {
            v[i] = true;
        }

        IntegrationWithExternal.BooleanTypeArray data = new IntegrationWithExternal.BooleanTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(false, GIOPVersion.V1_1);
        IntegrationWithExternal.BooleanTypeArrayHelper.write(outputStream, data);
        SaveData(false, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        boolean[] v = new boolean[16];
        for (int i = 0; i < 16; i++) {
            v[i] = true;
        }

        IntegrationWithExternal.BooleanTypeArray data = new IntegrationWithExternal.BooleanTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(false, GIOPVersion.V1_2);
        IntegrationWithExternal.BooleanTypeArrayHelper.write(outputStream, data);
        SaveData(false, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        boolean[] v = new boolean[16];
        for (int i = 0; i < 16; i++) {
            v[i] = true;
        }

        IntegrationWithExternal.BooleanTypeArray data = new IntegrationWithExternal.BooleanTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(true, GIOPVersion.V1_0);
        IntegrationWithExternal.BooleanTypeArrayHelper.write(outputStream, data);
        SaveData(true, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        boolean[] v = new boolean[16];
        for (int i = 0; i < 16; i++) {
            v[i] = true;
        }

        IntegrationWithExternal.BooleanTypeArray data = new IntegrationWithExternal.BooleanTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(true, GIOPVersion.V1_1);
        IntegrationWithExternal.BooleanTypeArrayHelper.write(outputStream, data);
        SaveData(true, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        boolean[] v = new boolean[16];
        for (int i = 0; i < 16; i++) {
            v[i] = true;
        }

        IntegrationWithExternal.BooleanTypeArray data = new IntegrationWithExternal.BooleanTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(true, GIOPVersion.V1_2);
        IntegrationWithExternal.BooleanTypeArrayHelper.write(outputStream, data);
        SaveData(true, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeArrayHelper.id());
    }


}