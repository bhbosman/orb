package IntegrationWithExternal;

/**
* IntegrationWithExternal/WideCharTypeArrayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:22 PM SAST
*/

public final class WideCharTypeArrayHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.WideCharTypeArray value = null;

  public WideCharTypeArrayHolder ()
  {
  }

  public WideCharTypeArrayHolder (IntegrationWithExternal.WideCharTypeArray initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.WideCharTypeArrayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.WideCharTypeArrayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.WideCharTypeArrayHelper.type ();
  }

}
