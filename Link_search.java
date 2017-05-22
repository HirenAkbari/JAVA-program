// Iterative Java program to search an element
// in linked list

class LinkSearch
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
	
	public boolean search(Node head,int key)
	{
		Node current=head;
		
		while(current!=null)
		{
			if(current.data==key)
			
				return true;
				current=current.next;
				
		}
		return false;
	}
	public static void main(String[]args)
	{
		LinkSearch sr=new LinkSearch();
		sr.push(12);
		sr.push(13);
		sr.push(14);
		sr.push(15);
		sr.push(16);
		
		if(sr.search(sr.head,22))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}