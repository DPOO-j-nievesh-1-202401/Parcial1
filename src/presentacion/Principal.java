package presentacion;

import logica.Hombre;
import logica.Mujer;
import logica.TMB;

public class Principal {

	public static void main(String[] args) {
		TMB calcular;

		calcular = new Hombre(80, 30, 180);
		System.out.println(calcular.calcularTMB());

		calcular = new Mujer(60, 24, 165);
		System.out.println(calcular.calcularTMB());

	}

}




