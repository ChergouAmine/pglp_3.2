
public class Employe extends Entreprise{

	int salaire;
	int annee;
	
	public Employe(int s,int a)
	{
		salaire=s;
		annee=a;
	}
	
	@Override
	public int getSalaire()
	{
		return salaire;
	}
	
	@Override
	public void incSalaire()
	{
		annee++;
		salaire+=20;
	}
	
	
}
