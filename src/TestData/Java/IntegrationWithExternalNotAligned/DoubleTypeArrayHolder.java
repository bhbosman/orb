package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/DoubleTypeArrayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class DoubleTypeArrayHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.DoubleTypeArray value = null;

  public DoubleTypeArrayHolder ()
  {
  }

  public DoubleTypeArrayHolder (IntegrationWithExternalNotAligned.DoubleTypeArray initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.DoubleTypeArrayHelper.type ();
  }

}
