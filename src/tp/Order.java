package tp;

public interface Order {

	void setAmount(double amount);

	double getAmount();

	void setId(int id);

	int getId();

	Client getClient();

	void setClient(Client client);
	
	void printOrder();

}
