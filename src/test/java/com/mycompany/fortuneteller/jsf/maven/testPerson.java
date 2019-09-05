package com.mycompany.fortuneteller.jsf.maven;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mycompany.fortuneteller.jsf.maven.Person;

public class testPerson {

	@Test
	public void testgenerateMessage() {
		Person p = new Person();
		p.setAlder(50);
		p.setNamn("sandra");
		p.setKon("woman");
		p.setJobb("programmerare");

		for (int x = 0; x < 100; x++) {
			p.generateMessage();
			assertTrue((p.getMessage().contains("Det var ett fint namn"))
					|| (p.getMessage().contains("Du ar i livets gyllende ar, vad"))
					|| (p.getMessage().contains("Vilket fint h")) || (p.getMessage().contains("Du ar en del av fr")));

		}
		for (int x = 0; x < 100; x++) {
			p.generateMessage();
			assertFalse((p.getMessage().contains("Ett ordentligt ")) || (p.getMessage().contains("oj du var ga"))
					|| (p.getMessage().contains("HORSE IS NOT A GE"))
					|| (p.getMessage().contains("Du skapar framtidens l")));

		}
	}
	@Test
	   public void testsetMessage(){
	       Person p = new Person();
	       p.setMessage("testConfirmation");
	       assertTrue(p.getMessage().equalsIgnoreCase("testConfirmation"));
	   }

}