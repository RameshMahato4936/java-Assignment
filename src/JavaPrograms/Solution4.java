package JavaPrograms;
import java.util.Scanner;

class Bank{
	Scanner sc = new Scanner(System.in);
	double ibalance;
	
	Bank(double initbalance){
     ibalance=initbalance;
	}
	//method for withdraw
    public void withDraw() {
    	double avbal;
	System.out.println("enter your amount for withdraw");
	double amount = sc.nextDouble();
	if(ibalance>=amount) {
	System.out.println("withdraw successful"+amount);
	avbal= ibalance-amount;
	System.out.println("available balance"+avbal);
	}
    }
    public void deposit() {
    System.out.println("enter your amount for deposit");
    double amount = sc.nextDouble();
    ibalance = amount+ibalance;
    System.out.println("total balance after deposiy"+ibalance);
    }
	public void getBalance() {
		System.out.println("your balance is"+ibalance);
	}	
}


	public class Solution4 {
	
		public static void main(String[] args) {
			boolean flag = false;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter initial balance");
			double initbalance= sc.nextDouble();
			Bank bn = new Bank(initbalance);
			System.out.println("press withdraw=1 or deposit=2 or balance inq=3");
		int st = sc.nextInt();
			switch (st) {
			case 1:
				bn.withDraw();
			    break;
			case 2:
			    bn.deposit();
				break;
			case 3:
				bn.getBalance();
				break;
			}
			// TODO Auto-generated method stub
		}
	}
