package POO2.Ex1;

public class Ex {
	
	public static void main (String [] args) {
		
		Cachorro c1 = new Cachorro (); 
		Cavalo c2 = new Cavalo ();
		Preguica c3 = new Preguica ();
		
		c1.setNome("Lili");
		c1.setIdade(2);
		
		c1.emitirSom();
		c1.locomocao();
		
		c2.setNome("Lucky");
		c2.setIdade(6);
		
		c2.emitirSom();
		c2.locomocao();
		
		c3.setNome("Dara");
		c3.setIdade(1);
		
		c3.emitirSom();
		c3.locomocao();
	}
		
}
		
		
		
	
