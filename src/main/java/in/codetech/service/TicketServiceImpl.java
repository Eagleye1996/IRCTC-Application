package in.codetech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codetech.reponse.Ticket;
import in.codetech.repository.TicketRepo;
import in.codetech.request.Passanger;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	private TicketRepo ticketRepo ;

	 @Override
	    public Ticket bookTicket(Ticket ticket) {
	        return ticketRepo.save(ticket);
	    }

	    @Override
	    public Ticket getTicketById(int ticketId) {
	        return ticketRepo.findById(ticketId).orElse(null);
	    }

	    @Override
	    public Ticket updateTicket(Ticket ticket) {
	        // Assuming ticketId is not null and the ticket exists in the database
	        return ticketRepo.save(ticket);
	    }

	    @Override
	    public void deleteTicket(int ticketId) {
	    	ticketRepo.deleteById(ticketId);
	    }
	
	
//
//	@Override
//	public Ticket bookTicket(Passanger passanger) {
//		// TODO Auto-generated method stub
//		Ticket ticket = new Ticket();
//
//		ticket.setFrom(passanger.getFrom());
//		ticket.setTo(passanger.getTo());
//		ticket.setTicketStatus("CONFIRMED");
//		ticket.setTrainNum(passanger.getTrainNum());
//		ticket.setTktCost("1200.00 INR");
//
//		return ticketRepo.save(ticket);
//	}
//
//	@Override
//	public Ticket getTicket(int ticketId) {
//		// TODO Auto-generated method stub
//		Optional<Ticket> ticket = ticketRepo.findById(ticketId) ;
//		if(ticket.isPresent()) {
//			return ticket.get();
//		}
//		return null;
//	}
//
//	@Override
//	public List<Ticket> getAll() {
//		// TODO Auto-generated method stub
//		return ticketRepo.findAll();
//	}
//
//	@Override
//	public Ticket updateTicketById(int ticketId, Passanger passanger) {
//		// TODO Auto-generated method stub
//		Optional<Ticket> optional = ticketRepo.findById(ticketId) ;
//		
//		if(optional.isPresent()) {
//			Ticket ticket = new Ticket();
//
//			ticket.setFrom(passanger.getFrom());
//			ticket.setTo(passanger.getTo());
//			ticket.setTicketStatus("CONFIRMED");
//			ticket.setTrainNum(passanger.getTrainNum());
//			ticket.setTktCost("1200.00 INR");
//			
//			ticketRepo.save(ticket) ;
//		}
//		return null;
//	}
//
//	@Override
//	public Ticket deleteById(int ticketId) {
//		// TODO Auto-generated method stub
//		Optional<Ticket> optional = ticketRepo.findById(ticketId) ;
//		if(optional.isPresent()) {
//			ticketRepo.delete(optional.get()); 
//		}
//		return null;
//	}

}
