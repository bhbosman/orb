package IntegrationWithExternal;

/**
* IntegrationWithExternal/ShortTypeSequenceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:22 PM SAST
*/

public final class ShortTypeSequenceHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternal.ShortTypeSequence value = null;

  public ShortTypeSequenceHolder ()
  {
  }

  public ShortTypeSequenceHolder (IntegrationWithExternal.ShortTypeSequence initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternal.ShortTypeSequenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternal.ShortTypeSequenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternal.ShortTypeSequenceHelper.type ();
  }

}
