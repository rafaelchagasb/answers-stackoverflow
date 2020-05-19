package br.com.rafaelchagasb.project.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;

@Entity 
@Table(name = "EVENT_PLACE") 
public class EventPlace {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private long idPlace;

	@Column(name = "NAME", nullable = false, length = 150)
	@NotBlank
	private String name;

	@Column(name = "ADDRESS", nullable = false, length = 150)
	@NotBlank
	private String address;

	@Column(name = "CAPACITY")
	private int capacity;

	@Column(name = "cep", nullable = false, length = 35)
	private String cep;

	@OneToMany(mappedBy = "place")
	private List<Event> event = new ArrayList<>();

	public long getIdPlace() {
		return idPlace;
	}
	
	public void setIdPlace(long idPlace) {
		this.idPlace = idPlace;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getAddress() {
	    return address;
	}

	public void setAddress(String address) {
	    this.address = address;
	}

	public int getCapacity() {
	    return capacity;
	}

	public void setCapacity(int capacity) {
	    this.capacity = capacity;
	}

	public String getCep() {
	    return cep;
	}

	public void setCep(String cep) {
	    this.cep = cep;
	}

	public List<Event> getEvent() {
	    return event;
	}

	public void setEvent(List<Event> event) {
	    this.event = event;
	}

	public static long getSerialversionuid() {
	    return serialVersionUID;
	}
}
