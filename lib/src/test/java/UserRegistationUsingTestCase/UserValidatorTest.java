package UserRegistationUsingTestCase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserValidatorTest {
	

	//Test case to validate First Name
	@Test
	public void givenFirstName_WhenItIsValid_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			result = registationValidator.firstNameRegex("Nikhil");
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
		}
	}
	
	@Test
	public void givenFirstName_WhenItIsLessThan3Char_ShouldReturnFalse() 
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			ExpectedException exception = ExpectedException.none();
			exception.expect(UserRegistrationException.class);
			exception.expectMessage("First name should be greater than 3 characters");
			result = registationValidator.firstNameRegex("Ni");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}
	}
	
	@Test
	public void givenFirstName_WhenitsSpecailChar_ShouldReturnFalse()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			ExpectedException exception = ExpectedException.none();
			exception.expect(UserRegistrationException.class);
			exception.expectMessage("First name should not have special characters");
			result = registationValidator.firstNameRegex("NikH!l");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}
	}
	
	// To handle null pointer exception
	@Test
	public void givenNullFirstName_ShouldReturnFalse()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = false;
		try {
			ExpectedException exception = ExpectedException.none();
			exception.expect(UserRegistrationException.class);
			exception.expectMessage("First name should not be null");
			result = registationValidator.firstNameRegex(null);
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}
	}
	
	//Test case to validate Last Name
	@Test
	public void givenLastName_WhenItsValid_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			result = registationValidator.lastNameRegex("Arvind");
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
		}
	}
	
	@Test
	public void givenLastName_WhenItIsLessThan3Char_ShouldReturnFalse() 
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			ExpectedException exception = ExpectedException.none();
			exception.expect(UserRegistrationException.class);
			exception.expectMessage("Last name should be greater than 3 characters");
			result = registationValidator.lastNameRegex("Av");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}
	}
	
	@Test
	public void givenLastName_WhenitsSpecailChar_ShouldReturnFalse()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			ExpectedException exception = ExpectedException.none();
			exception.expect(UserRegistrationException.class);
			exception.expectMessage("Last name should not have special characters");
			result = registationValidator.lastNameRegex("Arv!nd");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}
	}
	
	//Test case to validate password
	@Test
	public void givenPassword_WhenItsValid_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			result = registationValidator.passwordRegex("Nikhil@123");
			Assert.assertEquals(true, result);
		}
		catch (Exception e) {
		}
	}
	
	@Test
	public void givenPassword_WhenSpecialCharNotUsed_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			result = registationValidator.passwordRegex("Nikhil123");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}
	}
	
	@Test
	public void givenPassword_WhenNumberNotUsed_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			result = registationValidator.passwordRegex("Nikhil@arv");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
		}
	}
	
	@Test
	public void givenPassword_WhenMiminim8CharIsNotEntered_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			result = registationValidator.passwordRegex("Nik@12");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Test
	public void givenPassword_WhenOneUpperCaseCharIsNotEntered_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			result = registationValidator.passwordRegex("nikhil@123");
			Assert.assertEquals(false, result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenNumber_WhenValid_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			result = registationValidator.phoneNumberRegex("91 7066889759");
			Assert.assertEquals(true, result);
		} catch (UserRegistrationException e) {
		}
	}
}

