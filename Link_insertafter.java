//LinkedList Insert after

class LinkedAfter
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
	
	//insert a new node
	public void insertAfter(Node prev_node, int new_data)
	{
		//check if the given node is null
		if(prev_node==null)
		{
			System.out.print("The given prev_node node can not be null");
			return;
		}	
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
		
	}
	
	public void printList()
	{
		Node tnode=head;
		
		while(tnode!=null)
		{
			System.out.print(tnode.data+",");
			tnode=tnode.next;
		}
	}
	
	public static void main(String[]args)
	{
		LinkedAfter link=new LinkedAfter();
		link.push(3);
		link.push(4);
		link.push(1);
		link.push(4);
		link.insertAfter(link.head.next,8);
		System.out.println("\n created Linked List");
		link.printList();
		
		
	}
}