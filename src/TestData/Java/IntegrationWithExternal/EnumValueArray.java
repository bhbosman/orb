package IntegrationWithExternal;


/**
* IntegrationWithExternal/EnumValueArray.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class EnumValueArray implements org.omg.CORBA.portable.IDLEntity
{
  public IntegrationWithExternal.EnumValue Value[] = null;

  public EnumValueArray ()
  {
  } // ctor

  public EnumValueArray (IntegrationWithExternal.EnumValue[] _Value)
  {
    Value = _Value;
  } // ctor

} // class EnumValueArray
