import java.util.Scanner;

public class Pave{

public static void volume()
{
	double c1;
	double c2;
	double hauteur;
	double volume;
	
	
		Scanner scan=new Scanner(System.in);
		do{
		System.out.println("Veuillez entrer la valeur du cotÃ© 1");
		c1=scan.nextDouble();
		}
		while(c1<0);
		do{
		System.out.println("Veuillez entrer la valeur du cotÃ© 2");
		c2=scan.nextDouble();
		}
		while(c2<0);
		do{
		System.out.println("Veuillez entrer la valeur de la hauteur");
		hauteur=scan.nextDouble();
		}
		while(hauteur<0);


		volume=c1*c2;
		volume*=hauteur;
		System.out.println("Le volume de votre pavÃ© est "+volume);
}
public static void main(String [] args){
	boolean repeter=true;
	long reponse=0;
	while(repeter==true)
	{	
		volume();
		System.out.println("Voulez-vous recommencer une operation?");
		System.out.println("1:OUI");
		System.out.println("2:NON");
		Scanner scan=new Scanner(System.in);
		reponse=scan.nextLong();
		if(reponse==1)
		{
			repeter=true;
		}
		else
		{
			repeter=false;
		}
	}
	
		
	
}
}
