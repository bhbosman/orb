package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/FloatTypeArray.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class FloatTypeArray implements org.omg.CORBA.portable.IDLEntity
{
  public byte dummy = (byte)0;
  public float Value[] = null;

  public FloatTypeArray ()
  {
  } // ctor

  public FloatTypeArray (byte _dummy, float[] _Value)
  {
    dummy = _dummy;
    Value = _Value;
  } // ctor

} // class FloatTypeArray
