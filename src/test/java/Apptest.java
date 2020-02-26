import junit.framework.TestCase;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Apptest extends TestCase{

@Test
public void testlisteEntreprise(){

	ArrayList<Entreprise> e=new ArrayList<Entreprise>();
	assertTrue(e.isEmpty());
  }

@Test
public void testajoutEmploye(){
	Employe e=new Employe(1500,3);
	assertEquals(e.getSalaire(),1500);
	e.incSalaire();
	assertEquals(e.annee,4);
	assertEquals(e.getSalaire(),1520);
  }

@Test
public void testajoutVendeur(){
	Vendeur e=new Vendeur(1500,3,40);
	assertEquals(e.getSalaire(),1500);
	e.incSalaire();
	assertEquals(e.getSalaire(),1540);
  }
}
