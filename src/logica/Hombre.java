package logica;

public class Hombre extends TMB{

	public Hombre(float peso, float edad, float altura) {
		super(peso, edad, altura);
	}	

	@Override
	public float calcularTMB() {
		float resultado;
		resultado = (float) (88.362 + (13.397*this.peso) + (4.799*this.altura) - (5.677*this.edad));
		return resultado;
	}

}
