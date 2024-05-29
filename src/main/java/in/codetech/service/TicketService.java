package in.codetech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.codetech.reponse.Ticket;
import in.codetech.request.Passanger;

@Service
public interface TicketService {

	Ticket bookTicket(Ticket ticket);

	Ticket getTicketById(int ticketId);

	Ticket updateTicket(Ticket ticket);

	void deleteTicket(int ticketId);

}
