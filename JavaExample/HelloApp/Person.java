package HelloApp;


/**
* HelloApp/Person.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HelloWorld.idl
* Saturday, May 30, 2020 6:17:55 AM SAST
*/

public final class Person implements org.omg.CORBA.portable.IDLEntity
{
  public String Name = null;
  public String Surname = null;

  public Person ()
  {
  } // ctor

  public Person (String _Name, String _Surname)
  {
    Name = _Name;
    Surname = _Surname;
  } // ctor

} // class Person
