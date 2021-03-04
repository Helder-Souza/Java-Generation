package poo;

public class Cavalo extends Animal{

	public Cavalo() {
		
	}	
	
	@Override
	public String getSom() {
		return " e está emitindo o som: hinn in in";
	}
	
	@Override
	public String getMovimento() {
		return " correndo";
	}
	
	@Override
	public String getTipo() {
		return "O cavalo";
	}
}
