package poo;

public class TesteVendedor {

	public static void main(String[] args) {
		Vendedor vend1 = new Vendedor(null, null, null, 0, null);
		vend1.setNome("Bruna");
		vend1.setEndereco("Sala do tempo");
		vend1.setCpf("01987654321");
		vend1.setIdade(21);
		vend1.setTelefone("(11)1111-1111");
		System.out.println(vend1.getInfoPessoa());
		vend1.validarCpf();
		vend1.calcularVencimentoVendedor();
	}

}
