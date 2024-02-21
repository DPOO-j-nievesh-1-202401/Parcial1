package logica;

public class Hombre extends TMB{

	public Hombre(float peso, float edad, float altura) {
		super(peso, edad, altura);
	}	

	@Override
	public float calcularTMB() {
		float resultado;
		resultado = (float) (88.362 + (13.397*peso) + (4.799*altura) - (5.677*edad));
		return resultado;
	}

}
