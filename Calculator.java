


import java.util.Scanner;

public class MathOperation 
{
	Scanner s  = new Scanner(System.in);
	 
	private int x, y;
	private int R;
	
	public void init()
	{
		System.out.println("Enter the Value of X :");
		x = s.nextInt();
		
		System.out.println("Enter the Value of Y :");
		y = s.nextInt();
	}
	public void add()
	{
		R = x + y;
	}
	public void sub()
	{
		R = x - y;
	}
	public void multiply()
	{
		R = x * y;
	}
	public void power()
	{
		R = (int) Math.pow(x,y);
	}
	public void display()
	{
		System.out.println("Result : "+R);
	}

	public static void main(String[] args)
	{
		Scanner s1  = new Scanner(System.in);  
		
		MathOperation m = new MathOperation();
		
		int ch, ans;
		
		do
		{
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Power");
			System.out.println("5.Exit");
			
			System.out.println("Enter Your Choice :");
			ch = s1.nextInt();
			m.init();
			switch(ch)
			{
			case 1:
				m.add();
				m.display();
				break;
			case 2:
				m.sub();
				m.display();
				break;
			case 3:
				m.multiply();
				m.display();
				break;
			case 4:
				m.power();
				m.display();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}
			
			System.out.println("Do you wnat to continue?(1/0).");
			ans = s1.nextInt();
			
		}while(ans != 0);
		s1.close();
	}
}


