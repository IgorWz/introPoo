package poo;

public class Cliente {

	public static void main(String[] args) {
		
		TestaCliente cliente1 = new TestaCliente("Igor",19,"Masculino",6000,"São Paulo");
		
		TestaCliente cliente2 = new TestaCliente("Ana Carolina",22,"Feminino",6500,"São Paulo");
		
		cliente1.visualizar();
		
		cliente2.visualizar();
			
	}

}
