package testsAspectedVersion;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


import tpAspected.ClientWithOrders;
import tpAspected.Order;
import tpAspected.Orders;
import tpAspected.impl.ClientImpl;

public class ClientTests {

	@Test
	public void testAddOrder() {
		Orders orders = mock(Orders.class);
		ClientWithOrders c = new ClientImpl(orders);
		Order order = mock(Order.class);
		
		when(orders.size()).thenReturn(0, 1);
		
		assertEquals(0, c.nbOrders());
		c.addOrder(order);
		assertEquals(1, c.nbOrders());	
	}
	
	@Test
	public void testDelOrder() {
		Orders orders = mock(Orders.class);
		ClientWithOrders c = new ClientImpl(orders);
		Order order = mock(Order.class);

		when(orders.size()).thenReturn(1,0);
		
		c.addOrder(order);

		assertEquals(1, c.nbOrders());
		c.delOrder(order);
		assertEquals(0, c.nbOrders());		
	}

	@Test
	public void testHasOrder() {
		Orders orders = mock(Orders.class);
		ClientWithOrders c = new ClientImpl(orders);
		Order order = mock(Order.class);

		when(orders.hasOrder()).thenReturn(false, true);
		
		assertEquals(false, c.hasOrder());		
		c.addOrder(order);
		assertEquals(true, c.hasOrder());	
	}
}
