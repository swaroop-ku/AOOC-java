package ExceptionHandlingDemo;
import java.lang.*;
public class DivisionException extends Exception
{
	public String toString(){
		return "Value of denominator is 0";
	}
}