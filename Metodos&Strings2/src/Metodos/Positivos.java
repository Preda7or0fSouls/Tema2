package Metodos;
import PaqueteInicial.Utilidades;
public class Positivos {
public static int cuantosPositivos(int[] numeros) {

    int contador = 0;
    for (int numero : numeros) {
        if (numero >= 0) {
            contador++;
 }
    }
    return contador;
}

public static void main(String[] args) {


    int[] array = new int[20];

    Utilidades.rellenaArray(array, -10, 10);

    System.out.println(array.toString());

    System.out.println("Hay " + cuantosPositivos(array) + " positivos");
}

}
