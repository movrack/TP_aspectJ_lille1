package tp.impl;

import java.util.ArrayList;
import java.util.List;

import tp.Order;
import tp.Orders;



public class OrdersImpl implements Orders{

	private List<Order> orders;

	public OrdersImpl() {
		super();
		this.orders = new ArrayList<Order>();
	}

	@Override
	public void addOrder(Order order) {
		orders.add(order);
	}

	@Override
	public int size() {
		return orders.size();
	}

	@Override
	public Order getOrder(int i) {
		return orders.get(i);
	}

	@Override
	public void delOrder(Order order) {
		orders.remove(order);
	}

	@Override
	public boolean hasOrder() {
		return orders.size() != 0;
	}

}
