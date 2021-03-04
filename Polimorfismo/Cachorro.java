package poo;

public class Cachorro extends Animal{

	public Cachorro() {
		
	}
	
	@Override
	public String getSom() {
		return " e está emitindo o som: Au-Au";
	}
	
	@Override
	public String getMovimento() {
		return " correndo";
	}
	
	@Override
	public String getTipo() {
		return "O cachorro";
	}
}
