package Array;
//importer le Scanner
import java.util.Scanner;

/*5) Demander à l’utilisateur d’entrer un nombre entier et stocker sa valeur 
* dans une variable nommée input.*/

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//déclarer le Scanner		
		//Scanner <nom du Scanner>;
		Scanner sc;
		
		//créer une instance de Scanner avec le mot-clé new
		//<nom du Scanner> = new Scanner(System.in);
		sc = new Scanner(System.in);
		
		//afficher une instruction à l'utilisateur
		System.out.println("entre un entier");
		
		//stocker la valeur que l'utilisateur a entrée
		int input = sc.nextInt();
		System.out.println(input);
	}

}