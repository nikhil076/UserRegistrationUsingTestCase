package UserRegistationUsingTestCase;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

	//Test case for First Name
	@Test
	public void givenFirstName_WhenItIsValid_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.firstNameRegex("Nikhil");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenFirstName_WhenItIsLessThan3Char_ShouldReturnFalse() 
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.firstNameRegex("Ni");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenitsSpecailChar_ShouldReturnFalse()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.firstNameRegex("NikH!l");
		Assert.assertEquals(false, result);
	}
	
	//Test case for Last Name
	@Test
	public void givenLastName_WhenItsValid_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.lastNameRegex("Arvind");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenLastName_WhenItIsLessThan3Char_ShouldReturnFalse() 
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.lastNameRegex("Av");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenitsSpecailChar_ShouldReturnFalse()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.lastNameRegex("Arv!nd");
		Assert.assertEquals(false, result);
	}
	
	//Test case for password
	@Test
	public void givenPassword_WhenItsValid_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.passwordRegex("Nikhil@123");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPassword_WhenSpecialCharNotUsed_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.passwordRegex("Nikhil123");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenNumberCharNotUsed_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.passwordRegex("Nikhil@arv");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenMiminim8CharIsNotEntered_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.passwordRegex("Nik@12");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenPassword_WhenOneUpperCaseCharIsNotEntered_ShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result = registationValidator.passwordRegex("nikhil@123");
		Assert.assertEquals(false, result);
	}
}

