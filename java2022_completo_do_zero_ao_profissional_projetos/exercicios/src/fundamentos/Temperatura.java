package fundamentos;

/*
 * Desafio de calculo de temperatura
 * (ºF - 32) x 5/9 = ºC
 */

public class Temperatura {
	public static void main(String[] args) {
		
		//constantes
		final double ajuste = 32;
		final double fator = 5.0/9.0;
		
		//variaveis
		double F = 32;
		double C = (F-ajuste)*fator;
		
		System.out.println("Temperatura: " + F + "F Equivale a: " + C + "ºC");
		
		F = 50;
		C = (F-ajuste)*fator;
		
		System.out.println("Temperatura: " + F + "F Equivale a: " + C + "ºC");
	}
}
