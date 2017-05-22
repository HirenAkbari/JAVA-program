//Write a function to get Nth node in a Linked List

class LinkGetNode
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
		data=d;
		next=null;
		}
	}
	
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	public int getNth(int index)
	{
		Node current=head;
		int  count=0;
		
		while(current!=null)
		{
			if(count==index)
			return current.data;
			
			count++;
			current=current.next;
		}
		return 0;
	}	
	public static void main(String[]args)
	{
		LinkGetNode list=new LinkGetNode();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		
		System.out.println("Element at index 1 is"+list.getNth(1));
	}
}
//Time Complexity: O(n)