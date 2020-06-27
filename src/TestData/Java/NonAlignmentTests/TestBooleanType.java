import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class TestBooleanTypeNonAlignment extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        IntegrationWithExternalNotAligned.BooleanType data = new IntegrationWithExternalNotAligned.BooleanType((byte) 12, true);
        EncapsOutputStream outputStream = CreateOutputStream(false, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.BooleanTypeHelper.write(outputStream, data);
        SaveData(false, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.BooleanTypeHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        IntegrationWithExternalNotAligned.BooleanType data = new IntegrationWithExternalNotAligned.BooleanType((byte) 12, true);
        EncapsOutputStream outputStream = CreateOutputStream(false, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.BooleanTypeHelper.write(outputStream, data);
        SaveData(false, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.BooleanTypeHelper.id());
    }


    @Test
    public void TestBigEndianV1_2() throws IOException {
        IntegrationWithExternalNotAligned.BooleanType data = new IntegrationWithExternalNotAligned.BooleanType((byte) 12, true);
        EncapsOutputStream outputStream = CreateOutputStream(false, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.BooleanTypeHelper.write(outputStream, data);
        SaveData(false, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.BooleanTypeHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        IntegrationWithExternalNotAligned.BooleanType data = new IntegrationWithExternalNotAligned.BooleanType((byte) 12, true);
        EncapsOutputStream outputStream = CreateOutputStream(true, GIOPVersion.V1_0);
        IntegrationWithExternalNotAligned.BooleanTypeHelper.write(outputStream, data);
        SaveData(true, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.BooleanTypeHelper.id());
    }


    @Test
    public void TestLittleEndianV1_1() throws IOException {
        IntegrationWithExternalNotAligned.BooleanType data = new IntegrationWithExternalNotAligned.BooleanType((byte) 12, true);
        EncapsOutputStream outputStream = CreateOutputStream(true, GIOPVersion.V1_1);
        IntegrationWithExternalNotAligned.BooleanTypeHelper.write(outputStream, data);
        SaveData(true, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.BooleanTypeHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        IntegrationWithExternalNotAligned.BooleanType data = new IntegrationWithExternalNotAligned.BooleanType((byte) 12, true);
        EncapsOutputStream outputStream = CreateOutputStream(true, GIOPVersion.V1_2);
        IntegrationWithExternalNotAligned.BooleanTypeHelper.write(outputStream, data);
        SaveData(true, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternalNotAligned.BooleanTypeHelper.id());
    }
}