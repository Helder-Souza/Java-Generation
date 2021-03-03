package poo;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor forn1 = new Fornecedor(null, null, null, 0, null);
		Fornecedor forn2 = new Fornecedor(null, null, null, 0, null);
		
		forn1.setNome("João");
		forn1.setEndereco("Rua do meio");
		forn1.setTelefone("(11) 9998-8855");
		forn1.setIdade(30);
		forn1.setCpf("22222254789");
		System.out.println(forn1.getInfoPessoa());
		forn1.validarCpf();
		forn1.obterSaldo();
		System.out.println();
		forn2.setNome("Maria");
		forn2.setEndereco("Rua 10");
		forn2.setTelefone("(11) 7784-8855");
		forn2.setIdade(27);
		forn2.setCpf("3333654321");
		System.out.println(forn2.getInfoPessoa());
		forn2.validarCpf();
		forn2.obterSaldo();
	}

}
