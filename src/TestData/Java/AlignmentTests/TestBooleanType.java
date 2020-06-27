import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;
import java.io.IOException;

class TestBooleanType extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
        IntegrationWithExternal.BooleanType data = new IntegrationWithExternal.BooleanType(true);
        EncapsOutputStream outputStream = CreateOutputStream(false, GIOPVersion.V1_0);
        IntegrationWithExternal.BooleanTypeHelper.write(outputStream, data);
        SaveData(false, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeHelper.id());
    }

    @Test
    public void TestBigEndianV1_1() throws IOException {
        IntegrationWithExternal.BooleanType data = new IntegrationWithExternal.BooleanType(true);
        EncapsOutputStream outputStream = CreateOutputStream(false, GIOPVersion.V1_1);
        IntegrationWithExternal.BooleanTypeHelper.write(outputStream, data);
        SaveData(false, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        IntegrationWithExternal.BooleanType data = new IntegrationWithExternal.BooleanType(true);
        EncapsOutputStream outputStream = CreateOutputStream(false, GIOPVersion.V1_2);
        IntegrationWithExternal.BooleanTypeHelper.write(outputStream, data);
        SaveData(false, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeHelper.id());
    }


    @Test
    public void TestLittleEndianV1_0() throws IOException {
        IntegrationWithExternal.BooleanType data = new IntegrationWithExternal.BooleanType(true);
        EncapsOutputStream outputStream = CreateOutputStream(true, GIOPVersion.V1_0);
        IntegrationWithExternal.BooleanTypeHelper.write(outputStream, data);
        SaveData(true, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        IntegrationWithExternal.BooleanType data = new IntegrationWithExternal.BooleanType(true);
        EncapsOutputStream outputStream = CreateOutputStream(true, GIOPVersion.V1_1);
        IntegrationWithExternal.BooleanTypeHelper.write(outputStream, data);
        SaveData(true, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        IntegrationWithExternal.BooleanType data = new IntegrationWithExternal.BooleanType(true);
        EncapsOutputStream outputStream = CreateOutputStream(true, GIOPVersion.V1_2);
        IntegrationWithExternal.BooleanTypeHelper.write(outputStream, data);
        SaveData(true, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.BooleanTypeHelper.id());
    }
}