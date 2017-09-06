public class recursionExamples {

	
	public static int factorial(int n){
		
		if(n<=1){
			return 1;
		}else{
			return n* factorial(n-1);
		}
		
		
	}
	
	public static int explonantial(int n){
		
		if (n<1){
			return 1;
		}else{
			
			return n*explonantial(n-1);
			
		}
		
		
		
	}
	
	
	public static int recursivePlus(int n){
		if(n<=0){
			return 0;
		}
		else{
			return n+recursivePlus(n-1);
		}
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		System.out.println(explonantial(4));
		System.out.println(recursivePlus(3));
		
	}

}