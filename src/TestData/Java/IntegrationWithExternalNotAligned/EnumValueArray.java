package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/EnumValueArray.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class EnumValueArray implements org.omg.CORBA.portable.IDLEntity
{
  public byte dummy = (byte)0;
  public IntegrationWithExternalNotAligned.EnumValue Value[] = null;

  public EnumValueArray ()
  {
  } // ctor

  public EnumValueArray (byte _dummy, IntegrationWithExternalNotAligned.EnumValue[] _Value)
  {
    dummy = _dummy;
    Value = _Value;
  } // ctor

} // class EnumValueArray