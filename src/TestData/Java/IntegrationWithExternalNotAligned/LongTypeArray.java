package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/LongTypeArray.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class LongTypeArray implements org.omg.CORBA.portable.IDLEntity
{
  public byte dummy = (byte)0;
  public int Value[] = null;

  public LongTypeArray ()
  {
  } // ctor

  public LongTypeArray (byte _dummy, int[] _Value)
  {
    dummy = _dummy;
    Value = _Value;
  } // ctor

} // class LongTypeArray
