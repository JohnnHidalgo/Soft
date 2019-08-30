public class Soft {

	public static void main (String []args) {
		fibonaci(5);
		esprimo(5);
		imprimeFactorial(3);
	}
	public int fibonaci(int n){
	  if(n==1 || n==2) {
	    return 1;
	  }
	  else{
	    return fibonaci(n-1)+fibonaci(n-2);
	  }
	}


Public void esprimo(int num){
	int cont=0;
	int p=1;
	for(int i=1;i<=num;i++){
		if(num % i ==0){
			cont++;
		}
	} 
	
	if(cont==2){
		System.out.println(“Es primo”)
	
	}
	else{
		System.out.println(“No es primo”)
	
	}

}

public static int factorial (int n){
    if (n==0) { System.out.println ("Caso base"); return 1;}
    else{
        System.out.println ("Recursión");
        return n*factorial(n-1);}
}
public void imprimeFactorial(int n){
    System.out.println (factorial(n));
}

}
