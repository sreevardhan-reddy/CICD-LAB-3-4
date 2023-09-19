package devops.b3.cicd.lab3;

public class MyCalss {
	public void greeting()
	{
		System.out.println("Hello GitHub Actions");
	}
	public void testMsg()
	{
		System.out.println("This is Test Message");
	}

	public static void main(String[] args) {		
		MyCalss ob = new MyCalss();
		ob.greeting();
	}
}
