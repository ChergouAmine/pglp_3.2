import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Entreprise> e=new ArrayList<Entreprise>();
		
		e.add(new Employe(1500,3));
		e.add(new Employe(1300,1));
		e.add(new Vendeur(2000,6,50));
		e.add(new Vendeur(2800,12,70));
		
		int somme=0;
		
		for(int i=0;i<e.size();i++) 
		{
			somme+=e.get(i).getSalaire();					
		}
		
		System.out.println(somme);
	}

}
