//LinkedList inserting end of node
class LinkInsertEnd
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
	
	public void insertAfter(Node preve_node,int new_data)
	{
		if(preve_node==null)
		{
			System.out.println(" The given preve_node can not be null");
			return;
		}
		Node new_node=new Node(new_data);
		
		new_node.next=preve_node.next;
		preve_node.next=new_node;
	}
	
	public void append(int new_data)
	{
		Node new_node=new Node(new_data);
		
		if(head==null)
		{
			head=new Node(new_data);
			return;
		}
		new_node.next=null;
		
		Node last=head;
		
		while(last.next!=null)
		last=last.next;
		last.next=new_node;
		return;	
		
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
		LinkInsertEnd link=new LinkInsertEnd();
		link.append(1);
		link.push(2);
		link.insertAfter(link.head.next,3);
		link.append(4);
		System.out.println("\n LinkedList created");
		link.printList();
	}
	
}