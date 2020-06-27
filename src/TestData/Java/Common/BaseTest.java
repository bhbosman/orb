import com.sun.corba.se.impl.encoding.ByteBufferWithInfo;
import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.impl.orb.ORBSingleton;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class BaseTest {
    public EncapsOutputStream CreateOutputStream(boolean isLittleEndian, GIOPVersion version) {
        ORBSingleton orb = new ORBSingleton();
        return new EncapsOutputStream(orb, version, isLittleEndian);
    }

    public void SaveData(boolean isLittleEndian, GIOPVersion giopVersion, ByteBufferWithInfo byteBufferWithInfo, String id) throws IOException {
        int n = byteBufferWithInfo.getSize();
        byte[] a = byteBufferWithInfo.byteBuffer.array();
        byte[] dst = Arrays.copyOf(a, n);
        String hex = javax.xml.bind.DatatypeConverter.printHexBinary(dst);
        id = id
                .replace('/', '_')
                .replace(':', '_');

        String fileName = String.format("./Data/giop.%d.%d.%s.%s.txt",
                giopVersion.getMajor(),
                giopVersion.getMinor(),
                isLittleEndian,
                id);

        try(FileWriter fileWriter = new FileWriter(fileName, false))
        {
            fileWriter.append(hex);
        }
    }
}
