package poo;

public class Preguica extends Animal{

	public Preguica() {
		
	}	
	
	@Override
	public String getSom() {
		return " e está emitindo o som: tic tic";
	}
	
	@Override
	public String getMovimento() {
		return " subindo em arvores";
	}
	
	@Override
	public String getTipo() {
		return "O bicho-preguiça";
	}
}
