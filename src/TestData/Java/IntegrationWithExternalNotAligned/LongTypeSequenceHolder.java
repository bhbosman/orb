package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/LongTypeSequenceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class LongTypeSequenceHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.LongTypeSequence value = null;

  public LongTypeSequenceHolder ()
  {
  }

  public LongTypeSequenceHolder (IntegrationWithExternalNotAligned.LongTypeSequence initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.LongTypeSequenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.LongTypeSequenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.LongTypeSequenceHelper.type ();
  }

}