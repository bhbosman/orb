package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/UnsignedShortTypeSequence.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class UnsignedShortTypeSequence implements org.omg.CORBA.portable.IDLEntity
{
  public byte dummy = (byte)0;
  public IntegrationWithExternalNotAligned.UnsignedShortType Seq[] = null;

  public UnsignedShortTypeSequence ()
  {
  } // ctor

  public UnsignedShortTypeSequence (byte _dummy, IntegrationWithExternalNotAligned.UnsignedShortType[] _Seq)
  {
    dummy = _dummy;
    Seq = _Seq;
  } // ctor

} // class UnsignedShortTypeSequence