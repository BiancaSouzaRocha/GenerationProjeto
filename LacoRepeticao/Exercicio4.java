package LacoRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String args []) {
		
		Scanner n = new Scanner (System.in);
		int idade, sexo, x, t=0, pc=0, mn=0, ha=0, oc=0, p40=0, p18=0; 
		
		
		
		while (t<3) {
			
			System.out.print ("Digite a sua idade: ");
			idade = n.nextInt();
			System.out.print ("Digite o seu sexo (1 - feminino, 2- masculino e 3 - outro): ");
			sexo = n.nextInt();
			System.out.print("Digite se você é calmo (1), nervoso (2) ou  agressivo (3): "); 
			x = n.nextInt();
			t++;
			n.close();
			
			if (x==1) {
				pc++;
			}
			else if ((sexo == 1) && (x==2)) {
				mn++;
			}
			else if ((sexo==2) && (x==3)) {
				ha++;	
			}
			else if ((sexo==3) && (x==1)){
				oc++;
			}	
			else if ((x==2) && (idade >= 40)) {
				p40++;
			}
			else if ((x==1) && (idade <=18)) {
				p18++;
				
			}
		}
		
		
			System.out.println(pc);
			System.out.println(mn);
			System.out.println(ha);
			System.out.println(oc);
			System.out.println(p40);
			System.out.println(p18);
		
		
	}

}
