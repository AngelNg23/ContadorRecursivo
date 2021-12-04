public class Contador {
public static void main (String [] args){
    for(int i = 1 ; i < 1000 ; i ++) {
        if (isPar(i)){
        	System.out.println(+i + " es par");
        } 
        if(i != 1 && isPrimo(i)){ 
        	System.out.println(+i + " es primo");
        }
        if (Double.valueOf((i / 5.0) / 2.0) % 1 == 0) {
        	System.out.println(+ i + " es numero ordinal");
        } 
    }

}

public static boolean isPrimo(int num){
	int contador = 2;
	  boolean primo=true;
	  while ((primo) && (contador!=num)){
	    if (num % contador == 0)
	      primo = false;
	    contador++;
	  }
	  return primo;
}

public static boolean isPar(int num) { 
    boolean par = true;
    if(num%2 != 0){
        par = false;
    }
    return par;
}
}