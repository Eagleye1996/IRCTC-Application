package in.codetech.request;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passanger")
public class Passanger  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	private String fName;
	private String lName;
	private String from;
	private String to;
	private String doj;
	private String trainNum;
	
	
	
	
	public Passanger(int id, String fName, String lName, String from, String to, String doj, String trainNum) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.from = from;
		this.to = to;
		this.doj = doj;
		this.trainNum = trainNum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
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
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
}
