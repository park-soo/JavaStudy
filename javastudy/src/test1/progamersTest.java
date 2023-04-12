package test1;

public class progamersTest {
	public static void main(String[] agrs) {
		
			int[] array = {1,1,2,3,4,5,3,4,5,4,7};
			int n = 3;
		
			 int answer = 0;
		        
		        for(int i=0; i<array.length;i++){
		            if(n==array[i]){
		                answer += 1;
		            } 
		        
		        }
		      
	        	
			System.out.println(answer);
	        
			
		    }

}
