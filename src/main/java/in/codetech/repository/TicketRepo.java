package in.codetech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codetech.reponse.Ticket;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
