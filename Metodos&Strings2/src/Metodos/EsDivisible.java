package Metodos;
import PaqueteInicial.Utilidades;
public class EsDivisible {
	public static boolean esDivisible(int num1 , int num2) {

		if (num1%num2 == 0) {
			return true;
		}else {
			return false;
		}
}
	public static void main(String[] args) {
		int divisor = Utilidades.leerEntero("Introduzca el primer numero: ");
		int dividendo = Utilidades.leerEntero("Introduzca el segundo numero: ");
		if (esDivisible(divisor, dividendo)){
			System.out.println("Es divisible");
		}else {
			System.out.println("NO es divisible");
		}
		
	}
}
	