package Array;
import java.util.Scanner;

public class Exo9bis {

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

		// Le comparer à chaque élément du tableau. KEEP IT SIMPLE!!!
		//Si les nombres sont identiques, afficher “Bravo !”. Sinon, afficher “Perdu !”.
		if ((input == tab[0]) || (input == tab[1]) || (input == tab[2]) || (input == tab[3]) 		|| (input == tab[4]) || (input == tab[5]) || (input == tab[6]) || (input == tab[7]))
		{
			System.out.println("Bravo !");
		}
		//Sinon, afficher “Perdu !”.
		else {
			System.out.println("Perdu");
		}
	}
}