package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/ShortTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class ShortTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.ShortType value = null;

  public ShortTypeHolder ()
  {
  }

  public ShortTypeHolder (IntegrationWithExternalNotAligned.ShortType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.ShortTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.ShortTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.ShortTypeHelper.type ();
  }

}