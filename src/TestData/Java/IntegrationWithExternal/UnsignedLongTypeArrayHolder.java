package IntegrationWithExternal;

/**
* IntegrationWithExternal/UnsignedLongTypeArrayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class UnsignedLongTypeArrayHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.UnsignedLongTypeArray value = null;

  public UnsignedLongTypeArrayHolder ()
  {
  }

  public UnsignedLongTypeArrayHolder (IntegrationWithExternal.UnsignedLongTypeArray initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.UnsignedLongTypeArrayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.UnsignedLongTypeArrayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.UnsignedLongTypeArrayHelper.type ();
  }

}