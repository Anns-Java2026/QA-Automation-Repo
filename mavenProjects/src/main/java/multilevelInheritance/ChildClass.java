package multilevelInheritance;

public class ChildClass extends FatherClass {

	public void history2() //instance method
	{
		System.out.println("I am your Son");
	}
	public static void main (String[]args)
	{
		ChildClass son=new ChildClass();
		son.history(); //call the instance methods here
		son.history1();
		son.history2();
		
}
}

