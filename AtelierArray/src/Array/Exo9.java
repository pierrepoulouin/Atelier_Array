package Array;
import java.util.Scanner;

//Demander � l�utilisateur d�entrer un nombre entier. 
//Le comparer � chaque �l�ment du tableau. Si les nombres sont identiques, afficher �Bravo !�. 
//Sinon, afficher �Perdu !�.
///!\ Les boucles sont interdites !

public class Exo9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cr�ation du tableau, initialisation de sa taille et de ses �l�ments
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
		//Je cr�� une variable nomm�e "sc" de type "Scanner", et son instance.
		Scanner sc = new Scanner(System.in);
		
		//Je demande � l'utilisateur d'entrer un nombre entier.  
		System.out.println("Rentrez un nombre entier : ");
		
		// Je cr�� la variable qui va contenir ce que l'utilisateur rentre.
		int input = sc.nextInt();
		
		// Le comparer � chaque �l�ment du tableau. KEEP IT SIMPLE!!!
		//Si les nombres sont identiques, afficher �Bravo !�. Sinon, afficher �Perdu !�.
		if (input == tab[0]) {
			System.out.println("Bravo !");
		}
		else if (input == tab[1]) {
			System.out.println("Bravo !");
		}
		else if (input == tab[2]) {
			System.out.println("Bravo !");
		}
		else if (input == tab[3]) {
			System.out.println("Bravo !");
		}
		else if (input == tab[4]) {
			System.out.println("Bravo !");
		}
		else if (input == tab[5]) {
			System.out.println("Bravo !");
		}
		else if (input == tab[6]) {
			System.out.println("Bravo !");
		}
		else if (input == tab[7]) {
			System.out.println("Bravo !");
		}
		else {
			System.out.print("Perdu !");
		}
	}

}