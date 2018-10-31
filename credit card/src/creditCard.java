/**
 * 
 * @author Ryan Long
 * Pd. 6
 *  AP Comp Sci
 */
public class creditCard 
{
	//instance variable
	private final int CARDNUM;
	private final double limit;
	private double balance;
	private final double interestRate;
	String holderName;
	public creditCard(int a, double b, double c, double d)
	{
		a = CARDNUM;
		b = limit;
		c= balance;
		d = interestRate;
	}
	public void charge (double debt)
	{
		double newBalance = debt + balance;
		if (newBalance<limit)
		{
			balance = debt + balance;
			return newBalance;
		}
		return void;
		
	}
	public void double credit (double deposit)
	{
		balance = balance - deposit;
		return newBalance;
	}
}
