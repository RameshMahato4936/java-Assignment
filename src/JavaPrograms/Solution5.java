package JavaPrograms;
interface W{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements W{
	public void a(){
		System.out.println("abstract class can implements interface A");
	}
}
class M extends B{
	public void b() {System.out.println("method b");}
	public void c() {System.out.println("method c");}
	public void d() {System.out.println("method d");}
	
}
public class Solution5 {

	public static void main(String[] args) {
		W i = new M();
		i.a();
		i.b();
		i.c();
		i.d();
	}
}	// TODO Auto-generated method stub

//abstract class can have abstract and non-abstract method.
//but interface can have only abstract method.

//abstract class can provide the implementation of interface.
//while interface can't provide the implementation of abstract class.

//abstract class doesn't support multiple inheritance.
//while interface support multiple inheritance.

//abstract keyword is used to declare abstract class.
//interface keyword is used to declare interface.

//an abstract class can extend other java class and implement multiple java interface.
//an interface can't extend other java class but interface can extend other java interface.

