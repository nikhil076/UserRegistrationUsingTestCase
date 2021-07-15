package UserRegistationUsingTestCase;

public class UserRegistrationMain {

	public static void main(String[] args) throws UserRegistrationException {
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		System.out.println("First Name :"+registationValidator.firstNameRegex("Nikhil"));
		System.out.println("Last Name :"+registationValidator.lastNameRegex("Arvind"));
		System.out.println("Phone Number :"+registationValidator.phoneNumberRegex("91 7066889759"));
		System.out.println("email :"+registationValidator.emailRegex("nikhil.arvind@gmail.com"));
		System.out.println("password :"+registationValidator.passwordRegex("Nikhil@123"));
	}

}
