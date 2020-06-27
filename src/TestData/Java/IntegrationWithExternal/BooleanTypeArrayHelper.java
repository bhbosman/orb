package IntegrationWithExternal;


/**
* IntegrationWithExternal/BooleanTypeArrayHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

abstract public class BooleanTypeArrayHelper
{
  private static String  _id = "IDL:IntegrationWithExternal/BooleanTypeArray:1.0";

  public static void insert (org.omg.CORBA.Any a, IntegrationWithExternal.BooleanTypeArray that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IntegrationWithExternal.BooleanTypeArray extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_boolean);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_array_tc (16, _tcOf_members0 );
          _members0[0] = new org.omg.CORBA.StructMember (
            "Value",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (IntegrationWithExternal.BooleanTypeArrayHelper.id (), "BooleanTypeArray", _members0);
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

  public static IntegrationWithExternal.BooleanTypeArray read (org.omg.CORBA.portable.InputStream istream)
  {
    IntegrationWithExternal.BooleanTypeArray value = new IntegrationWithExternal.BooleanTypeArray ();
    value.Value = new boolean[16];
    for (int _o0 = 0;_o0 < (16); ++_o0)
    {
      value.Value[_o0] = istream.read_boolean ();
    }
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IntegrationWithExternal.BooleanTypeArray value)
  {
    if (value.Value.length != (16))
      throw new org.omg.CORBA.MARSHAL (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    for (int _i0 = 0;_i0 < (16); ++_i0)
    {
      ostream.write_boolean (value.Value[_i0]);
    }
  }

}
