package IntegrationWithExternal;

/**
* IntegrationWithExternal/CharTypeArrayHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:22 PM SAST
*/

public final class CharTypeArrayHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.CharTypeArray value = null;

  public CharTypeArrayHolder ()
  {
  }

  public CharTypeArrayHolder (IntegrationWithExternal.CharTypeArray initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.CharTypeArrayHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.CharTypeArrayHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.CharTypeArrayHelper.type ();
  }

}
