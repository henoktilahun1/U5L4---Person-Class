public class Person
{
   private String name;
   private String email;
   private String phoneNum;

   public Person()
	 {
		 	name = "";
			email = "";
			phoneNum = "";
	 } 

	 public Person(String initName, String initEmail, String initPhoneNum)
   {
      name = initName;
			email = initEmail;
			phoneNum = initPhoneNum;
   }

    public String getName()
   {
      return name;
   }

    public String getEmail()
   {
      return email;
   }

    public String getPhoneNum()
   {
      return phoneNum;
   }

    public void setName(String newName)
   {
      name = newName;
   }

    public void setEmail(String newEmail)
   {
      email = newEmail; 
      
    }

    public void setPhoneNum(String newPhoneNum)
    {
      phoneNum = newPhoneNum;
    }

    public String toString()
      {
        return name + " : " + email + " : " + phoneNum;
      }

}
