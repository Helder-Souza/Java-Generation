package poo;

import java.util.Scanner;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Cliente {

	Scanner ler = new Scanner(System.in);
	private String nome;
	private int idade;
	private String telefone;
	private double valorCompra, carteira;
	
	
	public Cliente(String nome, int idade, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public double getValorCompra() {
		return valorCompra;
	}


	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}


	public double getCarteira() {
		return carteira;
	}


	public void setCarteira(double carteira) {
		this.carteira = carteira;
	}
	
	public String infoCliente() {
		String cadastroCliente = nome+" "+idade+" anos "+" telefone: "+telefone;
		return cadastroCliente;
	}
	
	void finalizarCompra() {
		
		System.out.println("Digite o valor da compra: ");
		valorCompra = ler.nextDouble();
		System.out.println("Digite o saldo na carteira: ");
		carteira = ler.nextDouble();
		
		if(carteira<valorCompra) {
			System.out.println(nome+" saldo insuficiente");
		}else {
			carteira = carteira - valorCompra;
			System.out.println(nome+" seu saldo atual é de: "+carteira+"\n");
		}
	}
}
