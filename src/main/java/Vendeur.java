

public class Vendeur extends Employe{

	int commission;
	
	public Vendeur(int s,int c)
	{
		super(s);
		commission=c;
	}
	
	@Override
	public void incAnnee()
	{
		super.incAnnee();
		salaire+=commission;
	}
	
	
}
