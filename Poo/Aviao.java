package poo;

import java.util.Scanner;

/*Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
public class Aviao {

	Scanner ler = new Scanner(System.in);
	 String marca;
	 String tipo;
	 String cor;
	 int velocidade;
	 int visibilidade;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getVisibilidade() {
		return visibilidade;
	}

	public void setVisibilidade(int visibilidade) {
		this.visibilidade = visibilidade;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	void pousar() {
		System.out.println("Piloto por favor informe a sua velocidade atual: ");
		velocidade = ler.nextInt();
		
		if(velocidade<=240) {
			System.out.println("Piloto por favor informe o grau de visibilidade: ");
			visibilidade = ler.nextInt();
			
			if(visibilidade<=1) {
				System.out.println("A visibilidade est� muito baixa imposs�vel pousar agora");
			}else if(visibilidade>=2 && visibilidade<3) {
				System.out.println("A visibilidade est� moderada pode pousar mas com muito cuidado");
			}else {
				System.out.println("Temos visibilidade perfeita pode pousar sem problemas");
			}
		}else {
			System.out.println("Sua velocidade est� muito alta imposs�vel pousar agora");
		}
		
	}
	
}