/**
 * 
 */
package mycompany.basicmathoperations.oop;

/**
 * @author tconti97
 *
 */
public class SubtractOperatorFor2Numbers extends OperatorFor2numbers implements Subtraction 
{

	/* (non-Javadoc)
	 * @see mycompany.basicmathoperations.oop.Subtraction#subtract(int, int)
	 */
	SubtractOperatorFor2Numbers() {}
	
	SubtractOperatorFor2Numbers(float num1, float num2)
	{
		super(num1, num2);
	}
	
	@Override
	public int subtract(int num1, int num2) 
	{
		return num1-num2;
	}

	/* (non-Javadoc)
	 * @see mycompany.basicmathoperations.oop.Subtraction#subtract(float, float)
	 */
	@Override
	public float subtract(float num1, float num2) 
	{
		return num1-num2;
	}

	/* (non-Javadoc)
	 * @see mycompany.basicmathoperations.oop.Subtraction#subtract2Numbers()
	 */
	@Override
	public float subtract2Numbers() 
	{
		return number1-number2;
	}

}
