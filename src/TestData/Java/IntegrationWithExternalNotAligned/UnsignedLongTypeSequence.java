package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/UnsignedLongTypeSequence.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class UnsignedLongTypeSequence implements org.omg.CORBA.portable.IDLEntity
{
  public byte dummy = (byte)0;
  public IntegrationWithExternalNotAligned.UnsignedLongType Seq[] = null;

  public UnsignedLongTypeSequence ()
  {
  } // ctor

  public UnsignedLongTypeSequence (byte _dummy, IntegrationWithExternalNotAligned.UnsignedLongType[] _Seq)
  {
    dummy = _dummy;
    Seq = _Seq;
  } // ctor

} // class UnsignedLongTypeSequence
