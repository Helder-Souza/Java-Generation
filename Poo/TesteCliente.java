package poo;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente[] objCliente = new Cliente[2];
		
		objCliente[0] = new Cliente("Francisco Alves",26,"99999999");
		objCliente[1] = new Cliente("Florentina de Jesus",29,"87878784");
		
		for(Cliente loop:objCliente) {
			System.out.println(loop.infoCliente());
			loop.finalizarCompra();
		}

	}

}
