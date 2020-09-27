package no.hvl.dat100.lab6.matriser;

import static javax.swing.JOptionPane.*;

import java.util.Arrays;

import static java.lang.Integer.*;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		 for (int[] row : matrise) { 
	         for (int x : row) {
	            System.out.print(matrise[i][x] + " ");
	         }
	         System.out.println(); 
	      }
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String strng = "";
		for (int[] row : matrise) {
			strng += "\n";
			for (int x : row) {
			strng += x + " ";}
			} return strng;
		}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		if (Arrays.equals(a, b))
			return true;
		else return false;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
