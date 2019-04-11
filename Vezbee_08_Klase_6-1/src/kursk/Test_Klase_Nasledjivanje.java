package kursk;

import java.util.ArrayList;

import naseKlase.A;
import naseKlase.B;
import naseKlase.C;
import naseKlase.D;
import naseKlase.Macka;
import naseKlase.Pas;
import naseKlase.Zivotinja;

public class Test_Klase_Nasledjivanje 
{

	public static void main(String[] args) 
	{
		
	/*
		  Zivotinja z1 = new Zivotinja("bubamara", "Mara");
		System.out.println(z1);
		
		Pas p1 = new Pas("labrador", "Beti");
		System.out.println(p1);
		p1.Rezi();  .......................................     // moze jer je metoda "Rezi()" u klasi  "Pas" pa moze da se doda obj p1 . Rezi();
	
		System.out.println("****************************");
		Zivotinja z2 = new Pas("vucjak","Aron");
//		z2.Rezi();  .......................................     // ne vidi na nize (metodu podklase)
		System.out.println(z2);
		
		if(z2 instanceof Pas)
			((Pas)z2).Rezi();
	 */
		Zivotinja z1 = new Zivotinja("bubamara", "Mara");
		Pas p1 = new Pas("labrador", "Beti");
		Zivotinja z2 = new Pas("vucjak", "Aron");
		Pas p2 = new Pas("dalmatinac", "Aki");
		Macka m1 = new Macka("persijska", "Cile");
		
		// najbolje je Klasa Velikim slovom u jednini, a ime ArrayList-e malim slovom u mnozini
		ArrayList<Zivotinja> zivotinje = new ArrayList<>();
		zivotinje.add(z1);
		zivotinje.add(p1);
		zivotinje.add(z2);
		zivotinje.add(p2);
		zivotinje.add(m1);
		zivotinje.add(new Pas("sarplaninac", "Pasa"));
		zivotinje.add(new Macka("sijamska", "Gile"));
		
		int vrednost = 0;
		
//	    for ( ime klase  objekat : lista )	
		for (Zivotinja ziv: zivotinje) 
		{
			System.out.println(ziv);
			
			if(ziv instanceof Pas)
				((Pas)ziv).Rezi();
			else if(ziv instanceof Macka)
			{
	/*			((Macka)ziv).Prede();
				((Macka)ziv).Grebe();
				
				Gornja dva reda i donja tri rade istu stvar
	*/
				Macka macka = (Macka)ziv;
				macka.Prede();
				macka.Grebe();
			}
			
			vrednost += ziv.GetVrednost();
			
			System.out.println("------------------------------------------");
		}
		
		System.out.println("Ukupna vrednost zivotinja je = " + vrednost);
		
		
/*		A a = new A();
		A aa = new A();
		System.out.println("*******************************");
		B b = new B();
		System.out.println("*******************************");
		C c = new C(45, 87);
		System.out.println("*******************************");
		D d = new D();
		System.out.println("*******************************");
*/
				
	}

}
