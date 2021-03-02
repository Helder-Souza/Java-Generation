package poo;

import java.text.NumberFormat;
import java.util.Scanner;

/*Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/
public class Funcionario {

		Scanner ler = new Scanner(System.in);
		private String nome;
		private String cpf;
		private String telefone;
		private String matricula;
		private int faltas;
		private double salario, desconto, salarioAtual=0;

		public Funcionario(String nome, String cpf, String telefone, String matricula) {
			this.nome = nome;
			this.cpf = cpf;
			this.telefone = telefone;
			this.matricula = matricula;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public double getDesconto() {
			return desconto;
		}

		public void setDesconto(double desconto) {
			this.desconto = desconto;
		}

		public int getFaltas() {
			return faltas;
		}

		public void setFaltas(int faltas) {
			this.faltas = faltas;
		}

		public String getInfoFunc() {
			String infoFunc = "Funcion�rio "+nome+" portador do cpf: "+cpf+" ,telefone: "+telefone+" e N� da matr�cula: "+matricula+"\n";
			return infoFunc;
		}
		
		void calcularSalario() {
			System.out.println("Digite o sal�rio do funcion�rio "+nome+": ");
			salario = ler.nextDouble();
			System.out.println("Digite a quantidade de faltas do funcion�rio "+nome+": ");
			faltas = ler.nextInt();
			
			if(faltas <= 0) {
				salarioAtual = salario-((salario*5)/100);
			}else if (faltas>0 && faltas <3) {
				salarioAtual = salario-((salario*8)/100);
			}else {
				salarioAtual = salario-((salario*12)/100);
			}
			
			System.out.println("O funcion�rio "+nome+" faltou "+faltas+" dia(s) por isso ele recebeu um sal�rio de: "+this.formatarMoeda()+" reais");
		}
		
		public String formatarMoeda() {
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(salarioAtual);
			return formatoMoeda;
		}
		
}


