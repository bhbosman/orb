package IntegrationWithExternal;

/**
* IntegrationWithExternal/OctetTypeSequenceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:22 PM SAST
*/

public final class OctetTypeSequenceHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.OctetTypeSequence value = null;

  public OctetTypeSequenceHolder ()
  {
  }

  public OctetTypeSequenceHolder (IntegrationWithExternal.OctetTypeSequence initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.OctetTypeSequenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.OctetTypeSequenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.OctetTypeSequenceHelper.type ();
  }

}
