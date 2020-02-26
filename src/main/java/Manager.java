import java.util.ArrayList;

public class Manager extends Employe{

	ArrayList<Employe> listeEmploye;
	
	public Manager(int s)
	{
		super(s);
		listeEmploye=new ArrayList<Employe>();
	}
	
	public void ajouterEmploye(Employe e)
	{
		listeEmploye.add(e);
		salaire+=100;
	}
	
	
	

}
