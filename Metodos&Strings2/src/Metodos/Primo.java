package Metodos;

public class Primo {
	public boolean EsPrimo(int n){
	    int num = 0;
	        for (int x = 1; x <(n + 1); x++) 
	            if (n % x == 0) 
	                num++;
	        if (num != 2) 
	           return false;
	         else 
	          return true;
	    }
	public static void main(String[] args) {
		System.out.println("Introduce un numero");

	}

}
