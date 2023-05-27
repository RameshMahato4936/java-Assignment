package JavaPrograms;
class Animal{
	String color="white";
}
class Dog extends Animal{
	String color="black";
	void printColor() {
		System.out.println(color);
		String s=super.color;
		System.out.println(s);
	}
}
//constructor should have same name as class name.
//constructor doesn't have any return type.
//in constructor we can declare multiple number of parameter.
//constructor is called at the time object creation or instantiation.
//there are two types of constructor one is zero parameterize constructor and parameterized constructor.
//zero parameterized constructor is also known as default constructor.   




public class LaunchConstructor {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.printColor();

		
		// TODO Auto-generated method stub

	}

}
