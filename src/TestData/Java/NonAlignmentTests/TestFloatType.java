import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class TestFloatTypeNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.FloatType data = new IntegrationWithExternalNotAligned.FloatType((byte) 12, 'A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.FloatTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.FloatTypeHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.FloatType data = new IntegrationWithExternalNotAligned.FloatType((byte) 12, 'A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.FloatTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.FloatTypeHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternalNotAligned.FloatType data = new IntegrationWithExternalNotAligned.FloatType((byte) 12, 'A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.FloatTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.FloatTypeHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.FloatType data = new IntegrationWithExternalNotAligned.FloatType((byte) 12, 'A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.FloatTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.FloatTypeHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.FloatType data = new IntegrationWithExternalNotAligned.FloatType((byte) 12, 'A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.FloatTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.FloatTypeHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternalNotAligned.FloatType data = new IntegrationWithExternalNotAligned.FloatType((byte) 12, 'A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.FloatTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.FloatTypeHelper.id());
    }


}