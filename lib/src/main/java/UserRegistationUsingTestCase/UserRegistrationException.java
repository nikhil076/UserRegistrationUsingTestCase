package UserRegistationUsingTestCase;

public class UserRegistrationException extends Exception
{
	public enum ExceptionType
	{
		ENTERED_NULL,ENTERED_EMPTY;
	}

	private ExceptionType type;
	
	public UserRegistrationException(ExceptionType type , String message) 
	{
		super(message);
		this.type=type;
	}
}
