package IntegrationWithExternal;

/**
* IntegrationWithExternal/UnsignedLongTypeSequenceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class UnsignedLongTypeSequenceHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.UnsignedLongTypeSequence value = null;

  public UnsignedLongTypeSequenceHolder ()
  {
  }

  public UnsignedLongTypeSequenceHolder (IntegrationWithExternal.UnsignedLongTypeSequence initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.UnsignedLongTypeSequenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.UnsignedLongTypeSequenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.UnsignedLongTypeSequenceHelper.type ();
  }

}
