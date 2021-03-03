package poo;

import java.text.NumberFormat;
import java.util.Scanner;

/*Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
(correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que será adicionado ao vencimento base do Vendedor).*/
public class Vendedor extends Pessoa{

	Scanner ler = new Scanner(System.in);
	private float valorVendas;
	private float comissaov;
	private float vencVend;
	private int comissao;
	
	public Vendedor(String nome, String endereco, String telefone, int idade, String cpf) {
		super(nome,endereco,telefone,idade,cpf);
	}
	
	public void calcularVencimentoVendedor() {
		System.out.println("\nInforme o valor das vendas do vendedor(a) "+getNome()+": ");
		valorVendas = ler.nextFloat();
		System.out.println("Infome o valor em porcentagem (sem o '%') da comissão pelas vendas que será adcionado ao vencimento base do vendedor: ");
		comissao = ler.nextInt();
		comissaov = (valorVendas*comissao)/100;
		
		vencVend = valorVendas + (valorVendas*comissao)/100;
		System.out.println("O vendedor "+getNome()+" teve um total de "+this.formatarMoeda()+" em vendas e ganhou uma comissão de "+this.formatarMoeda1());
		System.out.println("\nO valor total foi de: "+this.formatarMoeda2());
	}	
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoSal = nf.format(valorVendas);
		return formatoSal;
	}
	public String formatarMoeda1() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoSal = nf.format(comissaov);
		return formatoSal;
	}
	public String formatarMoeda2() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoSal = nf.format(vencVend);
		return formatoSal;
	}
	
	public float getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}

	public float getComissaov() {
		return comissaov;
	}

	public void setComissaov(float comissaov) {
		this.comissaov = comissaov;
	}

	public float getVencVend() {
		return vencVend;
	}

	public void setVencVend(float vencVend) {
		this.vencVend = vencVend;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	
}
