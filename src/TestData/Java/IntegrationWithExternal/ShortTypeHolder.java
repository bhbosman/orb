package IntegrationWithExternal;

/**
* IntegrationWithExternal/ShortTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:22 PM SAST
*/

public final class ShortTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.ShortType value = null;

  public ShortTypeHolder ()
  {
  }

  public ShortTypeHolder (IntegrationWithExternal.ShortType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.ShortTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.ShortTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.ShortTypeHelper.type ();
  }

}
