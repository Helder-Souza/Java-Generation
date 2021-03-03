package poo;

public class TesteOperario {

	public static void main(String[] args) {
		Operario op1 = new Operario("Francisco","Rua 18","(11)9878-7777",37,"12345678901");
		System.out.println(op1.getInfoPessoa());
		op1.validarCpf();
		op1.calcularVencimentoOp();
	}

}
