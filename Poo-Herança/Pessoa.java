package poo;
/*Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
String telefone;*/
public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private int idade;
	private String cpf;
	
	public Pessoa(String nome, String endereco, String telefone, int idade, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public String getInfoPessoa() {
		String infoPessoa = nome+" endereço: "+endereco+" , telefone: "+telefone+" , idade: "+idade+" anos e portador do cpf: "+cpf;
		return infoPessoa;
	}
	
	public void validarCpf() {
		if(getCpf().length()==11) {
			System.out.println("\nCPF do(a) "+getNome()+" válido");
		}else {
			System.out.println("\nCPF do(a) "+getNome()+" inválido");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
	
}
