package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/UnsignedLongLongTypeSequenceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class UnsignedLongLongTypeSequenceHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence value = null;

  public UnsignedLongLongTypeSequenceHolder ()
  {
  }

  public UnsignedLongLongTypeSequenceHolder (IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequence initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.UnsignedLongLongTypeSequenceHelper.type ();
  }

}
