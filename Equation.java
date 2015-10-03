import java.util.Scanner;
import java.lang.*;
import java.math.*;

public class Equation{

public static void secondDegre()
{
	double a=0;
	double b=0;
	double c=0;
	double delta=0;
	double x1=0, x2=0;
	System.out.println("Vous avez une equation du type axÂ²+bx+c");
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Veuillez entrer la valeur de a");
	a=scan.nextDouble();
	System.out.println("Veuillez entrer la valeur de b");
	b=scan.nextDouble();
	System.out.println("Veuillez entrer la valeur de c");
	c=scan.nextDouble();

	delta=b*b;
	delta-=4*a*c;
	//System.out.println("Delta= "+delta);
	if(delta==0)
	{
		x1=(-b/(2*a));
		System.out.println("L'equation admet la solution x1="+x1);
	}
	else if(delta>0)
	{
		x1=(-b+Math.sqrt(delta))/(2*a);
		x2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("L'equation admet les solutions x1="+x1+" et x2="+x2);
	}
	else
	{
		System.out.println("Votre equation n'admet pas de solution");
	}

}
public static void main(String [] args){
	secondDegre();
		
	
}
}
