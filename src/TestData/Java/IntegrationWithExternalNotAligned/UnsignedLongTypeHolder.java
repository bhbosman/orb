package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/UnsignedLongTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class UnsignedLongTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.UnsignedLongType value = null;

  public UnsignedLongTypeHolder ()
  {
  }

  public UnsignedLongTypeHolder (IntegrationWithExternalNotAligned.UnsignedLongType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.UnsignedLongTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.UnsignedLongTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.UnsignedLongTypeHelper.type ();
  }

}
