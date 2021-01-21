package behavioural.strategy;

public class StrategyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PaymentContext context = new PaymentContext();
		CreditCardPayment cc = new CreditCardPayment();
		context.setStrategy(cc);
		context.apply(200);
		
		PaypalPayment paypal = new PaypalPayment();
		context.setStrategy(paypal);
		context.apply(300);      

	}

}
