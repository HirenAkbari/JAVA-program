//SinglyLinkedList deleting node

class LinkedDeletion
{
	Node head; //head of list
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
	
	public void deleteNode(int key)
	{
		Node temp=head,prev=null;
		
		// If head node itself holds the key to be deleted
		if(temp!=null && temp.data==key)
		{
			head= temp.next;//changed node
			return;
		}
		
		// Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
		while(temp!=null&&temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		// If key was not present in linked list
		if(temp==null)
		return;
	
		// Unlink the node from linked list
		prev.next=temp.next;
			
			
		
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
		LinkedDeletion link=new LinkedDeletion();
		link.push(2);
		link.push(2);
		link.push(12);
		link.push(22);
		link.push(23);
		System.out.println("\n Linked List created");
		link.printList();
		
		link.deleteNode(2);
		link.deleteNode(2);
		System.out.println("\nLinked List after Deletion at position ");
        link.printList();
		
		
		
	}
	
}



