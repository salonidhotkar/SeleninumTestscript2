package polymorphism;

public class DriverCreditDepitSwipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		CreditCard c1=new CreditCard();
				Swipe s1= new Swipe();
				
		s1.SwippingMachine(c1);	
		
		Debitcard d1=new Debitcard();
		s1.SwippingMachine(d1);
		
		card c2=new card();
		s1.SwippingMachine(c2);
	}

}
