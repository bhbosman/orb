package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/StringTypeArrayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class StringTypeArrayHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.StringTypeArray value = null;

  public StringTypeArrayHolder ()
  {
  }

  public StringTypeArrayHolder (IntegrationWithExternalNotAligned.StringTypeArray initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.StringTypeArrayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.StringTypeArrayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.StringTypeArrayHelper.type ();
  }

}
