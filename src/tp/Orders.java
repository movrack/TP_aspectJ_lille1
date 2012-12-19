package tp;

public interface Orders {

	void addOrder(Order order);

	int size();

	Order getOrder(int i);

	void delOrder(Order order);

	boolean hasOrder();

}
