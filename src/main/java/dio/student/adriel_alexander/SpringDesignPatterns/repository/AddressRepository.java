package dio.student.adriel_alexander.SpringDesignPatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.student.adriel_alexander.SpringDesignPatterns.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, String> {

}
