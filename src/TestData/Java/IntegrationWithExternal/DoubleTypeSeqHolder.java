package IntegrationWithExternal;


/**
* IntegrationWithExternal/DoubleTypeSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class DoubleTypeSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.DoubleType value[] = null;

  public DoubleTypeSeqHolder ()
  {
  }

  public DoubleTypeSeqHolder (IntegrationWithExternal.DoubleType[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.DoubleTypeSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.DoubleTypeSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.DoubleTypeSeqHelper.type ();
  }

}