package POO2.Ex1;

public class Cavalo extends Animal {

	public void emitirSom () {
		System.out.println (this.getNome() + " � um cavalo e faz hinn in in ");
	}
	
	public void locomocao () {
		System.out.println (this.getNome() +  "est� correndo"); 
		System.out.println ("-------------------------------");
	}

}
