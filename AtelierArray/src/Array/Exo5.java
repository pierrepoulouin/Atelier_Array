package Array;
//importer le Scanner
import java.util.Scanner;

/*5) Demander � l�utilisateur d�entrer un nombre entier et stocker sa valeur 
* dans une variable nomm�e input.*/

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//d�clarer le Scanner		
		//Scanner <nom du Scanner>;
		Scanner sc;
		
		//cr�er une instance de Scanner avec le mot-cl� new
		//<nom du Scanner> = new Scanner(System.in);
		sc = new Scanner(System.in);
		
		//afficher une instruction � l'utilisateur
		System.out.println("entre un entier");
		
		//stocker la valeur que l'utilisateur a entr�e
		int input = sc.nextInt();
		System.out.println(input);
	}

}