import junit.framework.TestCase;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Apptest extends TestCase{

@Test
public void testlisteEntreprise(){

	ArrayList<Employe> e=new ArrayList<Employe>();
	assertTrue(e.isEmpty());
  }

@Test
public void testEmploye(){
	Employe e=new Employe(1500);
	assertEquals(e.getSalaire(),1500);
	e.incAnnee();
	assertEquals(e.getSalaire(),1520);
  }

@Test(expected=IllegalArgumentException.class)
public void testEmployeSalaireInfSMIC(){
	try
	{
		Employe e=new Employe(1000);
	}catch(IllegalArgumentException e)
	{
		assert(e.getMessage().contains("le salaire ne peut être infèrieur au SMIC"));
	}
  }

@Test
public void testVendeur(){
	Vendeur e=new Vendeur(1500,40);
	assertEquals(e.getSalaire(),1500);
	e.incAnnee();
	assertEquals(e.getSalaire(),1540);
  }
}
