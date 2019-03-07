package TestJunit;
import JeuDeFramework.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JoueurTest {

	private Joueur joueur1;
	private Joueur joueur2;
	
	@Before
	public void setUp() throws Exception {
		joueur1 = new Joueur("Anthony");
		joueur2 = new Joueur("Moussa");
	}

	@Test
	public void JoueurScoreSuperieurTest(){
		joueur1.setScore(10);
		joueur2.setScore(20);
		System.out.print(joueur1.compareTo(joueur2));
		assertTrue(joueur1.compareTo(joueur2)==-1);
	}

	@Test
	public void JoueurScoreInferieurTest(){
		joueur1.setScore(10);
		joueur2.setScore(20);
		assertTrue(joueur2.compareTo(joueur1)==1);
	}

	@Test
	public void memeJoueurScoreTest(){
		joueur1.setScore(10);
		assertTrue(joueur1.compareTo(joueur1)==0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void deNullTest(){
		joueur1.setScore(4);
		joueur1.compareTo(null);
	}

}
