package com.test.freme;
import com.test.freme.model.*;
import lombok.extern.log4j.Log4j;


@Log4j
public class AppMain {

	/******* VARIABLES *******/

	/******* METHODS *******/
	
	public static void main(String[] args) {
		
		log.debug("Entering main method");
		
		log.info("created Person object");
		Person p = new Person();
		p.setAddress("some address");
		p.setAge(26);
		p.setLastName("some last name");
		p.setFirstName("some first name");
		
		log.info("Person" + p.toString());
		
		log.info("created Individual object");
		Individual i = Individual.builder().build();
		i.setAddress("some other address");
		i.setAge(36);
		i.setLastName("some other last name");
		i.setFirstName("some other first name");
		log.info("Individual" + i.toString());
		
		log.info("created Individual object 2");
		Individual i2 = Individual.builder()
						.lastName("yet another last name")
						.firstName("yet another first name")
						.age(46)
						.address("yet another address")
						.build();
		log.info("Individual 2" + i2.toString());
	}
}