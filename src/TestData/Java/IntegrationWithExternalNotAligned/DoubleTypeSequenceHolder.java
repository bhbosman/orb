package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/DoubleTypeSequenceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class DoubleTypeSequenceHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.DoubleTypeSequence value = null;

  public DoubleTypeSequenceHolder ()
  {
  }

  public DoubleTypeSequenceHolder (IntegrationWithExternalNotAligned.DoubleTypeSequence initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.DoubleTypeSequenceHelper.type ();
  }

}
