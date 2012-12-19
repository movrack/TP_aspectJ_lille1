package testsAspectedVersion;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.withSettings;

import org.junit.Test;

import tpAspected.Client;
import tpAspected.ClientHaveOrdersException;
import tpAspected.ClientWithOrders;
import tpAspected.Clients;
import tpAspected.ClientsWithOrders;
import tpAspected.impl.ClientsImpl;

public class ClientsTests {

	@Test
	public void testAddClient() throws Exception {
		Clients cList = new ClientsImpl();
		Client client = mock(Client.class);

		assertEquals(0, cList.size());
		cList.addClient(client);
		assertEquals(1, cList.size());
		assertEquals(client, cList.getClient(0));
	}

	@Test
	public void testDelClient() throws Exception {
		Clients cList = new ClientsImpl();
		Client client = mock(Client.class, withSettings().extraInterfaces(ClientWithOrders.class));
		
		cList.addClient(client);
		assertEquals(1, cList.size());

		when(((ClientWithOrders)client).hasOrder()).thenReturn(false);
		((ClientsWithOrders)cList).delClient(client);
		assertEquals(0, cList.size());
	}

	@Test(expected = ClientHaveOrdersException.class)
	public void testDelClientWithOrder() throws Exception {
		Clients cList = new ClientsImpl();
		Client client = mock(Client.class, withSettings().extraInterfaces(ClientWithOrders.class));
		
		cList.addClient(client);
		when(((ClientWithOrders)client).hasOrder()).thenReturn(true);

		((ClientsWithOrders)cList).delClient(client);

	}

}
