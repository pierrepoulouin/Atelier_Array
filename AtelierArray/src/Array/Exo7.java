package Array;

import java.util.Scanner;
/*Demander � l�utilisateur d�entrer un nombre entier. 
Le comparer au troisi�me �l�ment du tableau. 
Si les nombres sont identiques, afficher �Bravo !�.*/

public class Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation du tableau, initialisation de sa taille et de ses �l�ments
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
				
		// D�clarer une variable de type Scanner
		Scanner sc;
				
		//Cr�ation de l'instance de la classe Scanner
		sc = new Scanner(System.in);
		
		//Indiquer � l'utilisateur de taper un nombre entier
		System.out.println("Veuillez entrer un nombre entier.");
		
		//Cr�ation  d'une variable nomm�e input pour y stocker l'entier entr� par l'utilisateur
		int input = sc.nextInt();
				
		//Comparer l'entr�e utilisateur avec le 3e �l�ment du tableau 
		// Si les �l�ments correspondent afficher " Bravo !"
		if (input == tab[2] ) {
			System.out.println("Bravo !");
		} 
	}
}
		
		