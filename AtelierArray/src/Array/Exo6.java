package Array;


import java.util.Scanner;

/*6) Demander à l’utilisateur d’entrer le nombre 25. 
Il devra remplacer le cinquième élément du tableau.*/


public class Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//création du tableau, initialisation de sa taille et de ses éléments
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
		// demander à l'utilisateur d'entrer le nombre 25
		System.out.println(" Entrer le nombre 25 : ");
		
		// déclarer une variable de type Scanner qui se nomme sc puis créer une instance de Scanner
		Scanner sc = new Scanner(System.in);
		
		// récupere et stocker la valeur de l'entier saisi dans le scanner
		int input = sc.nextInt();
		
		// remplacer le cinquième élément du tableau par la valeur entière saisie par l'utilisateur
		tab[4]= input;
		System.out.println(tab[4]);
	}

}