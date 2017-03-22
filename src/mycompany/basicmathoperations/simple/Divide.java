/**
 * 
 */
package mycompany.basicmathoperations.simple;

/**
 * @author tconti97
 *
 */
public class Divide //Division
{
	public float divide(int num1, int num2)
	{
		if(num2==0) 
		{
			System.out.println("Cannot divide by 0");
			return 0;
		}
		return ((float)(num1)/num2);
	}
}
