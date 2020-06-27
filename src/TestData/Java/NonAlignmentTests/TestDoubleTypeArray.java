import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class TestDoubleTypeArrayNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (double) (101010 + i);
        }

        IntegrationWithExternalNotAligned.DoubleTypeArray data = new IntegrationWithExternalNotAligned.DoubleTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = 78787;
        }

        IntegrationWithExternalNotAligned.DoubleTypeArray data = new IntegrationWithExternalNotAligned.DoubleTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = 33333;
        }

        IntegrationWithExternalNotAligned.DoubleTypeArray data = new IntegrationWithExternalNotAligned.DoubleTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = (double) (101010 + i);
        }

        IntegrationWithExternalNotAligned.DoubleTypeArray data = new IntegrationWithExternalNotAligned.DoubleTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = 78787;
        }

        IntegrationWithExternalNotAligned.DoubleTypeArray data = new IntegrationWithExternalNotAligned.DoubleTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        double[] v = new double[16];
        for (int i = 0; i < 16; i++) {
            v[i] = 33333;
        }

        IntegrationWithExternalNotAligned.DoubleTypeArray data = new IntegrationWithExternalNotAligned.DoubleTypeArray((byte) 12, v);
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.id());
    }


}