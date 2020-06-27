package IntegrationWithExternal;


/**
* IntegrationWithExternal/WideStringTypeArrayHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:22 PM SAST
*/

abstract public class WideStringTypeArrayHelper
{
  private static String  _id = "IDL:IntegrationWithExternal/WideStringTypeArray:1.0";

  public static void insert (org.omg.CORBA.Any a, IntegrationWithExternal.WideStringTypeArray that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IntegrationWithExternal.WideStringTypeArray extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_wstring_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_array_tc (16, _tcOf_members0 );
          _members0[0] = new org.omg.CORBA.StructMember (
            "Value",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (IntegrationWithExternal.WideStringTypeArrayHelper.id (), "WideStringTypeArray", _members0);
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

  public static IntegrationWithExternal.WideStringTypeArray read (org.omg.CORBA.portable.InputStream istream)
  {
    IntegrationWithExternal.WideStringTypeArray value = new IntegrationWithExternal.WideStringTypeArray ();
    value.Value = new String[16];
    for (int _o0 = 0;_o0 < (16); ++_o0)
    {
      value.Value[_o0] = istream.read_wstring ();
    }
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IntegrationWithExternal.WideStringTypeArray value)
  {
    if (value.Value.length != (16))
      throw new org.omg.CORBA.MARSHAL (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    for (int _i0 = 0;_i0 < (16); ++_i0)
    {
      ostream.write_wstring (value.Value[_i0]);
    }
  }

}
