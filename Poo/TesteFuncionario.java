package poo;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Marlon Moraes", "88885521", "98998989", "315");
		System.out.println(func1.getInfoFunc());
		func1.calcularSalario();
	}

}
