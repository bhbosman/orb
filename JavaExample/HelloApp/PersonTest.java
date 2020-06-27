package HelloApp;

import com.sun.corba.se.impl.corba.AnyImpl;
import com.sun.corba.se.impl.corba.AnyImplHelper;
import com.sun.corba.se.impl.encoding.CDROutputStream;
import com.sun.corba.se.impl.encoding.CDROutputStream_1_2;
import com.sun.corba.se.impl.encoding.EncapsOutputStream;
import com.sun.corba.se.impl.orb.ORBSingleton;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
//import com.google.common.io.BaseEncoding;
import static org.junit.jupiter.api.Assertions.*;
//import org.apache.commons.codec.binary.Hex;
class PersonTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void dddd() throws IOException {
        Person person = new Person("d", "d");





        ORBSingleton orb = new ORBSingleton();
//        AnyImpl AnyImpl = new AnyImpl(orb);
//        OutputStream outputStream = AnyImpl.create_output_stream();
        EncapsOutputStream outputStream = new EncapsOutputStream(orb, GIOPVersion.V1_2, false);
        for (int i = 0; i < 1000; i++) {
            PersonHelper.write(outputStream, person);
        }

        outputStream.flush();
        int n = outputStream.getByteBufferWithInfo().getSize();
        byte[] a = outputStream.getByteBufferWithInfo().byteBuffer.array();
        byte[] dst = Arrays.copyOf(a, n);
        System.out.println(Arrays.toString(dst));
//        final String hex = BaseEncoding.base16().lowerCase().encode(dst);
        String hex = javax.xml.bind.DatatypeConverter.printHexBinary(a);
        System.out.println(hex);




    }
}