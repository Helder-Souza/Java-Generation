package poo;

import java.text.NumberFormat;
import java.util.Scanner;

/*Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/
public class Administrador extends Pessoa{

	Scanner ler = new Scanner(System.in);
	private float ajudaDeCusto;
	private float salario;
	
	public Administrador(String nome, String endereco, String telefone, int idade, String cpf, float ajudaDeCusto, float salario) {
		super(nome,endereco,telefone,idade,cpf);
		this.ajudaDeCusto = ajudaDeCusto;
		this.salario = salario;
	}
	
	public void calcularSalario() {
		System.out.println("\nInforme o salário do(a) administrador(a) "+getNome()+": ");
		salario = ler.nextFloat();
		System.out.println("Informe o valor da ajuda de custo: ");
		ajudaDeCusto = ler.nextFloat();
		
		if(ajudaDeCusto>0) {
			salario+= ajudaDeCusto;
			System.out.println("O salário do administrador "+getNome()+" foi de: "+this.formatarMoeda());
		}else {
			System.out.println("O salário do administrador "+getNome()+" foi de: "+this.formatarMoeda());
		}
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoSal = nf.format(salario);
		return formatoSal;
	}

	public float getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(float ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
