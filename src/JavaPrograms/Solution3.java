package JavaPrograms;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		if(n<0) {
			throw new ArithmeticException("enterd number is negative="+n);
		}
		else {
			System.out.println("entered number is positive="+n);
		}

		
		// TODO Auto-generated method stub

	}

}
