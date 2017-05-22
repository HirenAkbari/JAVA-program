//Linked List Inserting node

class LinkInsertNode
{
	Node head;//head of list
	
	/* Node class*/
	
	class Node
	{
		int data;
		Node next;
		
		/* construcutor  to create new node*/
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	/* This function is in LinkInsertNode class. Inserts a
	   new Node at front of the list. This method is 
       defined inside LinkInsertNode class shown above */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
              Put in the data*/
		Node new_node =new Node(new_data);
		
		/* Make a  next of new_data as head*/
		new_node.next=head;
		
		head=new_node;//Move the  head point to new Node*/
		
	}
	
	/* Inserts a new node after the given prev_node*/
	public void insertAfter(Node preve_node,int new_data)
	{
		/* 1. Check if the given Node is null */
		if(preve_node==null)
		{
			System.out.print(" The given prev_node  can not be null");
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
	
	//Method to print middle of LinkedList
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
		System.out.println("The middle elmetn is["+slow_ptr.data+"]\n");
		}
	}
	
	/* This function prints contents of linked list starting from
        the given node */
	public void printlist()
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
		LinkInsertNode node = new LinkInsertNode();
		node.push(5);
		node.push(1);
		node.push(3);
		node.push(4);
		node.insertAfter(node.head.next,2);
		node.append(6);
		System.out.println("\n created Linked List");
		node.printlist();
		node.printMiddle();
		
	}
}

/*======================================================================================
solution print middle
Traverse linked list using two pointers. 
Move one pointer by one and other pointer by two. 
When the fast pointer reaches end slow pointer will reach middle of the linked list.
=========================================================================================*/