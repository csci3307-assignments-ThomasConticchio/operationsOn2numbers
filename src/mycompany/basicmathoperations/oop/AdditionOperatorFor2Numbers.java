/**
 * 
 */
package mycompany.basicmathoperations.oop;

/**
 * @author tconti97
 *
 */
public class AdditionOperatorFor2Numbers extends OperatorFor2numbers implements Addition 
{
	/* (non-Javadoc)
	 * @see mycompany.basicmathoperations.oop.Addition#add(int, int)
	 */
	AdditionOperatorFor2Numbers() {}
	
	AdditionOperatorFor2Numbers(float num1, float num2)
	{
		super(num1,num2);
	}
	
	@Override
	public int add(int num1, int num2) 
	{
		return num1+num2;
	}

	/* (non-Javadoc)
	 * @see mycompany.basicmathoperations.oop.Addition#add(float, float)
	 */
	@Override
	public float add(float num1, float num2)
	{
		return num1+num2;
	}

	/* (non-Javadoc)
	 * @see mycompany.basicmathoperations.oop.Addition#add2Numbers()
	 */
	@Override
	public float add2Numbers() 
	{
		return number1+number2;
	}

}
