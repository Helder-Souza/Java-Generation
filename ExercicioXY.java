package javaGeneration;

import java.util.Scanner;

public class ExercicioXY {

	/*Um sistema de equações lineares do tipo:

	, pode ser resolvido segundo mostrado abaixo :
	
	 
	
	Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
	valores de x e y.*/
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		float a,b,c,d,e,f,x,y;
		
		System.out.println("Digite o coeficiente de a: ");
		a = ler.nextFloat();
		System.out.println("Digite o coeficiente de b: ");
		b = ler.nextFloat();
		System.out.println("Digite o coeficiente de c: ");
		c = ler.nextFloat();
		System.out.println("Digite o coeficiente de d: ");
		d = ler.nextFloat();
		System.out.println("Digite o coeficiente de e: ");
		e = ler.nextFloat();
		System.out.println("Digite o coeficiente de f: ");
		f = ler.nextFloat();
		
		x = ((c+e)-(b+f))/((a+e)-(b+d));
		y = ((a+f)-(c+d))/((a+e)-(b+d));
		
		System.out.println("O valor de x é igual a: "+x+" e o valor de y é igual a "+y);
	}
}
