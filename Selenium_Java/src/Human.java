
public class Human {
	
	private String name;
	private int age;
	
	void display()
	{
		System.out.println("No argument");
	}
	
	void display(int a)
	{
		System.out.println("Integer argument");
	}
	
	void display(int a, int b)
	{
		System.out.println("Multiple argument");
	}
	
	void display(int a, String b)
	{
		System.out.println("Integer and String argument");
	}
	
	void display(String b, int a)
	{
		System.out.println(" String and Integer argument");
	}
	
	void display(String b, int a, String c)
	{
		System.out.println(" String, Integer and String argument");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human male = new Human();
		male.display(20, 20);

	}
	
	

}
