package IntegrationWithExternal;

/**
* IntegrationWithExternal/FloatTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class FloatTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.FloatType value = null;

  public FloatTypeHolder ()
  {
  }

  public FloatTypeHolder (IntegrationWithExternal.FloatType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.FloatTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.FloatTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.FloatTypeHelper.type ();
  }

}