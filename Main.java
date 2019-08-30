public class Soft {

	public static void main (String []args) {
		fibonaci();
		primo();
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

}
