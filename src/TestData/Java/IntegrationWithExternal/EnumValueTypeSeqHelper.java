package IntegrationWithExternal;


/**
* IntegrationWithExternal/EnumValueTypeSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

abstract public class EnumValueTypeSeqHelper
{
  private static String  _id = "IDL:IntegrationWithExternal/EnumValueTypeSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, IntegrationWithExternal.EnumValueType[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IntegrationWithExternal.EnumValueType[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = IntegrationWithExternal.EnumValueTypeHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (IntegrationWithExternal.EnumValueTypeSeqHelper.id (), "EnumValueTypeSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static IntegrationWithExternal.EnumValueType[] read (org.omg.CORBA.portable.InputStream istream)
  {
    IntegrationWithExternal.EnumValueType value[] = null;
    int _len0 = istream.read_long ();
    value = new IntegrationWithExternal.EnumValueType[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = IntegrationWithExternal.EnumValueTypeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IntegrationWithExternal.EnumValueType[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      IntegrationWithExternal.EnumValueTypeHelper.write (ostream, value[_i0]);
  }

}
