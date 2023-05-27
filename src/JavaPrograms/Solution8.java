package JavaPrograms;

class MyThread extends Thread{
	@Override 
	public void run() {
		//for even number
		System.out.print("even number from 1 to 10=");
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i);
				
			}
		}
	}
}

class SecondThread extends Thread{
	@Override
	public void run() {
		//for odd number
		System.out.println();
		System.out.print("odd number from 1 to 10=");
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(i);
			}
		}	
	}
}
public class Solution8 {
public static void main(String[] args) {
	MyThread mt = new MyThread();
    SecondThread st = new SecondThread();
    mt.start();
    st.start();
}
}
