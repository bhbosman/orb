package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/EnumValueArrayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class EnumValueArrayHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.EnumValueArray value = null;

  public EnumValueArrayHolder ()
  {
  }

  public EnumValueArrayHolder (IntegrationWithExternalNotAligned.EnumValueArray initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.EnumValueArrayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.EnumValueArrayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.EnumValueArrayHelper.type ();
  }

}