package IntegrationWithExternal;


/**
* IntegrationWithExternal/FloatTypeSequenceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

abstract public class FloatTypeSequenceHelper
{
  private static String  _id = "IDL:IntegrationWithExternal/FloatTypeSequence:1.0";

  public static void insert (org.omg.CORBA.Any a, IntegrationWithExternal.FloatTypeSequence that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IntegrationWithExternal.FloatTypeSequence extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = IntegrationWithExternal.FloatTypeHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (IntegrationWithExternal.FloatTypeSeqHelper.id (), "FloatTypeSeq", _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "Seq",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (IntegrationWithExternal.FloatTypeSequenceHelper.id (), "FloatTypeSequence", _members0);
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

  public static IntegrationWithExternal.FloatTypeSequence read (org.omg.CORBA.portable.InputStream istream)
  {
    IntegrationWithExternal.FloatTypeSequence value = new IntegrationWithExternal.FloatTypeSequence ();
    value.Seq = IntegrationWithExternal.FloatTypeSeqHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IntegrationWithExternal.FloatTypeSequence value)
  {
    IntegrationWithExternal.FloatTypeSeqHelper.write (ostream, value.Seq);
  }

}