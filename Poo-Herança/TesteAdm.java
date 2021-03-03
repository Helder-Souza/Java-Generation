package poo;

public class TesteAdm {

	public static void main(String[] args) {
		Administrador adm1 = new Administrador(null, null, null, 0, null, 0, 0);
		adm1.setNome("Maria");
		adm1.setEndereco("Rota 66");
		adm1.setTelefone("(11)9898-6556");
		adm1.setIdade(34);
		adm1.setCpf("1234567890");
		System.out.println(adm1.getInfoPessoa());
		adm1.validarCpf();
		adm1.calcularSalario();
	}

}
