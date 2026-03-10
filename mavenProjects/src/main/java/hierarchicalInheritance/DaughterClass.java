package hierarchicalInheritance;

public class DaughterClass extends FatherClass {
	public void family1()
	{
		System.out.println("I am your daughter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
DaughterClass daughter=new DaughterClass();
daughter.family1();
daughter.family2();
	}

}
