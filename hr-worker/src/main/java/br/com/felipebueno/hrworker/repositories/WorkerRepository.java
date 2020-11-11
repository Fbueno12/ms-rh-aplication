package br.com.felipebueno.hrworker.repositories;

import br.com.felipebueno.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
