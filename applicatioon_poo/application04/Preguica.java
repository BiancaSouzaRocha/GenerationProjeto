package applicatioon_poo.application04;

public class Preguica extends Animal {
	
	public void emitirSom () {
		System.out.println (this.getNome()+ "� uma pregui�a e n�o emite som!");
	}
	
	public void locomocao () {
		System.out.println (this.getNome() + " est� subindo na �rvore!"); 
		System.out.println ("\t\t\t-------------------------------");
	}


}
