package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/BooleanTypeArray.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public final class BooleanTypeArray implements org.omg.CORBA.portable.IDLEntity
{
  public byte dummy = (byte)0;
  public boolean Value[] = null;

  public BooleanTypeArray ()
  {
  } // ctor

  public BooleanTypeArray (byte _dummy, boolean[] _Value)
  {
    dummy = _dummy;
    Value = _Value;
  } // ctor

} // class BooleanTypeArray
