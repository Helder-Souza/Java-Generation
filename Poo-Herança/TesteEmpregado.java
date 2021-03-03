package poo;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado emp1 = new Empregado("José","Rua sem saída","(11)9988-7766",47,"99887766554",14);
		System.out.println(emp1.getInfoPessoa());
		emp1.getInfoEmpregado();
		emp1.validarCpf();
		emp1.calcularSalario();
	}

}
