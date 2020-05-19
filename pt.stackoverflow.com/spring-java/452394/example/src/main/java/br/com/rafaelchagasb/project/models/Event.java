package br.com.rafaelchagasb.project.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "EVENT") 
public class Event {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	private long idEvent;

	@Column(name = "name", nullable = false, length = 80)
	@NotBlank
	private String name;

	@Column(name = "DATE_HOUR", nullable = false)
	@NotNull
	private Date dateHour;

	@Column(name = "AMOUNT_TICKET", nullable = false)
	@NotNull
	private int amountTicket;

	@Column(name = "VALUE_TICKET", nullable = false)
	@NotNull
	private Double valueTicket;

	@Column(name = "EVENT_EXPIRE", nullable = false)
	@NotNull
	private Date eventExpire;

	@Column(name = "description", nullable = false, length = 300)
	@NotBlank
	@Lob
	private String description;

	@ManyToOne
	@JoinColumn(name = "EVENT_PLACE_IDPLACE", referencedColumnName = "id")
	private EventPlace place;

	public long getIdEvent() {
		return idEvent;
	}
	
	public void setIdEvent(long idEvent) {
		this.idEvent = idEvent;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public Date getDateHour() {
	    return dateHour;
	}

	public void setDateHour(Date dateHour) {
	    this.dateHour = dateHour;
	}

	public int getAmountTicket() {
	    return amountTicket;
	}

	public void setAmountTicket(int amountTicket) {
	    this.amountTicket = amountTicket;
	}

	public Double getValueTicket() {
	    return valueTicket;
	}

	public void setValueTicket(Double valueTicket) {
	    this.valueTicket = valueTicket;
	}

	public Date getEventExpire() {
	    return eventExpire;
	}

	public void setEventExpire(Date eventExpire) {
	    this.eventExpire = eventExpire;
	}

	public String getDescription() {
	    return description;
	}

	public void setDescription(String description) {
	    this.description = description;
	}

	public EventPlace getPlace() {
	    return place;
	}

	public void setPlace(EventPlace place) {
	    this.place = place;
	}

	public static long getSerialversionuid() {
	    return serialVersionUID;
	}
	
}
