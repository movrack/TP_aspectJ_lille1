package testsBasicVersion;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import tp.Client;
import tp.Order;
import tp.impl.OrderImpl;

public class OrderTests {

	@Test
	public void testSetClient() {
		Order o = new OrderImpl();
		Client c = mock(Client.class);

		o.setClient(c);
		assertEquals(c, o.getClient());
	}

	
}
