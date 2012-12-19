package tp;


public interface Client {
	void addOrder(Order order);

	Object nbOrders();

	void delOrder(Order order);

	boolean hasOrder();

}
