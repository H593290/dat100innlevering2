package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO

int[] tabellen = {1, 2, 3, 4};
for(int i = 0; i < tabellen.length; i++);

	
	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String strng = "[";
	for (int i = 0; i < tabell.length; i++)  {
System.out.print(tabell[i]+ ",");}
	strng += "]";
	
	return strng;

		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int summer = 0;
		for (int tall : tabell) {
			summer += tall;}
		return summer;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		for ( final int i : tabell)
		if (i == tall) { return true;
}
		else {
			return false;
		}
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
	
     

	}

	

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int sistetall = tabell.length - 1;
		for (int i = 0; i <= sistetall/2; i++) {
			int x = tabell[i];
			tabell[sistetall-i] = i;
			} return i;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
	

	// h)
	public static int[] settsammen(int[] tabell1, int[] tabell2) {

		// TODO
		int nytabell = tabell1.length + tabell2.length;
	    int[] ny = new int[nytabell];
	    for (int i=0; i < tabell1.length; i++) {
	      ny[i] = tabell1[i];
	    }
	    for (int x=0; x < tabell2.length; x++) {
	      ny[tabell1.length+x] = tabell2[x];
	    }
	   
	  }

			
		
	}
}
