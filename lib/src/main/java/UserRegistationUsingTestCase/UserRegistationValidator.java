package UserRegistationUsingTestCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistationValidator 
{

	public boolean firstNameRegex(String firstName) throws UserRegistrationException 
	{
		try 
		{
			String firstNameRegex = "^[A-Z][a-z]{2,}";
			Pattern pattern = Pattern.compile(firstNameRegex);
			Matcher matched = pattern.matcher(firstName);
			return matched.matches();
		}
		catch (Exception e) 
		{
			throw new UserRegistrationException("Please Enter a valid First Name");
		}
	}

	public boolean lastNameRegex(String lastName) throws UserRegistrationException
	{
		try
		{
			String firstNameRegex = "^[A-Z][a-z]{2,}";
			Pattern pattern = Pattern.compile(firstNameRegex);
			Matcher matched = pattern.matcher(lastName);
			return matched.matches();
		}
		catch (Exception e) 
		{
			throw new UserRegistrationException("Please Enter a valid Last Name");
		}
	}

	public boolean emailRegex(String email) throws UserRegistrationException 
	{
		try
		{
			String emailRegex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
			Pattern pattern = Pattern.compile(emailRegex);
			Matcher matched = pattern.matcher(email);
			return matched.matches();
		}
		catch (Exception e) 
		{
			throw new UserRegistrationException("Please Enter a valid email");
		}
	}

	public boolean phoneNumberRegex(String phoneNumber) throws UserRegistrationException 
	{
		try
		{
			String phoneNumberRegex = "^[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$";
			Pattern pattern = Pattern.compile(phoneNumberRegex);
			Matcher matched = pattern.matcher(phoneNumber);
			return matched.matches();
		}
		catch (Exception e) 
		{
			throw new UserRegistrationException("Please Enter a valid phone number");
		}
	}

	public boolean passwordRegex(String password) throws UserRegistrationException 
	{
		try
		{
			String passwordRegex = "(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}";
			Pattern pattern = Pattern.compile(passwordRegex);
			Matcher matched = pattern.matcher(password);
			return matched.matches();
		}
		catch (Exception e) 
		{
			throw new UserRegistrationException("Please Enter a valid password");
		}
	}

}
