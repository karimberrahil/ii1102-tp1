public class tp2 {

	public static void afficheRegle(int nb) {
		for (int i = 0; i < nb; i++) {
			if (i % 10 == 0)// Si i est un multiple de 10
			{
				System.out.print("|-");
			} else
				System.out.print("-");
		}
	}

	public static void puissance(double a, double n) {
		if (n == 0) {
			System.out.println(a + "^(" + n + ") =" + 1);
		} else {
			double resultat = 1;// On initialise
			for (int i = 0; i < n; i++) {
				resultat *= a;
			}
			System.out.println(a + "^(" + n + ") =" + resultat);
		}
	}

	public static double puissanceOptimise(double a, double n) {//On utilise l'exponentiation rapide afin d'optimiser notre code
		if (n == 0)
			return 1;
		else if (n % 2 == 0) {
			double res = puissanceOptimise(a, n / 2);
			return res * res;
		} else {
			return a * puissanceOptimise(a, n - 1);
		}
	}

	public static int premier(int nb) {
		for (int i = 2; i < nb; i++) {
			if (nb % i == 0) {
				return 0;// nb n'est pas premier
			}
		}
		return 1;// nb est premier
	}

	public static void table() {
		int nombre = 0;
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				nombre = i * j;
				if (nombre < 10)
					System.out.print(" ");//Sert à bien aligner les nombres du tableau
				System.out.print(" " + nombre);
			}
			System.out.println("");
		}
	}

	public static int[] calculerTable(int nb, int max)// Retourne un tableau contenant la table de multiplication de nb dans un tableau de max cases
	{
		int[] tab = new int[max];
		for (int i = 0; i < max; i++) {
			tab[i] = nb * i;
		}
		return tab;
	}

	public static void afficheTableau(int[] tab)// Affiche le tableau en parametre(pour les tests du main)
	{
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
	}

	public static int recherche(int val, int[] tab) {//on retourne l'indice de val dans le tableau tab
		for (int i = 0; i < tab.length; i++) {
			if (val == tab[i])
				return i;
		}
		return -1;
	}

	public static int rechercheDichotomique(int val, int[] tab, int deb, int fin) {//Recherche d'un element dans un tableau trié en tuilisant la dichotomie
		int milieu = (deb + fin) / 2;
		if (tab[milieu] == val)
			return milieu;
		else if (val < tab[milieu])
			return rechercheDichotomique(val, tab, deb, milieu - 1);
		else
			return rechercheDichotomique(val, tab, milieu + 1, fin);
	}

	public static void main(String[] args) {

		double a = 5;
		double n = 5;
		System.out.println("exercice 1:");
		afficheRegle(53);// Test de l'exercice 1
		System.out.println("");
		System.out.println("exercice 2:");
		puissance(a, n);// Test de l'exercice 2
		double testExo2 = puissanceOptimise(a, n);//Avec l'exponentiation rapide
		System.out.println(testExo2);
		System.out.println("exercice 3:");
		int nombre = premier(10);// Test de l'exercice 3
		System.out.println(nombre);// Test de l'exercice 3
		System.out.println("exercice 4:");
		table();// Test de l'exercice 4
		System.out.println("exercice 5:");
		int[] tab1 = { 1, 2, 3, 4, 5 };
		int[] tab2 = { 1, 2, 3, 4, 5 };
		int[] tab3 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int[] tab4 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		tab1 = calculerTable(3, 9);// Test de l'exercice 5
		afficheTableau(tab1);
		System.out.println("");
		System.out.println("exercice 6:");
		System.out.println(recherche(5, tab4));// Test de l'exercice 6, la premiere position est la position 0
		
		int indice = rechercheDichotomique(5, tab4, 0, tab4.length - 1);
		System.out.println("L'indice en utilisant la dichotomie est " + indice);
	}

}
