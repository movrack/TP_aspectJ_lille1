package tpAspected;

public interface Clients {

	int size();

	void addClient(Client client);

	Object getClient(int i);

	void delClient(Client client) throws ClientHaveOrdersException;


}
