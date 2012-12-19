package tpAspected;

public interface ClientWithOrders {

	void addOrder(Order order);

	Object nbOrders();

	void delOrder(Order order);

	boolean hasOrder();
}
