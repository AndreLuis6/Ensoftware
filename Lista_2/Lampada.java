package andre.uespi.prp.br;

public class Lampada {
	Boolean ligada;
	
	void liga() {
		ligada = true;
	}
	
	void desliga() {
		ligada = false;
	}
	
	String observa() {
		if(ligada == true) {
			return "ligada";
		}else {
			return "desligada";
		}
	}

}
