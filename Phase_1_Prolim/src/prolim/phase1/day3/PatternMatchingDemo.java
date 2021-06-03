package prolim.phase1.day3;

import java.util.regex.Pattern;

public class PatternMatchingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "[a-z]";
//		String 
		
		String email1 = "raghav@prolim.com";
		String email2 = "viren@gmail.com";
		String email3 = "test123prepare@co.edu.com";
		String email4 = "test124@com";
		String email5 = "test124com.lo";
		
		String email_check = "[A-Za-z1-9_.+]+@[A-Za-z.]+[.]com";
		
		System.out.println("\nEmail Matching:");
		
		System.out.println(Pattern.matches(email_check, email1));
		System.out.println(Pattern.matches(email_check, email2));
		System.out.println(Pattern.matches(email_check, email3));
		System.out.println(Pattern.matches(email_check, email4));
		System.out.println(Pattern.matches(email_check, email5));
		
		
		String phone_check = "[+]91\\d{10}";		
		
		System.out.println("\nPhone Matching:");
		
		System.out.println(Pattern.matches(phone_check, "+918586879809"));
		System.out.println(Pattern.matches(phone_check, "+912321356"));
		System.out.println(Pattern.matches(phone_check, "+929999999999"));
		
		
		String password_check = "^[A-Z][A-Za-z]*[0-9][A-Za-z]*[0-9][A-Za-z]*[0-9][A-Za-z]*";
		
		System.out.println("\nPassword Matching:");
		
		System.out.println(Pattern.matches(password_check, "A123fionr"));
		System.out.println(Pattern.matches(password_check, "a127fbwei"));
		System.out.println(Pattern.matches(password_check, "A1cei2ivrb2"));
		System.out.println(Pattern.matches(password_check, "a1cei2ivrb2"));
		System.out.println(Pattern.matches(password_check, "A12i2qw"));
	}

}
