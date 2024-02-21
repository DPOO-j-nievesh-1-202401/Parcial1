package logica;

public abstract class TMB {
	protected float peso;
	protected float edad;
	protected float altura;

	public TMB(float peso, float edad, float altura) {
	} 
	
	public abstract float calcularTMB(float peso, float edad, float altura);
}
