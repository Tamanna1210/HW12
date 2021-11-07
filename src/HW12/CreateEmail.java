package HW12;

public class CreateEmail {
	/*
	 * Create a method createEmail(). Based on values of users name, lastName and email type, 
	 * your method should return complete email Address. 
	 * Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or 
	 */
	String email(String name,String lastName,String emailType) {
		String email= name+lastName+"@"+emailType+".com";
		return email;
	}
	public static void main(String[] args) {
		CreateEmail userEmail=new CreateEmail();
		String input=userEmail.email("Tamanna","faria","gmail");
	System.out.println(input);
}
}
