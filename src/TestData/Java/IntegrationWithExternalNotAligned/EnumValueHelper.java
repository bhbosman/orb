package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/EnumValueHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

abstract public class EnumValueHelper
{
  private static String  _id = "IDL:IntegrationWithExternalNotAligned/EnumValue:1.0";

  public static void insert (org.omg.CORBA.Any a, IntegrationWithExternalNotAligned.EnumValue that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IntegrationWithExternalNotAligned.EnumValue extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (IntegrationWithExternalNotAligned.EnumValueHelper.id (), "EnumValue", new String[] { "ValueA", "ValueB"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static IntegrationWithExternalNotAligned.EnumValue read (org.omg.CORBA.portable.InputStream istream)
  {
    return IntegrationWithExternalNotAligned.EnumValue.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IntegrationWithExternalNotAligned.EnumValue value)
  {
    ostream.write_long (value.value ());
  }

}
