

public class Vendeur extends Entreprise{

	int salaire;
	int annee;
	int commission;
	
	public Vendeur(int s,int a,int c)
	{
		salaire=s;
		annee=a;
		commission=c;
	}
	
	@Override
	public int getSalaire()
	{
		return salaire;
	}
	
	@Override
	public void incSalaire()
	{
		salaire+=commission;
	}
	
	
}
