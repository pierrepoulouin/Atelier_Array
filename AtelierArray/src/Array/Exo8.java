package Array;
//importe de Scanner
import java.util.Scanner;

/*8) Demander à l’utilisateur d’entrer un nombre entier. 
Le comparer au troisième élément du tableau. 
Si les nombres sont identiques, afficher “Bravo !”. Sinon, afficher “Perdu !”.*/

public class Exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//création du tableau, initialisation de sa taille et de ses éléments
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
		System.out.println("Entrez le nombe entier:");
		//declaration de variable "sc" de type "Scanner"
		Scanner sc = new Scanner(System.in);
		//declaration de variable "input" de type "int"
		int input = sc.nextInt();
		
		/*Le comparer au troisième élément du tableau. 
		Si les nombres sont identiques, afficher “Bravo !”. Sinon, afficher “Perdu !”.*/
		//definition de premier condition
		if (input == tab[2]) {
			//si la condition est bonne, afficher "Bravo !"
			System.out.println("Bravo !");
		} 
		else {
			//dans toutes les autres cas afficher "Perdu"
			System.out.println("Oups !");
		}

	}

}