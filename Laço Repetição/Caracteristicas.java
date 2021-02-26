package javaGeneration;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
public class Caracteristicas {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, pc=0, mn=0, ha=0, oc=0, pn40=0, pc18=0, sexo, x=1, em=0;
		
		
		
		
		while(x<=6) {
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
			System.out.println("Informe seu sexo (1-feminino / 2-masculino / 3-Outros) ");
			sexo = ler.nextInt();
			System.out.println("Informe seu estado emocional (1-calmo(a) / 2-nervoso(a) / 3-agressivo(a)) ");
			em = ler.nextInt();
			if(em==1) {
				pc++;
			}
			if(sexo == 1 && em ==2) {
				mn++;
			}
			if(sexo == 2 && em ==3) {
				ha++;
			}
			if(sexo == 3 && em ==1) {
				oc++;
			}
			if(idade>40 && em == 2) {
				pn40++;
			}
			if(idade<18 && em == 1) {
				pc18++;
			}
			x++;
		}
		System.out.println(pc+" Pessoa(s) calma(s)\n"+ mn+" Mulheres nervosas \n"+ha+" Homens agressivos\n"
				+oc+" Outros calmos\n"+pn40+" pessoas nervosas com mais de 40 anos\n"+pc18+" pessoas calmas com menos de 18 anos");
		

	}

}
