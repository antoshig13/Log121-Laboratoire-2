package TestJunit;

import JeuDeFramework.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import JeuDeFramework.De;

public class DeTest {

	private De de1;
	private De de2;

	@Before
	public void setUp() throws Exception {
		 de1 = new De(6);
		 de2 = new De(6);
	}
	@Test
	public void deSuperieurTest(){
		de1.setFacesObtenu(4);
		de2.setFacesObtenu(5);
		assertTrue(de1.compareTo(de2)==-1);
	}

	@Test
	public void deInferieurTest(){
		de1.setFacesObtenu(4);
		de2.setFacesObtenu(5);
		assertTrue(de2.compareTo(de1)==1);
	}

	@Test
	public void memeDeTest(){
		de1.setFacesObtenu(4);
		assertTrue(de1.compareTo(de1)==0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deNullTest(){
		de1.setFacesObtenu(4);
		de1.compareTo(null);
	}

}
