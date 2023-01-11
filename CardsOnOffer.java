package q2Inharetance;

public class CardsOnOffer {

	public static CardType getOfferedCard(Customer object)
	{
		int points=object.getCreditPoints();
		String s="";
		
		if(points<100) s+="EMI";
		else if(points >=100 && points <=500) s+="Silver";
		else if(points >=501 && points <=1000) s+="Gold";
		else if(points>1000) s+="Platinum";
		
		return new CardType(object,s);
	}
}
