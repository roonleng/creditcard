/**
 * author: ryan long
 * period 6
 * ap computer science
 */
package creditcard;
public class creditCard 
{
	/**
	 * instance variables
	 * cardnum is final because it wont need to be changed
	 */
	private final int CARDNUM;
	private double limit;
	private double balance;
	private double interestRate;
	private String holderName;
	
	/**
	 * constructor that takes parameters from the main class, then assigns them to the instance variables
	 * @param n short for number (card number)
	 * @param l short for limit
	 * @param i short for interestRate
	 * @param h short for holder name
	 * balance always starts at 0
	 */
	public creditCard(int n, double l, double i, String h)
	{
		CARDNUM = n;
		limit = l;
		balance = 0;
		interestRate = i;
		holderName = h;
	}
	/**
	 * charge method, allows a user to charge a certain amount of money onto the card
	 * the method checks to make sure the charge doesn't surpass the account limit, then charges it if it does not.
	 * @param charge is the parameter for the user to enter the amount of money they want to charge
	 */
	public void charge(int charge)
	{
		double newBalance=balance + charge;
		if (newBalance>limit)
		{
			return;
		}
		balance = newBalance;
		return;
	}
	/**
	 * credit method, allows a user to add a certain amount of money to the account balance
	 * @param credit is the parameter for the user to enter how much money they wnt to add
	 */
	public void credit(int credit)
	{
		balance= balance - credit;
	}
	/**
	 * a method that charges the interest rate to the account and adds a charge or credit 
	 * dependent on whether the person's balance is positive or negative
	 * it adds the original balance to the interest accrued by the balance
	 */
	public void chargeInterest()
	{
		balance= balance+(balance*interestRate);
		return;
	}
	/**
	 * getters for all the fields
	 * returns the values for all the fields the user is trying to access
	 * 
	 * getCARDNUM returns the card number
	 * 
	 * getLimit returns the limit
	 * 
	 * getBalance returns the current balance
	 * 
	 * getInterestRate returns the interest rate
	 * 
	 * getHolderName returns the name of the cardholder
	 * 
	 */
	public int getCARDNUM() {return CARDNUM;}
	public double getLimit() {return limit;}
	public double getBalance() {return balance;}
	public double getInterestRate() {return interestRate;}
	public String getHolderName() {return holderName;}
}

