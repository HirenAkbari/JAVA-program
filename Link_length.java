//Find Length of a LinkedList 

class LinkedLength
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
		new_node.next= head;
		head=new_node;
	}
	
	public int  getCount()
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
			
		}
		return count;
		
	}
	
	public static void main(String[]args)
	{
		LinkedLength len=new LinkedLength();
		len.push(12);
		len.push(13);
		len.push(14);
		len.push(15);
		len.push(16);
		System.out.print("count of nodes:"+len.getCount());
		
	}
}