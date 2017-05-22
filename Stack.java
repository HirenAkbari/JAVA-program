/* Stack Example*/

import java.io.*;

public class Stack
{
		public int top;
		public int item[];
	
		Stack(int size)
		{
			top=-1;
			item = new int[size];
		}
	
		public void push(int data)
		{
			if(top==item.length-1)
			{
				System.out.println("stack is full");
			}
			else
			{
				item[++top]=data;
				System.out.println("pushed item:"+item[top]);
			}
				
		}
		public int pop()
		{
			if(top<0)
			{
				System.out.println("Stack is underflow");
				return 0;
			}
			else
			{
				System.out.println("pop Item:"+item[top]);
				return item[top--];
			}
				
		}
		public static void main(String[]args) throws IOException
		{
			Stack st=new Stack(5);
			boolean yes=true;
			
			int choice;
			
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			do{
				System.out.println("1).Push\n2).Pop\n3).Exit\n\nEnter Choice");
				
				choice=Integer.parseInt(is.readLine());
				
				switch(choice)
				{
					case 1:
						System.out.println("Enter your push item");
						st.push(Integer.parseInt(is.readLine()));
						break;
						
					case 2:
						st.pop();
						break;
						
					case 3:
						yes=false;
						break;
						
					default:
						System.out.println("Invalid choice");}
			}while(yes==true);
		
	}
	
	
	
}
