import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class TestDoubleType extends BaseTest {
    @Test
    public void TestBigEndianV1_0() throws IOException {
       boolean isLittleEndian = false;
        IntegrationWithExternal.DoubleType data = new IntegrationWithExternal.DoubleType('A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.DoubleTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeHelper.id());
    }
    @Test
    public void TestBigEndianV1_1() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.DoubleType data = new IntegrationWithExternal.DoubleType('A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.DoubleTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeHelper.id());
    }

    @Test
    public void TestBigEndianV1_2() throws IOException {
        boolean isLittleEndian = false;
        IntegrationWithExternal.DoubleType data = new IntegrationWithExternal.DoubleType('A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.DoubleTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeHelper.id());
    }

    @Test
    public void TestLittleEndianV1_0() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.DoubleType data = new IntegrationWithExternal.DoubleType('A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_0);
        IntegrationWithExternal.DoubleTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeHelper.id());
    }

    @Test
    public void TestLittleEndianV1_1() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.DoubleType data = new IntegrationWithExternal.DoubleType('A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_1);
        IntegrationWithExternal.DoubleTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeHelper.id());
    }

    @Test
    public void TestLittleEndianV1_2() throws IOException {
        boolean isLittleEndian = true;
        IntegrationWithExternal.DoubleType data = new IntegrationWithExternal.DoubleType('A');
        EncapsOutputStream outputStream = CreateOutputStream(isLittleEndian, GIOPVersion.V1_2);
        IntegrationWithExternal.DoubleTypeHelper.write(outputStream, data);
        SaveData(isLittleEndian, outputStream.getGIOPVersion(), outputStream.getByteBufferWithInfo(), IntegrationWithExternal.DoubleTypeHelper.id());
    }


}