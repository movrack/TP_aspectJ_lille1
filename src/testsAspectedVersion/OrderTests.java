package testsAspectedVersion;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import tpAspected.Client;
import tpAspected.Order;
import tpAspected.impl.OrderImpl;

public class OrderTests {

	@Test
	public void testSetClient() {
		Order o = new OrderImpl();
		Client c = mock(Client.class);

		o.setClient(c);
		assertEquals(c, o.getClient());
	}

	
}
