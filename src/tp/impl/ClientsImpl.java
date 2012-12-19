package tp.impl;

import java.util.ArrayList;
import java.util.List;

import tp.Client;
import tp.ClientHaveOrdersException;
import tp.Clients;



public class ClientsImpl implements Clients{

	private List<Client> clients;

	public ClientsImpl() {
		super();
		clients = new ArrayList<Client>();
	}

	public int size() {
		return clients.size();
	}

	public Client getClient(int i) {
		return this.clients.get(i);
	}
	
	public void addClient(Client client) {
		this.clients.add(client);		
	}

	public void delClient(Client client) throws ClientHaveOrdersException{
		if(client.hasOrder()) throw new ClientHaveOrdersException();
		this.clients.remove(client);		
	}

	
	

}
