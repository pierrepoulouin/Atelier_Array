package Array;


import java.util.Scanner;

/*6) Demander � l�utilisateur d�entrer le nombre 25. 
Il devra remplacer le cinqui�me �l�ment du tableau.*/


public class Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//cr�ation du tableau, initialisation de sa taille et de ses �l�ments
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
		// demander � l'utilisateur d'entrer le nombre 25
		System.out.println(" Entrer le nombre 25 : ");
		
		// d�clarer une variable de type Scanner qui se nomme sc puis cr�er une instance de Scanner
		Scanner sc = new Scanner(System.in);
		
		// r�cupere et stocker la valeur de l'entier saisi dans le scanner
		int input = sc.nextInt();
		
		// remplacer le cinqui�me �l�ment du tableau par la valeur enti�re saisie par l'utilisateur
		tab[4]= input;
		System.out.println(tab[4]);
	}

}