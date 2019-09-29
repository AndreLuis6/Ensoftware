package andre.uespi.prp.br;

public class Quadrado {
	Double lado;
	
	void construtor(Double tLado) {
		this.lado = tLado;
	}
	
	Double area() {
		return (lado * lado);
	}
	
	Double perimetro(){
		return (4 * lado);
	}
	
}
