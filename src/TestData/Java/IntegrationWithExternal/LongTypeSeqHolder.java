package IntegrationWithExternal;


/**
* IntegrationWithExternal/LongTypeSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:22 PM SAST
*/

public final class LongTypeSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.LongType value[] = null;

  public LongTypeSeqHolder ()
  {
  }

  public LongTypeSeqHolder (IntegrationWithExternal.LongType[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.LongTypeSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.LongTypeSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.LongTypeSeqHelper.type ();
  }

}
