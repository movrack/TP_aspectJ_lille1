package tp.impl;

import tp.Order;
import tp.Orders;
import tp.Client;

public class ClientImpl implements Client{

	private Orders orders;
	private String name;
	private String address;
		
	public ClientImpl(Orders orders) {
		this.orders = orders;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	@Override
	public void addOrder(Order order) {
		this.orders.addOrder(order);
	}

	@Override
	public Object nbOrders() {
		return orders.size();
	}

	@Override
	public void delOrder(Order order) {
		orders.delOrder(order);		
	}

	@Override
	public boolean hasOrder() {
		return orders.hasOrder();
	}

}
