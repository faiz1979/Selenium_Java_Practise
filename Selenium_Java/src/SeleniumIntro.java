import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {

String str = "Rahul Shetty Academy";

String[] splittedstr = str.split("Shetty");

for(int i=0; i<splittedstr.length; i++)
{
	System.out.println(splittedstr[i].trim());
}

for(int i=0; i<str.length(); i++)
{
	System.out.println(str.charAt(i));
}

for(int j=str.length()-1; j>=0; j--)
{
	System.out.println(str.charAt(j));
}




	}

}
