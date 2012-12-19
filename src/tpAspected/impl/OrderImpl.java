package tpAspected.impl;

import tpAspected.Client;
import tpAspected.Order;

public class OrderImpl implements Order{


	private int id;
	private double amount;
	private Client client;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public Client getClient() {
		return this.client;
	}

	@Override
	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public void printOrder() {
		System.out.println("#"+id+"\t("+amount+")\t"+client);		
	}

}
