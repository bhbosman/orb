package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/UnsignedLongTypeArrayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class UnsignedLongTypeArrayHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.UnsignedLongTypeArray value = null;

  public UnsignedLongTypeArrayHolder ()
  {
  }

  public UnsignedLongTypeArrayHolder (IntegrationWithExternalNotAligned.UnsignedLongTypeArray initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.UnsignedLongTypeArrayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.UnsignedLongTypeArrayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.UnsignedLongTypeArrayHelper.type ();
  }

}
