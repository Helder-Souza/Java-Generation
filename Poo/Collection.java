package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
public class Collection {

	public static void main(String[] args) {
		
		int op;
		Scanner ler = new Scanner(System.in);
		
		List<String> estoque = new ArrayList<String>();
		
		
		do {
			System.out.println("Informe qual é a sua opção:");
			System.out.println("----------Estoque----------");
			System.out.println("(1) Adicionar produtos no estoque\n(2) Remover produtos do estoque\n(3)Atualizar produtos do estoque\n(4)Ver o estoque\n(0)Sair");
			System.out.println("---------------------------");
			op = ler.nextInt();
		switch(op) {
		case 1:
			ler.nextLine();
			System.out.println("Informe o produto que será armazenado no estoque: ");
			String produto = ler.nextLine();
			estoque.add(produto);
			break;
		case 2:
			ler.nextLine();
			System.out.println("Informe o produto que será removido do estoque: ");
			String produtoR = ler.nextLine();
			if(estoque.contains(produtoR)) {
				estoque.remove(produtoR);
				System.out.println("Produto: "+produtoR+" removido do estoque!");
			}else {
				System.out.println("Não existe esse produto no estoque!");
			}
			break;
		case 3:
			ler.nextLine();
			System.out.println("Informe o produto que quer atualizar");
			String prodAt = ler.nextLine();
			System.out.println("Informe o produto que entrará no lugar do produto: "+prodAt);
			String novoProd = ler.nextLine();
			if(estoque.contains(prodAt)) {
				estoque.remove(prodAt);
				estoque.add(novoProd);
			}else {
				System.out.println("Não existe esse produto no estoque!");
			}
			System.out.println("\n"+estoque+"\n");
			break;
		case 4:
			System.out.println("\n"+estoque+"\n");
			break;
			default:
				System.out.println("Finalizou Programa!!");
		}
		}while(op!=0);
	}

}
