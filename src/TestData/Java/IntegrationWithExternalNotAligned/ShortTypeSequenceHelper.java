package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/ShortTypeSequenceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

abstract public class ShortTypeSequenceHelper
{
  private static String  _id = "IDL:IntegrationWithExternalNotAligned/ShortTypeSequence:1.0";

  public static void insert (org.omg.CORBA.Any a, IntegrationWithExternalNotAligned.ShortTypeSequence that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IntegrationWithExternalNotAligned.ShortTypeSequence extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = IntegrationWithExternalNotAligned.ShortTypeHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (IntegrationWithExternalNotAligned.ShortTypeSeqHelper.id (), "ShortTypeSeq", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "Seq",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (IntegrationWithExternalNotAligned.ShortTypeSequenceHelper.id (), "ShortTypeSequence", _members0);
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

  public static IntegrationWithExternalNotAligned.ShortTypeSequence read (org.omg.CORBA.portable.InputStream istream)
  {
    IntegrationWithExternalNotAligned.ShortTypeSequence value = new IntegrationWithExternalNotAligned.ShortTypeSequence ();
    value.dummy = istream.read_octet ();
    value.Seq = IntegrationWithExternalNotAligned.ShortTypeSeqHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IntegrationWithExternalNotAligned.ShortTypeSequence value)
  {
    ostream.write_octet (value.dummy);
    IntegrationWithExternalNotAligned.ShortTypeSeqHelper.write (ostream, value.Seq);
  }

}
