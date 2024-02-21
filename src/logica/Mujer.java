package logica;

public class Mujer extends TMB{

	public Mujer(float peso, float edad, float altura) {
		super(peso, edad, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularTMB(float peso, float edad, float altura) {
		float resultado;
		resultado = (float) (447.593 + (9.247*peso) + (3.098*altura) - (4.33*edad));
		return resultado;

	}

}
