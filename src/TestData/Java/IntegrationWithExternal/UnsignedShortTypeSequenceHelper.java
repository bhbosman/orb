package IntegrationWithExternal;


/**
* IntegrationWithExternal/UnsignedShortTypeSequenceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:22 PM SAST
*/

abstract public class UnsignedShortTypeSequenceHelper
{
  private static String  _id = "IDL:IntegrationWithExternal/UnsignedShortTypeSequence:1.0";

  public static void insert (org.omg.CORBA.Any a, IntegrationWithExternal.UnsignedShortTypeSequence that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IntegrationWithExternal.UnsignedShortTypeSequence extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = IntegrationWithExternal.UnsignedShortTypeHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (IntegrationWithExternal.UnsignedShortTypeSeqHelper.id (), "UnsignedShortTypeSeq", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "Seq",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (IntegrationWithExternal.UnsignedShortTypeSequenceHelper.id (), "UnsignedShortTypeSequence", _members0);
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

  public static IntegrationWithExternal.UnsignedShortTypeSequence read (org.omg.CORBA.portable.InputStream istream)
  {
    IntegrationWithExternal.UnsignedShortTypeSequence value = new IntegrationWithExternal.UnsignedShortTypeSequence ();
    value.Seq = IntegrationWithExternal.UnsignedShortTypeSeqHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IntegrationWithExternal.UnsignedShortTypeSequence value)
  {
    IntegrationWithExternal.UnsignedShortTypeSeqHelper.write (ostream, value.Seq);
  }

}
