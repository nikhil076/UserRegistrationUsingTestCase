package UserRegistationUsingTestCase;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidateEmailTest {
	private String emailTest;
	private boolean expectedResult;
	
	
	public ValidateEmailTest(String emailTest, boolean expectedResult) {
		super();
		this.emailTest = emailTest;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][]
				{
					{"abc@yahoo.com",true},
					{"abc-100@yahoo.com",true},
					{"abc.100@yahoo.com",true},
					{"abc111@abc.com",true},
					{"abc-100@abc.net",true},
					{"abc.100@abc.com.au",true},
					{"abc@gmail.com.com",true},
					{"abc+100@gmail.com",true},
					{"abc",false},
					{"abc()*@gmail.com",false},
					{"abc@%*.com",false},
					{"abc@abc@gmail.com",false}
					
				});
	}
	
	@Test
	public void givenEmail_WhenValidShouldReturnTrue()
	{
		UserRegistationValidator registationValidator = new UserRegistationValidator();
		boolean result;
		try {
			result = registationValidator.emailRegex(this.emailTest);
			Assert.assertEquals(this.expectedResult, result);
		} catch (UserRegistrationException e) {
		}
	}
}
