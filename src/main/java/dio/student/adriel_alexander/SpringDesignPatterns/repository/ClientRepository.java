package dio.student.adriel_alexander.SpringDesignPatterns.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.student.adriel_alexander.SpringDesignPatterns.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
