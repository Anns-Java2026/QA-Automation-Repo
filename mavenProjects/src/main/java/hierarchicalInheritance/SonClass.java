package hierarchicalInheritance;

public class SonClass extends FatherClass {
	public void family()
	{
		System.out.println("I am your Son");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
SonClass son=new SonClass();
son.family();
son.family2();
	}
}


