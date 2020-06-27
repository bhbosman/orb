package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/StringTypeArrayHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

abstract public class StringTypeArrayHelper
{
  private static String  _id = "IDL:IntegrationWithExternalNotAligned/StringTypeArray:1.0";

  public static void insert (org.omg.CORBA.Any a, IntegrationWithExternalNotAligned.StringTypeArray that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IntegrationWithExternalNotAligned.StringTypeArray extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_octet);
          _members0[0] = new org.omg.CORBA.StructMember (
            "dummy",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_array_tc (16, _tcOf_members0 );
          _members0[1] = new org.omg.CORBA.StructMember (
            "Value",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (IntegrationWithExternalNotAligned.StringTypeArrayHelper.id (), "StringTypeArray", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static IntegrationWithExternalNotAligned.StringTypeArray read (org.omg.CORBA.portable.InputStream istream)
  {
    IntegrationWithExternalNotAligned.StringTypeArray value = new IntegrationWithExternalNotAligned.StringTypeArray ();
    value.dummy = istream.read_octet ();
    value.Value = new String[16];
    for (int _o0 = 0;_o0 < (16); ++_o0)
    {
      value.Value[_o0] = istream.read_string ();
    }
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IntegrationWithExternalNotAligned.StringTypeArray value)
  {
    ostream.write_octet (value.dummy);
    if (value.Value.length != (16))
      throw new org.omg.CORBA.MARSHAL (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    for (int _i0 = 0;_i0 < (16); ++_i0)
    {
      ostream.write_string (value.Value[_i0]);
    }
  }

}
