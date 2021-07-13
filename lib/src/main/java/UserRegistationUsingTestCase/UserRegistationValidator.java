package UserRegistationUsingTestCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistationValidator {

	public boolean firstNameRegex(String firstName) 
	{
		String firstNameRegex = "^[A-Z][a-z]{2,}";
		Pattern pattern = Pattern.compile(firstNameRegex);
		Matcher matched = pattern.matcher(firstName);
		return matched.matches();
	}

	public boolean lastNameRegex(String lastName)
	{
		String firstNameRegex = "^[A-Z][a-z]{2,}";
		Pattern pattern = Pattern.compile(firstNameRegex);
		Matcher matched = pattern.matcher(lastName);
		return matched.matches();
	}

	public boolean emailRegex(String email) 
	{
		String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matched = pattern.matcher(email);
		return matched.matches();
	}

	public boolean phoneNumberRegex(String phoneNumber) 
	{
		String phoneNumberRegex = "^[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$";
		Pattern pattern = Pattern.compile(phoneNumberRegex);
		Matcher matched = pattern.matcher(phoneNumber);
		return matched.matches();
	}

	public boolean passwordRegex(String password) {
		String passwordRegex = "(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}";
		Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matched = pattern.matcher(password);
		return matched.matches();
	}

}
