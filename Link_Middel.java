//Print The Middelt Element using SinglyLinkedList

class LinkedMiddeleElement
{
	Node head;
	
	class Node
	{
		int data;
		Node next;

		Node(int data)
		{
		this.data=data;
		next=null;
		}
	}	
	
	public void add(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	public void printMiddle()
	{
		Node fast_ptr=head;
		Node slow_ptr=head;
		
		if(head!=null)
		{
			while(fast_ptr!=null&&fast_ptr.next!=null)
			{
				fast_ptr=fast_ptr.next.next;
				slow_ptr=slow_ptr.next;
			}
			System.out.print("The midddle Element is:-["+slow_ptr.data+"]\n");
		}
	}
	public void printList()
	{
		Node tnode=head;
		
		while(tnode!=null)
		{
			System.out.print(tnode.data+",");
			tnode=tnode.next;
		}
		System.out.print("null");

	}
	public static void main(String[]args)
	{
		LinkedMiddeleElement list=new LinkedMiddeleElement();
		for(int i=0;i<5;i++)
		{
			list.add(i);
			list.printList();
			list.printMiddle();
		}
	}
} 