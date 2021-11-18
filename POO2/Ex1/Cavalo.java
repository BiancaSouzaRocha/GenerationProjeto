package POO2.Ex1;

public class Cavalo extends Animal {

	public void emitirSom () {
		System.out.println (this.getNome() + " é um cavalo e faz hinn in in ");
	}
	
	public void locomocao () {
		System.out.println (this.getNome() +  "está correndo"); 
		System.out.println ("-------------------------------");
	}

}
