package creditcard;
/**
 * 
 * @author Ryan Long
 * period 6
 * AP computer science
 *
 */
public class creditCardMain 
{
	/**
	 * creating creditCard array object
	 * first parameter is credit cards
	 * second parameter is limit
	 * third parameter is interest rate
	 * fourth parameter is string
	 */
	public static void main(String[] args)
	{
	
		creditCard[] card = new creditCard[5];
		card[0] = new creditCard(121, 1000, .01, "Ryan Long");
		card[1] = new creditCard(122, 10000, .02, "Matt Ellis");
		card[2] = new creditCard(123, 10, .03, "Tyler Jonphrey");
		card[3] = new creditCard(124, 3333, .04, "Mosqutio Joe");
		card[4] = new creditCard(125, 75, .05, "Yellow Arpeggio");
		
		for (creditCard card300 : card)
		{
			if(card300.getCARDNUM() == 124)
			{
				card300.charge(300);
			}
		}
		for(creditCard card600 : card)
		{
			if(card600.getCARDNUM()==122)
			{
				card600.charge(600);
			}
		}
		for (creditCard card50 : card)
		{
			if(card50.getCARDNUM()==124)
			{
				card50.credit(50);
			}
		}
		for (creditCard allCards : card)
		{
			allCards.getHolderName();
		}

	}
}
