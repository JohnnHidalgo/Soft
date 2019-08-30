public class Soft {

	public static void main (String []args) {
		fibonaci(5);
		esprimo(5);
		cuadrado();
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

}
