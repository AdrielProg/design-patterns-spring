package dio.student.adriel_alexander.SpringDesignPatterns.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.student.adriel_alexander.SpringDesignPatterns.model.Address;
import dio.student.adriel_alexander.SpringDesignPatterns.model.Client;
import dio.student.adriel_alexander.SpringDesignPatterns.repository.AddressRepository;
import dio.student.adriel_alexander.SpringDesignPatterns.repository.ClientRepository;
import dio.student.adriel_alexander.SpringDesignPatterns.service.ClientService;
import dio.student.adriel_alexander.SpringDesignPatterns.service.ViaCepService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private ViaCepService viaCepService;

	@Override
	public Iterable<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client findById(Long id) {
		Optional<Client> client = clientRepository.findById(id);
		return client.get();
	}

	@Override
	public void put(Client client) {

		saveClientWithPostalCode(client);
	}

	@Override
	public void update(Long id, Client client) {
		Optional<Client> clientDB = clientRepository.findById(id);
		if (clientDB.get().getId() == id) {
			saveClientWithPostalCode(client);
		}
	}

	@Override
	public void delete(Long id) {
		clientRepository.deleteById(id);

	}

	private void saveClientWithPostalCode(Client client) {
		String zipCode = client.getAddress().getCep();
		Address address = addressRepository.findById(zipCode).orElseGet(() -> {

			Address newAddress = viaCepService.zipCodeQuery(zipCode);
			addressRepository.save(newAddress);
			return newAddress;
		});
		client.setAddress(address);
		clientRepository.save(client);
	}

}
