package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/WideCharTypeArrayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class WideCharTypeArrayHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.WideCharTypeArray value = null;

  public WideCharTypeArrayHolder ()
  {
  }

  public WideCharTypeArrayHolder (IntegrationWithExternalNotAligned.WideCharTypeArray initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.WideCharTypeArrayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.WideCharTypeArrayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.WideCharTypeArrayHelper.type ();
  }

}
