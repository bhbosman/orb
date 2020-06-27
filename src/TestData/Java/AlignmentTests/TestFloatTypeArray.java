import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestFloatTypeArray extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        float[] v = new float[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (float)('A' + i);
        }

        IntegrationWithExternal.FloatTypeArray data = new IntegrationWithExternal.FloatTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.FloatTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.FloatTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        float[] v = new float[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (float)('A' + i);
        }

        IntegrationWithExternal.FloatTypeArray data = new IntegrationWithExternal.FloatTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.FloatTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.FloatTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        float[] v = new float[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (float)('A' + i);
        }

        IntegrationWithExternal.FloatTypeArray data = new IntegrationWithExternal.FloatTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.FloatTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.FloatTypeArrayHelper.id());
    }








    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        float[] v = new float[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (float)('A' + i);
        }

        IntegrationWithExternal.FloatTypeArray data = new IntegrationWithExternal.FloatTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.FloatTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.FloatTypeArrayHelper.id());
    }
    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        float[] v = new float[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (float)('A' + i);
        }

        IntegrationWithExternal.FloatTypeArray data = new IntegrationWithExternal.FloatTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.FloatTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.FloatTypeArrayHelper.id());
    }
    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        float[] v = new float[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (float)('A' + i);
        }

        IntegrationWithExternal.FloatTypeArray data = new IntegrationWithExternal.FloatTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.FloatTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.FloatTypeArrayHelper.id());
    }







}