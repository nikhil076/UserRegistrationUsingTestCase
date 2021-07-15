package UserRegistationUsingTestCase;

public class UserRegistrationMain {

	public static void main(String[] args) throws UserRegistrationException {
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		System.out.println("First name is :"+registationValidator.validatorDetails.validator("Nikhil", "^[A-Z][a-z]{2,}"));
		System.out.println("Last name is :"+registationValidator.validatorDetails.validator("Arvind", "^[A-Z][a-z]{2,}"));
		System.out.println("Phone number is :"+registationValidator.validatorDetails.validator("91 7066889759", "^[0-9]{1,3}[' '][0-9]{10}$"));
		System.out.println("Email is :"+registationValidator.validatorDetails.validator("nikhil.arvind@gmail.com", "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$"));
		System.out.println("password is :"+registationValidator.validatorDetails.validator("Nikhil@123", "(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}"));
	}
}
