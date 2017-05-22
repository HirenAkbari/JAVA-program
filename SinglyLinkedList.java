//Write a java program singlyLinked List using scanner calss*/
import java.util.Scanner;
class Node
{
	protected int data;
	protected Node next;
	
	/* Constructor*/
	public Node()
	{
		data=0;
		next=null;
	}
	
	/* Constructor*/
	public Node(int d,Node n)
	{
		data=d;
		next=n;
	}
	
	/*Method to set link to next node*/
	
	public void setLink(Node n)
	{
		next=n;
	}
	
	/* Method to set data to currentnode*/
	
	public void setData(int d)
	{
		data=d;
	}
	
	/*Method to get link to next node*/
	
	public Node getLink()
	{
		return next;
	}
	
	/* Method to get data from current node*/
	
	public int getData()
	{
		return data;
	}
	
}

class LinkedList
{
	protected Node head;
	protected Node tail;
	protected int size=0;
	
	public LinkedList()
	{
		head=null;
		tail=null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public int getSize()
	{
		return size;
	}
	
	/* Method to insert  an element at begining*/
	
	public void insertStart(int new_data)
	{
		Node new_node=new Node(new_data,null);
		size++;
		
		if(head==null)
		{
			head=new_node;
			tail=head;
		}
		else
		{
			new_node.setLink(head);
			head=new_node;
		}
	}
	
	/* Method to insert  an element at End*/
	public void insertEnd(int val)
	{
		Node new_node=new Node(val,null);
		size++;
		
		if(head==null)
		{
			head=new_node;
			tail=head;
		}
		else
		{
			tail.setLink(new_node);
			tail=new_node;
		}
	}
	
	/* Method to insert  an element at position*/
	public void inserAtPosition(int val,int pos)
	{
		Node new_node=new Node(val,null);
		Node current=head;
		pos=pos-1;
		for(int i=1;i<size;i++)
		{
			if(i==pos)
			{
			Node temp=current.getLink();
		    current.setLink(new_node);
			current.setLink(temp);
			break;
			}
			current=current.getLink();
		}
		size++;
	}
	
	/* Method to Delete  an element at position*/
	public void deletePos(int pos)
	{
		if(pos==1)
		{
			head=head.getLink();
			size--;
			return;
		}
		
		if(pos==size)
		{
			Node h=head;
			Node t=head;
			
			while(h!=tail)
			{
				
				t=h;
				h=h.getLink();
			}
			tail=t;
			tail.setLink(null);
			size--;
			return;
		}
		
		Node ptr = head;
        pos = pos - 1 ;
        for (int i = 1; i < size - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size-- ;
		
	}
	
	/* Method to display element*/
	public void display()
	{
		System.out.print("\n Singly Linked List):");
		
		if(size==0)
		{
			System.out.print("empty\n");
			return;
		}
		
		if(head.getLink()==null)
		{
			System.out.print(head.getData());
			return;
		}
		
		Node ptr=head;
		
		System.out.print(head.getData()+"->");
		
		ptr=head.getLink();
		
		while(ptr.getLink()!=null)
		{
			System.out.print(ptr.getData()+"->");	
			ptr=ptr.getLink();
		}
		System.out.print(ptr.getData()+"\n");
	}
}

public class SinglyLinkedList
{
	public static void main(String[]args)
	{
	
	Scanner sc=new Scanner(System.in);
	LinkedList list=new LinkedList();
	System.out.println("Singly Linked List test\n");
	
	char ch;
	do
	{
		System.out.println("\n SinglyLinkedList Operation");
		System.out.println("1.Insert at begining");
		System.out.println("2.Insert at position");
		System.out.println("3.Insert at End");
		System.out.println("4.Delete at postion");
		System.out.println("4.check empty");
		System.out.println("5.get size");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter integer element  to insert");
				list.insertStart(sc.nextInt());
				break;
			
			case 2:
				System.out.println("Enter integer element  to insert ");
				int num=sc.nextInt();
				
				System.out.println("Enter position");
				int pos=sc.nextInt();
				
				if(pos<=1||pos>list.getSize())	
				System.out.println("Invalid position\n");
				else
				 list.inserAtPosition(num,pos);
				break;
			
			case 3:
				System.out.println("Enter integer element  to insertEnd");
				list.insertEnd(sc.nextInt());
				break;
				
			case 4:
				  System.out.println("Enter deletePos");
				   int p = sc.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deletePos(p);
                break;
			
			case 5:
				System.out.println("Empty status="+list.isEmpty());
				break;
				
			case 6:
				System.out.println("size="+list.getSize()+"\n");
				break;
			default:
			System.out.println("\n Wrong Entry \n");
			break;
		}
		
		/* Display List*/
		list.display();
		System.out.println("\nDo you want to continue (Type y or n) \n");
		ch=sc.next().charAt(0);
	
	}while(ch=='Y'||ch=='y');
	}
}