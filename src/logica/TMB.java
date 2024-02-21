package logica;

public abstract class TMB {
	protected float peso;
	protected float edad;
	protected float altura;

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getEdad() {
		return edad;
	}

	public void setEdad(float edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public TMB(float peso, float edad, float altura) {
	} 
	
	public abstract float calcularTMB();
}
