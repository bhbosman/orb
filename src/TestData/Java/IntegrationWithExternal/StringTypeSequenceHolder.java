package IntegrationWithExternal;

/**
* IntegrationWithExternal/StringTypeSequenceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:22 PM SAST
*/

public final class StringTypeSequenceHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.StringTypeSequence value = null;

  public StringTypeSequenceHolder ()
  {
  }

  public StringTypeSequenceHolder (IntegrationWithExternal.StringTypeSequence initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.StringTypeSequenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.StringTypeSequenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.StringTypeSequenceHelper.type ();
  }

}
