package behavioural.strategy;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		
		System.out.println("-----Paying through Credit Card---"+amount);

	}

}
