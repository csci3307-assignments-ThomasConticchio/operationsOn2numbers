/**
 * 
 */
package mycompany.basicmathoperations.oop;

/**
 * @author tconti97
 *
 */
public class DivideOperatorFor2numbers extends OperatorFor2numbers implements Divide {

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(int, int)
	 */
	public DivideOperatorFor2numbers() {

	}
	
	public DivideOperatorFor2numbers(float _number1, float number2) {
		super(_number1,number2);	// NOTE 1st the parent's constructor executes
		System.out.println("parent's number1 is " + super.number1);
		System.out.println("_number1: " + _number1);
		System.out.println("number2: " + number2);
	}
	
	@Override
	public int divide(int num1, int num2) {
		if(num2==0) 
		{
			System.out.println("Cannot divide by 0");
			return 0;
		}
		return num1/num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide(float, float)
	 */
	@Override
	public float divide(float num1, float num2) {
		if(num2==0) 
		{
			System.out.println("Cannot divide by 0");
			return 0;
		}
		return num1/num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Divide#divide2numbers()
	 */
	@Override
	public float divide2numbers() {
		if(number2==0) 
		{
			System.out.println("Cannot divide by 0");
			return 0;
		}
		return number1/number2;
	}

}
