package IntegrationWithExternalNotAligned;


/**
* IntegrationWithExternalNotAligned/EnumValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./test2.idl
* Saturday, June 13, 2020 11:01:23 PM SAST
*/

public class EnumValue implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static IntegrationWithExternalNotAligned.EnumValue[] __array = new IntegrationWithExternalNotAligned.EnumValue [__size];

  public static final int _ValueA = 0;
  public static final IntegrationWithExternalNotAligned.EnumValue ValueA = new IntegrationWithExternalNotAligned.EnumValue(_ValueA);
  public static final int _ValueB = 1;
  public static final IntegrationWithExternalNotAligned.EnumValue ValueB = new IntegrationWithExternalNotAligned.EnumValue(_ValueB);

  public int value ()
  {
    return __value;
  }

  public static IntegrationWithExternalNotAligned.EnumValue from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected EnumValue (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class EnumValue
