package poo;

import java.text.NumberFormat;
import java.util.Scanner;

/*Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
inst�ncia da classe Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa,
os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
retida dos impostos). Implemente a classe Empregado com m�todos seletores e modificadores
e um m�todo calcularSalario. Escreva um programa de teste adequado para a classe
Empregado.*/
public class Empregado extends Pessoa{

	Scanner ler = new Scanner(System.in);
	private int codigoSetor;
	private float salarioBase;
	private int imposto;
	private float salarioTotal;
	
	public Empregado(String nome, String endereco, String telefone, int idade, String cpf, int codigoSetor) {
		super(nome,endereco,telefone,idade,cpf);
		this.codigoSetor = codigoSetor;
	}
	
	public void calcularSalario() {
		System.out.println("\nInforme o sal�rio base: ");
		salarioBase = ler.nextFloat();
		System.out.println("Informe o n�mero do percentual de desconto: ");
		imposto = ler.nextInt();
		
		salarioTotal = salarioBase -(salarioBase*imposto)/100;
		System.out.println("Sal�rio base do(a) "+getNome()+" "+salarioBase+" Valor em porcentagem (sem o '%') de imposto a ser retido do sal�rio: "+imposto);
		System.out.println("\nO sal�rio do empregado "+getNome()+" � de "+this.formatarMoeda());
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoSal = nf.format(salarioTotal);
		return formatoSal;
	}
	
	public void getInfoEmpregado() {
		System.out.println("\nC�digo do setor do(a) "+getNome()+" "+getCodigoSetor());
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}

	public float getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(float salarioTotal) {
		this.salarioTotal = salarioTotal;
	}
	
}
