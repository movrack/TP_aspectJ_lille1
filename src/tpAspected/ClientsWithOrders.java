package tpAspected;

public interface ClientsWithOrders {

	void delClient(Client client) throws ClientHaveOrdersException;
}
