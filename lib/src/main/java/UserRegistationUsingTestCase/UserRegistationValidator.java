package UserRegistationUsingTestCase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import UserRegistationUsingTestCase.UserRegistrationException.ExceptionType;

@FunctionalInterface
interface Validate {
	Boolean validator(String name , String regex);
}

public class UserRegistationValidator 
{
	Validate validatorDetails = (firstName,regex) -> {
		Pattern pattern = Pattern.compile(regex);
		Matcher matched = pattern.matcher(firstName); 
		return matched.matches();
	};
}
