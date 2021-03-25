package com.revature.ws;

public class MessageMain {

	public static void main(String[] args) {

		MessageGenService msgen = new MessageGenService();
		MessageGen msport = msgen.getMessageGenImplPort();
		System.out.println("MessageGenService: " + msport.getMessage());
		System.out.println("MessageGenService: " + msport.getAnotherMessage());

		PersonService_Service personService = new PersonService_Service();
		PersonService personPort = personService.getPersonServiceImplPort();
		Person person = new Person();
		person.setPersonAge(10);
		person.setPersonName("DK");
		personPort.addPerson(person);
		
		
		
		
		

	}

}
