package poo;

import java.text.NumberFormat;
import java.util.Scanner;

/*Implemente a classe Operario como subclasse da classe Pessoa. Um determinado oper�rio
tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como valorProducao
(que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) e
comissao (que corresponde � porcentagem do valorProducao que ser� adicionado ao
vencimento base do oper�rio).*/
public class Operario extends Pessoa{

	Scanner ler = new Scanner(System.in);
	private float valorProducao;
	private float comissao;
	private float vencOp;
	
	public Operario(String nome, String endereco, String telefone, int idade, String cpf) {
		super(nome,endereco,telefone,idade,cpf);
	}
	
	public void calcularVencimentoOp() {
		System.out.println("\nInforme o valor da produ��o do oper�rio "+getNome()+": ");
		valorProducao = ler.nextFloat();
		System.out.println("Infome o valor em porcentagem (sem o '%') da comiss�o que ser� adcionado ao vencimento base do oper�rio: ");
		comissao = ler.nextFloat();
		
		vencOp = valorProducao + (valorProducao*comissao)/100;
		System.out.println("O valor total a ser recebido pelo oper�rio "+getNome()+" � igual a: "+this.formatarMoeda());
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoSal = nf.format(vencOp);
		return formatoSal;
	}
}
