package br.com.rafaelchagasb.project;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.rafaelchagasb.project.models.Event;
import br.com.rafaelchagasb.project.models.EventPlace;
import junit.framework.Assert;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
class ProjectApplicationTests {

	@Autowired
    private TestEntityManager entityManager;
	
	@Test
	void contextLoads() {
		
		EventPlace place = new EventPlace();
		
		place.setAddress("adress");
		place.setCapacity(1);
		place.setCep("0000000");
		place.setName("name");
		place.setEvent(new ArrayList<Event>());
		
		place = entityManager.persist(place);
		
		//event 1
		Event event = new Event();
		
		event.setName("name");
		event.setDateHour(new Date());
		event.setValueTicket(new Double(1));
		event.setEventExpire(new Date());
		event.setDescription("desceventription");
		event.setPlace(place);

		entityManager.persist(event);
		
		//event 2
		event = new Event();
		
		event.setName("name2");
		event.setDateHour(new Date());
		event.setValueTicket(new Double(1));
		event.setEventExpire(new Date());
		event.setDescription("description2");
		event.setPlace(place);
		
		entityManager.persist(event);
		
		EventPlace placeManager = (EventPlace) entityManager.find(EventPlace.class, place.getIdPlace());
		
		entityManager.getEntityManager().getTransaction().commit();
	}

}
