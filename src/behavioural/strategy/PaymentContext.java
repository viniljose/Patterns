package behavioural.strategy;

public class PaymentContext {
	
	private PaymentStrategy strategy = null;

	public PaymentStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void apply(int amount){
		strategy.pay(amount);
	}

}
