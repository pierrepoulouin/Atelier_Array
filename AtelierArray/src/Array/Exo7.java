package Array;

import java.util.Scanner;
/*Demander à l’utilisateur d’entrer un nombre entier. 
Le comparer au troisième élément du tableau. 
Si les nombres sont identiques, afficher “Bravo !”.*/

public class Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation du tableau, initialisation de sa taille et de ses éléments
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
				
		// Déclarer une variable de type Scanner
		Scanner sc;
				
		//Création de l'instance de la classe Scanner
		sc = new Scanner(System.in);
		
		//Indiquer à l'utilisateur de taper un nombre entier
		System.out.println("Veuillez entrer un nombre entier.");
		
		//Création  d'une variable nommée input pour y stocker l'entier entré par l'utilisateur
		int input = sc.nextInt();
				
		//Comparer l'entrée utilisateur avec le 3e élément du tableau 
		// Si les éléments correspondent afficher " Bravo !"
		if (input == tab[2] ) {
			System.out.println("Bravo !");
		} 
	}
}
		
		