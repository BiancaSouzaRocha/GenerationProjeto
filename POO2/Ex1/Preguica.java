package POO2.Ex1;

public class Preguica extends Animal {
	
	public void emitirSom () {
		System.out.println (this.getNome()+ "é uma preguiça e não emite som!");
	}
	
	public void locomocao () {
		System.out.println (this.getNome() + " está subindo na árvore!"); 
		System.out.println ("\t\t\t-------------------------------");
	}


}
