import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Employe> e=new ArrayList<Employe>();
		
		e.add(new Employe(1500));
		e.add(new Employe(1300));
		e.add(new Vendeur(2000,50));
		e.add(new Vendeur(2800,70));
		
		int somme=0;
		
		for(int i=0;i<e.size();i++) 
		{
			somme+=e.get(i).getSalaire();					
		}
		
		System.out.println(somme);
	}

}
