package IntegrationWithExternal;

/**
* IntegrationWithExternal/WideCharTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:22 PM SAST
*/

public final class WideCharTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.WideCharType value = null;

  public WideCharTypeHolder ()
  {
  }

  public WideCharTypeHolder (IntegrationWithExternal.WideCharType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.WideCharTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.WideCharTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.WideCharTypeHelper.type ();
  }

}
