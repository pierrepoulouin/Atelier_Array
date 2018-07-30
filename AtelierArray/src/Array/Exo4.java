package Array;

/*Afficher tous les éléments du tableau. /!\ La boucle “for” est obligatoire !
exemple : for(i=0; i<8; i++)
			{
			<j'affiche l'élément du tableau d'index i>;
			}*/

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation du tableau, initialisation de sa taille et de ses éléments
		int[] tab = {12, 15, 13, 10, 8, 9, 13, 14};
		
		//afficher les éléments du tableau avec une boucle for
		int i;
		for(i=0; i<8; i=i+1) {
			System.out.println(tab[i]);
		}

	}

}
