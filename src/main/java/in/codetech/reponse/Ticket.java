package in.codetech.reponse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name = "Ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;
	private String from;
	private String to;
	private String trainNum;
	private String tktCost;
	private String ticketStatus;
	
	public Ticket() {
		
	}
	
	public Ticket(Integer ticketId, String from, String to, String trainNum, String tktCost, String ticketStatus) {
		super();
		this.ticketId = ticketId;
		this.from = from;
		this.to = to;
		this.trainNum = trainNum;
		this.tktCost = tktCost;
		this.ticketStatus = ticketStatus;
	}
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public String getTktCost() {
		return tktCost;
	}
	public void setTktCost(String tktCost) {
		this.tktCost = tktCost;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	
}
