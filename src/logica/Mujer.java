package logica;

public class Mujer extends TMB{

	public Mujer(float peso, float edad, float altura) {
		super(peso, edad, altura);
	}

	@Override
	public float calcularTMB() {
		float resultado;
		resultado = (float) (447.593 + (9.247*this.peso) + (3.098*this.altura) - (4.33*this.edad));
		return resultado;

	}

}
