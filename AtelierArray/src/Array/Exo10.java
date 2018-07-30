package Array;
import java.util.Scanner;

//Demander à l’utilisateur d’entrer un nombre entier.
//Le comparer à chaque élément du tableau. 
//Si les nombres sont identiques, afficher “Bravo !”.
//Sinon, afficher “Perdu !”.
///!\ La boucle est obligatoire !

public class Exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//création du tableau, initialisation de sa taille et de ses éléments
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
				
		//Je créé une variable nommée "sc" de type "Scanner", et son instance.
		Scanner sc = new Scanner(System.in);
				
		//Je demande à l'utilisateur d'entrer un nombre entier.  
		System.out.println("Rentrez un nombre entier : ");
		
		// Je créé la variable qui va contenir ce que l'utilisateur rentre.
		int input = sc.nextInt();
		
		//Le comparer à chaque élément du tableau. 
		//Si les nombres sont identiques, afficher “Bravo !”.
		//Sinon, afficher “Perdu !”.
		///!\ La boucle for est obligatoire !
		
		
		//on crée la boucle 
		for (int i=0; i< tab.length; i++) {
			//Si les nombres sont identiques, afficher “Bravo !”.
			if (input == tab[i]) {
				System.out.println("Vous avez gagné !");
			}
			//Sinon, afficher “Perdu !”.
			else {
				System.out.println("Vous avez perdu !");
			}
		}
	}

}
