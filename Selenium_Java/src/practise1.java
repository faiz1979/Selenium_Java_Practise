
public class practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practise1 demo = new practise1();
		String name = demo.newMethod1();
		System.out.println(name);
		String name2 = newMethod2();
		System.out.println(name2);
		
		practise2 callingClass = new practise2();
		String obj = callingClass.userMethod();
		System.out.println(obj);

	}
	
	public String newMethod1()
	{
		System.out.println("Hello World");
		return "My name is Faiz Mujawar";
	}
	
	public static String newMethod2()
	{
		System.out.println("Hello World");
		return "My name is Faiz Mujawar";
	}
}
