package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/OctetTypeSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class OctetTypeSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.OctetType value[] = null;

  public OctetTypeSeqHolder ()
  {
  }

  public OctetTypeSeqHolder (IntegrationWithExternalNotAligned.OctetType[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.OctetTypeSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.OctetTypeSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.OctetTypeSeqHelper.type ();
  }

}
