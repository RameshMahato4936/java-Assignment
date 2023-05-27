package JavaPrograms;
import java.util.*;
    
	public class Solution10{
	public static void main(String[] args) {
		int temp;
		 Scanner sc = new Scanner(System.in);
		 ArrayList<Integer> arr = new ArrayList();
		   System.out.println("enter the number of elements");
		    int n=sc.nextInt();
		   System.out.println("enter the elements");
		   for(int i=0; i<n; i++) {
		     arr.add(sc.nextInt());
		   }
		   Collections.sort(arr);
		   System.out.println(arr);
		   int sh = arr.get(n-2);
		   int ss = arr.get(1);
			 System.out.println("second largest="+sh);
			 System.out.println("second smallest="+ss);
		   }
		  
				   
	}
	
