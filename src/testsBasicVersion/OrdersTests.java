package testsBasicVersion;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;


import tp.Order;
import tp.Orders;
import tp.impl.OrdersImpl;

public class OrdersTests {

	@Test
	public void testAddOrder() {
		Orders oList = new OrdersImpl();
		Order order = mock(Order.class);
		
		assertEquals(0, oList.size());
		oList.addOrder(order);
		assertEquals(1, oList.size());
		assertEquals(order, oList.getOrder(0));		
	}
	
	@Test
	public void testDelOrder() {
		Orders oList = new OrdersImpl();
		Order order = mock(Order.class);
		oList.addOrder(order);

		assertEquals(1, oList.size());
		oList.delOrder(order);
		assertEquals(0, oList.size());		
	}
	

	@Test
	public void testHasOrder() {
		Orders oList = new OrdersImpl();
		Order order = mock(Order.class);

		assertEquals(false, oList.hasOrder());
		oList.addOrder(order);
		assertEquals(true, oList.hasOrder());
	}

}
