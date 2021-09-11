package test;

import java.util.Scanner;

public class TestScanner
{
	
	// Procédure sortie console
	public static void console(String ligne)
	{
		
		System.out.println(ligne);
		
	}

	// Procédure sortie error
	public static void error(String ligne)
	{
		
		System.err.println(ligne);
		
	}
	
	
	
	// Procédure principale
	public static void main(String[] args)
	{

		console("Bonjour !");

		Scanner sc = new Scanner( System.in );
		
		console("Premier nombre : ");
				
		String nbrUn = sc.nextLine();
		
		int un = Integer.valueOf(nbrUn);
		
		console("Second nombre : ");
		
		String nbrDeux = sc.nextLine();
		
		int deux = Integer.valueOf(nbrDeux);
		
		
		int r = un + deux;
		
		
		console("Le résultat est : " + r );
		
	}

}
