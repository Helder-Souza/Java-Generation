package poo;

public class TesteAviao {

	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		aviao1.marca = "Gol";
		aviao1.cor = "Laranja";
		aviao1.tipo = "Airbus A320";
		
		System.out.println("Avião da marca "+aviao1.marca+" da cor "+aviao1.cor+" do tipo "+aviao1.tipo+"\n");
		
		aviao1.pousar();
	}

}
