package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/UnsignedShortTypeSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class UnsignedShortTypeSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public IntegrationWithExternalNotAligned.UnsignedShortType value[] = null;

  public UnsignedShortTypeSeqHolder ()
  {
  }

  public UnsignedShortTypeSeqHolder (IntegrationWithExternalNotAligned.UnsignedShortType[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IntegrationWithExternalNotAligned.UnsignedShortTypeSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IntegrationWithExternalNotAligned.UnsignedShortTypeSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IntegrationWithExternalNotAligned.UnsignedShortTypeSeqHelper.type ();
  }

}
