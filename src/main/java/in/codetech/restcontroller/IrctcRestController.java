package in.codetech.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.codetech.reponse.Ticket;
import in.codetech.request.Passanger;
import in.codetech.service.TicketService;

@RestController
public class IrctcRestController {

	@Autowired
	private TicketService ticketService;
	
	@PostMapping(value = "/ticket", consumes = {"application/xml", "application/json"}, produces = {"application/xml", "application/json"})
    public Ticket bookTicket(@RequestBody Passanger passanger) {
        Ticket ticket = new Ticket();
        // Populate ticket data from passanger object
        // Assuming you have logic here to populate ticket data from passanger
        return ticketService.bookTicket(ticket);
    }

    @GetMapping(value = "/ticket/{ticketId}", produces = {"application/xml", "application/json"})
    public Ticket getTicket(@PathVariable int ticketId) {
        return ticketService.getTicketById(ticketId);
    }

    @PutMapping(value = "/ticket/{ticketId}", consumes = {"application/xml", "application/json"}, produces = {"application/xml", "application/json"})
    public Ticket updateTicket(@PathVariable int ticketId, @RequestBody Ticket ticket) {
        ticket.setTicketId(ticketId); // Ensure ticketId is set correctly
        return ticketService.updateTicket(ticket);
    }

    @DeleteMapping("/ticket/{ticketId}")
    public void deleteTicket(@PathVariable int ticketId) {
        ticketService.deleteTicket(ticketId);
    }


//	@PostMapping(value = "/ticket", consumes = { "application/xml", "application/json" }, produces = {
//			"application/xml", "application/json" })
//	public Ticket bookTicket(@RequestBody Passanger passanger) {
//
//		return serviceImpl.bookTicket(passanger);
//
//	}
//
//	@GetMapping(value = "/ticket/{ticketId}", produces = { "application/xml", "application/json" })
//	public Ticket getTicket(@PathVariable Integer ticketId) {
//
//		return serviceImpl.getTicket(ticketId);
//	}
//	
//	@GetMapping(value = "/ticket/getAll", produces = { "application/xml", "application/json" })
//	public List<Ticket> getAll(){
//		return serviceImpl.getAll() ;
//	}
//	
//	@PutMapping(value = "/ticket/update/{ticketId}", consumes = { "application/xml", "application/json" }, produces = {
//			"application/xml", "application/json" })
//	public Ticket updateTicket(@PathVariable int ticketId,@RequestBody Passanger passanger) {
//		return serviceImpl.updateTicketById(ticketId, passanger) ;
//	}
//	
//	@DeleteMapping(value = "/ticket/delete/{ticketId}")
//	public Ticket deleteById(@PathVariable int ticketId) {
//		return serviceImpl.deleteById(ticketId) ;
//	}

}
