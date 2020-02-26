import junit.framework.TestCase;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Apptest extends TestCase{

@Test
public void testlisteEmploye(){

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

@Test
public void testManager(){
	Manager e=new Manager(1500);
	assertEquals(e.getSalaire(),1500);
	e.incAnnee();
	assertEquals(e.getSalaire(),1520);
	
	Vendeur v=new Vendeur(1500,40);
	e.ajouterEmploye(v);
	assertEquals(e.getSalaire(),1620);
  }

@Test(expected=IllegalArgumentException.class)
public void testVendeurSalaireInfSMIC(){
	try
	{
		Vendeur e=new Vendeur(1000,40);
	}catch(IllegalArgumentException e)
	{
		assert(e.getMessage().contains("le salaire ne peut être infèrieur au SMIC"));
	}
  }

@Test(expected=IllegalArgumentException.class)
public void testManagerSalaireInfSMIC(){
	try
	{
		Manager e=new Manager(1000);
	}catch(IllegalArgumentException e)
	{
		assert(e.getMessage().contains("le salaire ne peut être infèrieur au SMIC"));
	}
  }
}
