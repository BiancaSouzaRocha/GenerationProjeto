package IntroducaoJava;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String args []) {
		Scanner leia = new Scanner(System.in); 
		int a,b,c,d,s,r;
		
		
		System.out.print("Digite um n�mero: " );
		a = leia.nextInt();
		
		System.out.print("Digite outro n�mero: ");
		b = leia.nextInt();
		
		System.out.print("Digite outro n�mero: ");
		c= leia.nextInt();
		
		leia.close(); 
		
		r= (a+b)*(a+b);
		s= (c+b)*(a+b);
		d= (r+s)/2;
		
		System.out.printf("O resultado � de %d", d);
		
		
	}

	
}


