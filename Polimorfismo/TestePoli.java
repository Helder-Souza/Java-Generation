package poo;

public class TestePoli {

	public static void main(String[] args) {
		
		Cachorro an1 = new Cachorro();
		an1.setNome("Rex");
		an1.setIdade(4);
		Cavalo an2 = new Cavalo();
		an2.setNome("Buck");
		an2.setIdade(7);
		Preguica an3 = new Preguica();
		an3.setNome("Bob");
		an3.setIdade(12);
		Cachorro an4 = new Cachorro();
		an4.setNome("Miuxa");
		an4.setIdade(2);

		Animal[] animais = new Animal[4];
		animais[0]=an1;
		animais[1]=an2;
		animais[2]=an3;
		animais[3]=an4;
		
		for(Animal ani:animais) {
			System.out.println(ani.getTipo()+ani.getInfoAnimal()+ani.getMovimento()+ani.getSom());
		}
	}

}
