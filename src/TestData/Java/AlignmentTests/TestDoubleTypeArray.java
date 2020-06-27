import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestDoubleTypeArray extends BaseTest{
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (double)(101010 + i);
        }

        IntegrationWithExternal.DoubleTypeArray data = new IntegrationWithExternal.DoubleTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = 78787;
        }

        IntegrationWithExternal.DoubleTypeArray data = new IntegrationWithExternal.DoubleTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeArrayHelper.id());
    }
    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = 33333;
        }

        IntegrationWithExternal.DoubleTypeArray data = new IntegrationWithExternal.DoubleTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (double) (101010 + i);
        }

        IntegrationWithExternal.DoubleTypeArray data = new IntegrationWithExternal.DoubleTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = 78787;
        }

        IntegrationWithExternal.DoubleTypeArray data = new IntegrationWithExternal.DoubleTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = 33333;
        }

        IntegrationWithExternal.DoubleTypeArray data = new IntegrationWithExternal.DoubleTypeArray(v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeArrayHelper.id());
    }


}