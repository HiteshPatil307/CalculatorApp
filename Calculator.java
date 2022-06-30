




public class Calculator
{
	
	 
	private int x=5, y=10;
	private int R;
	
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
		  
		
		Calculator m = new Calculator();
		
			
			System.out.println("1.Addition");
				m.add();
				m.display();
				
			System.out.println("2.Subtraction");
				m.sub();
				m.display();
				
			System.out.println("3.Multiplication");
				m.multiply();
				m.display();
			System.out.println("4.Power");	
				m.power();
				m.display();

			
	}
}


