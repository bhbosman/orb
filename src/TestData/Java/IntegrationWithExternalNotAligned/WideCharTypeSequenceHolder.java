package IntegrationWithExternalNotAligned;

/**
* IntegrationWithExternalNotAligned/WideCharTypeSequenceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class WideCharTypeSequenceHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.WideCharTypeSequence value = null;

  public WideCharTypeSequenceHolder ()
  {
  }

  public WideCharTypeSequenceHolder (IntegrationWithExternalNotAligned.WideCharTypeSequence initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.WideCharTypeSequenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.WideCharTypeSequenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.WideCharTypeSequenceHelper.type ();
  }

}
