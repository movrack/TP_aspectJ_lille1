import tpAspected.Client;
import tpAspected.ClientHaveOrdersException;
import tpAspected.ClientWithOrders;
import tpAspected.ClientsWithOrders;
import tpAspected.Order;
import tpAspected.Orders;
import tpAspected.impl.ClientImpl;
import tpAspected.impl.ClientsImpl;

aspect AClientOrder {

	declare parents: ClientImpl implements ClientWithOrders;
	declare parents: ClientsImpl implements ClientsWithOrders;

	private Orders ClientImpl.orders;
	public ClientImpl.new(Orders orders){
		this();
		this.orders = orders;
	}
	
	public void ClientImpl.addOrder(Order order) {
		orders.addOrder(order);
	}

	public Object ClientImpl.nbOrders() {
		return orders.size();
	}

	public void ClientImpl.delOrder(Order order) {
		orders.delOrder(order);		
	}

	public boolean ClientImpl.hasOrder() {
		return orders.hasOrder();
	}
	

	pointcut delClient(Client c): call( void tpAspected.ClientsWithOrders.delClient(Client) ) && args( c) ;

	Object around(Client c) throws ClientHaveOrdersException: delClient(c) {
		ClientWithOrders client = (ClientWithOrders) c;
		if(client.hasOrder()) throw new ClientHaveOrdersException();
		Object ret = proceed(c);
		return ret;
	}
}
