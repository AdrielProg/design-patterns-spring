package dio.student.adriel_alexander.SpringDesignPatterns.service;

import dio.student.adriel_alexander.SpringDesignPatterns.model.Client;

/**
 * Interface that defines the pattern <b>Strategy</b>
 * @author adrielProg
 * 
 */

public interface ClientService {
	Iterable<Client> findAll(); 
	
	Client findById(Long id);
	
	void put(Client client); 
	
	void update(Long id, Client client);
	
	void delete(Long id); 
}
