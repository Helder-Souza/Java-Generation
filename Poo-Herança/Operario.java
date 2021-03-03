package poo;

import java.text.NumberFormat;
import java.util.Scanner;

/*Implemente a classe Operario como subclasse da classe Pessoa. Um determinado operário
tem como atributos da classe Pessoa e também os atributos próprios como valorProducao
(que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e
comissao (que corresponde à porcentagem do valorProducao que será adicionado ao
vencimento base do operário).*/
public class Operario extends Pessoa{

	Scanner ler = new Scanner(System.in);
	private float valorProducao;
	private float comissao;
	private float vencOp;
	
	public Operario(String nome, String endereco, String telefone, int idade, String cpf) {
		super(nome,endereco,telefone,idade,cpf);
	}
	
	public void calcularVencimentoOp() {
		System.out.println("\nInforme o valor da produção do operário "+getNome()+": ");
		valorProducao = ler.nextFloat();
		System.out.println("Infome o valor em porcentagem (sem o '%') da comissão que será adcionado ao vencimento base do operário: ");
		comissao = ler.nextFloat();
		
		vencOp = valorProducao + (valorProducao*comissao)/100;
		System.out.println("O valor total a ser recebido pelo operário "+getNome()+" é igual a: "+this.formatarMoeda());
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoSal = nf.format(vencOp);
		return formatoSal;
	}
}
