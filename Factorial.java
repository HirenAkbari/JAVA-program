package logicalcoding;

public class Factorial {

	public static int fact(int num)
	{
		if(num==1)
		{
			return 1;
		}
		return num*fact(num-1);
	}
	
	public static void main(String[] args) {
		
		int num=6;
		int fact=fact(num);
		System.out.println(fact);

	}

}
