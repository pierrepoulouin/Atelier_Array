package Array;

/*Dans cet exercice, on va travailler avec un tableau d’entiers appelé tab contenant les 
 * valeurs suivantes : 
12, 15, 13, 10, 8, 9, 13 et 14.*/
// Modifier le cinquième élément du tableau pour lui attribuer la valeur 5 et l’afficher.
public class Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creation du tableau et initialisation de sa taille
		int [] tab = new int [8];
		tab[0]= 12;
		tab[1]= 15;
		tab[2]= 13;
		tab[3]= 10;
		tab[4]= 8;
		tab[5]= 9;
		tab[6]= 13;
		tab[7]= 14;
				
		// attribution d'une nouvelle valeur pour l'index 4
		tab[4]= 5;
		
		// afficher la valeur du cinquième élément
		System.out.println(tab[4]);
	}
}
