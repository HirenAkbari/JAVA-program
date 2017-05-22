//swap nodes in a linked list without swapping data;

class LinkSwap
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
	
	/* Function to swap Nodes x and y in linked list by
       changing links */
	public void swap(int x,int y)
	{
		 // Nothing to do if x and y are same
		 if(x==y)
			return;
		
		//Search for x and (keep track of prevX and CurrX)
		
		Node prevX=null,currx=head;
		
		while(prevX!=null&&currx!=null)
		{
			prevX=currx;
			currx=currx.next;
		}
		
	   //Search for y and (keep track of prevY and CurrY)
	   
	   Node prevY=null,currY=head;
	   while(prevY!=null&&currY!=null)
	   {
		   prevY=currY;
		   currY=currY.next;
	   }
	   
	   // If either x or y is not present,nothing to do
	   if(currx==null||currY==null)
		return;
		
		// If x is not head of linked list
		if(prevX!=null)
			prevX.next=currY;
		else
			head=currY;
		
		// If y is not head of linked list
		if(prevY!=null)
			prevY.next=currx;
		else
			head=currx;
		
		//swap next pointer
		Node temp=currx.next;
		currx.next=currY.next;
		currY.next=temp;
	}
	public void printlList()
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
		LinkSwap list=new LinkSwap();
		list.push(12);
		list.push(13);
		list.push(14);
		list.push(15);
		list.push(16);
		//list.printlList();
		System.out.print("\n Linked list before calling swapNodes() ");
		list.printlList();
		
		list.swap(14,13);
		System.out.print("\n Linked list after calling swapNodes() ");
		
		list.printlList();
		
		
	}
}