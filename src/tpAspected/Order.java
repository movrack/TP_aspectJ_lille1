package tpAspected;

public interface Order {

	Client getClient();
	void setClient(Client client);

	double getAmount();
	void setAmount(double amount);


	int getId();
	void setId(int id);

	
	void printOrder();

}
