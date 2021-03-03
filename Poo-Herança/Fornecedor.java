package poo;

import java.text.NumberFormat;
import java.util.Scanner;

/*Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe
Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos
que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito
m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor).
Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores,
um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e
valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe
Fornecedor e os herdados da classe Pessoa.*/
public class Fornecedor extends Pessoa{

	private Scanner ler = new Scanner(System.in);
	private float valorCredito;
	private float valorDivida;
	private float saldo=0;
	
	public Fornecedor(String nome, String endereco, String telefone, int idade, String cpf) {
		super(nome,endereco,telefone,idade,cpf);
	}
	
	public void obterSaldo() {
		System.out.println("\nInforme o valor do cr�dito do fornecedor: ");
		valorCredito = ler.nextFloat();
		System.out.println("Informe o valor da d�vida do fornecedor: ");
		valorDivida = ler.nextFloat();
		saldo = valorCredito - valorDivida;
		System.out.println("O saldo do fornecedor "+getNome()+" � de "+this.formatarMoeda()+" reais");
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoSalario = nf.format(saldo);
		return formatoSalario;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
}  
