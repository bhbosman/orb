package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/LongLongTypeArrayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class LongLongTypeArrayHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.LongLongTypeArray value = null;

  public LongLongTypeArrayHolder ()
  {
  }

  public LongLongTypeArrayHolder (IntegrationWithExternalNotAligned.LongLongTypeArray initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.LongLongTypeArrayHelper.type ();
  }

}
