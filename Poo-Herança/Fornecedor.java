package poo;

import java.text.NumberFormat;
import java.util.Scanner;

/*Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe
Fornecedor. Considere que cada instância da classe Fornecedor tem, para além dos atributos
que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito
máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor).
Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores,
um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e
valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
adequado que lhe permita verificar o funcionamento dos métodos implementados na classe
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
		System.out.println("\nInforme o valor do crédito do fornecedor: ");
		valorCredito = ler.nextFloat();
		System.out.println("Informe o valor da dívida do fornecedor: ");
		valorDivida = ler.nextFloat();
		saldo = valorCredito - valorDivida;
		System.out.println("O saldo do fornecedor "+getNome()+" é de "+this.formatarMoeda()+" reais");
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
