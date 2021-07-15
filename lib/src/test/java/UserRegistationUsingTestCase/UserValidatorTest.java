package UserRegistationUsingTestCase;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserValidatorTest 
{
	

	//Test case to validate First Name
	@Test
	public void givenFirstName_WhenItIsValid_ShouldReturnTrue() throws UserRegistrationException
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		result = registationValidator.validatorDetails.validator("Nikhil", "^[A-Z][a-z]{2,}");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenFirstName_WhenItIsLessThan3Char_ShouldReturnFalse() throws UserRegistrationException 
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		ExpectedException exception = ExpectedException.none();
		exception.expect(UserRegistrationException.class);
		exception.expectMessage("First name should be greater than 3 characters");
		result = registationValidator.validatorDetails.validator("Ni", "^[A-Z][a-z]{2,}");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenitsSpecailChar_ShouldReturnFalse() throws UserRegistrationException
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		ExpectedException exception = ExpectedException.none();
		exception.expect(UserRegistrationException.class);
		exception.expectMessage("First name should not have special characters");
		result = registationValidator.validatorDetails.validator("N!kH!l", "^[A-Z][a-z]{2,}");
		Assert.assertEquals(false, result);
	}
	
	// To handle null pointer exception
	@Test
	public void givenNullFirstName_ShouldReturnFalse() throws UserRegistrationException
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = false;
		ExpectedException exception = ExpectedException.none();
		exception.expect(UserRegistrationException.class);
		exception.expectMessage("First name should not be null");
		result = registationValidator.validatorDetails.validator("", "^[A-Z][a-z]{2,}");
		Assert.assertEquals(false, result);
	}
	
	//Test case to validate Last Name
	@Test
	public void givenLastName_WhenItsValid_ShouldReturnTrue() throws UserRegistrationException
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		result = registationValidator.validatorDetails.validator("Arvind", "^[A-Z][a-z]{2,}");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenLastName_WhenItIsLessThan3Char_ShouldReturnFalse() throws UserRegistrationException 
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		ExpectedException exception = ExpectedException.none();
		exception.expect(UserRegistrationException.class);
		exception.expectMessage("Last name should be greater than 3 characters");
		result = registationValidator.validatorDetails.validator("Av", "^[A-Z][a-z]{2,}");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenitsSpecailChar_ShouldReturnFalse() throws UserRegistrationException
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		ExpectedException exception = ExpectedException.none();
		exception.expect(UserRegistrationException.class);
		exception.expectMessage("Last name should not have special characters");
		result = registationValidator.validatorDetails.validator("Arv!nd", "^[A-Z][a-z]{2,}");
		Assert.assertEquals(false, result);
	}
	
	//Test case to validate password
	@Test
	public void givenPassword_WhenItsValid_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			result = registationValidator.validatorDetails.validator("Nikhil@123", "(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}");
			Assert.assertEquals(true, result);
		}
		catch (Exception e) {
		}
	}
	
	@Test
	public void givenPassword_WhenSpecialCharNotUsed_ShouldReturnTrue() throws UserRegistrationException
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		result = registationValidator.validatorDetails.validator("Nikhil123", "(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenNumberNotUsed_ShouldReturnTrue() throws UserRegistrationException
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		result = registationValidator.validatorDetails.validator("Nikhil@arv", "(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenMiminim8CharIsNotEntered_ShouldReturnTrue() throws UserRegistrationException
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		result = registationValidator.validatorDetails.validator("Nik@12", "(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}");
		Assert.assertEquals(false, result);	
	}
	
	@Test
	public void givenPassword_WhenOneUpperCaseCharIsNotEntered_ShouldReturnTrue() throws UserRegistrationException
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		result = registationValidator.validatorDetails.validator("nikhil@123", "(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenNumber_WhenValid_ShouldReturnTrue() throws UserRegistrationException
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		result = registationValidator.validatorDetails.validator("91 7066889759", "^[0-9]{1,3}[' '][0-9]{10}$");
		Assert.assertEquals(true, result);
	}
}

