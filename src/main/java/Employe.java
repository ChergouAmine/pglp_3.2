
public class Employe{

	int salaire;
	int annee;
	
	public Employe(int s) throws IllegalArgumentException
	{
		if(s<1200)
			throw new IllegalArgumentException("le salaire ne peut être infèrieur au SMIC");
		else {
			salaire=s;
			annee=0;
		}

	}
	
	
	public int getSalaire()
	{
		return salaire;
	}
	
	
	public void incAnnee()
	{
		annee++;
		salaire+=20;
	}
	
	
}
