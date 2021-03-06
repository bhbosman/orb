package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/IIntegrationWithExternalNotAlignedHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

abstract public class IIntegrationWithExternalNotAlignedHelper
{
  private static String  _id = "IDL:IntegrationWithExternalNotAligned/IIntegrationWithExternalNotAligned:1.0";

  public static void insert (org.omg.CORBA.Any a, IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAligned that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAligned extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAlignedHelper.id (), "IIntegrationWithExternalNotAligned");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAligned read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_IIntegrationWithExternalNotAlignedStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAligned value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAligned narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAligned)
      return (IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAligned)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      IntegrationWithExternalNotAligned._IIntegrationWithExternalNotAlignedStub stub = new IntegrationWithExternalNotAligned._IIntegrationWithExternalNotAlignedStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAligned unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAligned)
      return (IntegrationWithExternalNotAligned.IIntegrationWithExternalNotAligned)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      IntegrationWithExternalNotAligned._IIntegrationWithExternalNotAlignedStub stub = new IntegrationWithExternalNotAligned._IIntegrationWithExternalNotAlignedStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
