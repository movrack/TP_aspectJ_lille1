package testsBasicVersion;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import tp.Client;
import tp.ClientHaveOrdersException;
import tp.Clients;
import tp.impl.ClientsImpl;

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
	public void testDelClientWithoutOrder() throws Exception {
		Clients cList = new ClientsImpl();
		Client client = mock(Client.class);
		
		cList.addClient(client);
		assertEquals(1, cList.size());

		when((client).hasOrder()).thenReturn(false);
		cList.delClient(client);
		assertEquals(0, cList.size());
	}

	@Test(expected = ClientHaveOrdersException.class)
	public void testDelClientWithOrder() throws Exception {
		Clients cList = new ClientsImpl();
		Client client = mock(Client.class);
		
		cList.addClient(client);
		when((client).hasOrder()).thenReturn(true);

		cList.delClient(client);

	}

}
