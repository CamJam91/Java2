package cameron_murphy;
//Cameron Murphy CIS 2217 R01 9/25/2024
//Order class

public class Order extends Class {
	private String order;
	
	/**
	 * @param kingdom
	 * @param tier
	 * @param className
	 * @param order
	 * @param extinct
	 */
	public Order(String kingdom, String tier, String className, String order, Boolean extinct) {
		super(kingdom, tier, className, extinct);
		this.order = order;
	}
	
		//getters
	public String getOrder() {
		return order;
	}
	
		//setters
	public void setOder(String order) {
		this.order = order;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Order: " + order;
	}
}
