package datastructure;

public class lloperations {
	Node head;
	
	/**
	 * Creating a Node for the linked list
	 */
	
	public class Node
	{
		int data;
		Node next;
		Node(int val)
		{
			data = val;
			next = null;
		}
	}
	
	/**
	 * Function for Inserting a value At Beginning
	 */
	
	public void insertAtBeginning(int beg)
	{
		Node NewNode=new Node(beg);
		if(head==null)
		{
			head=NewNode;
		}
		else
		{
			NewNode.next=head;
			head=NewNode;
		}
	}
	
	/**
	 * Function for Inserting value At Last
	 */
	
	public void insertAtLast(int end)
	{
		Node NewNode=new Node(end);
		Node temp;
		if(head==null)
		{
			head=NewNode;
		}
		else
		{
			temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=NewNode;
		}
	}
	
	/**
	 * Function for Inserting value At Middle
	 */
	
	public void insertAtMiddle(int mid,int pos)
	{
		Node NewNode=new Node(mid);
		Node temp,temp1,temp2;
		int count=0;
		if(head==null)
		{
			head=NewNode;
		}
		else
		{
			temp=head;
			temp1=head;
			temp2=head;
			while(temp!=null)
			{
				temp=temp.next;
				count++;
			}
			if(pos==1)
			{
				insertAtBeginning(mid);
			}
			else if(pos>count)
			{
				System.out.println("Invalid position...");
			}
			else
			{
				for(int i=1;i<pos;i++)
				{
					temp1=temp1.next;
				}
				for(int i=1;i<pos-1;i++)
				{
					temp2=temp2.next;
				}
				NewNode.next=temp1;
				temp2.next=NewNode;
			}
		}
	}
	
	/**
	 * Function for Deleting value At Beginning
	 */
	
	public void deleteAtBeginning()
	{
		Node temp;
		if(head==null)
		{
			System.out.println("The Node is Empty");;
		}
		else
		{
			temp=head;
			temp=temp.next;
			head.next=null;
			head=temp;
		}
	}
	
	/**
	 * Function for Deleting value At Last
	 */
	
	public void deleteAtLast()
	{
		Node temp1;
		int count;
		if(head==null)
		{
			System.out.println("The Node is Empty");;
		}
		else
		{
			count=countNode();
			temp1=head;
			for(int i=1;i<count-1;i++)
			{
				temp1=temp1.next;
			}
			temp1.next=null;
		}
	}
	
	/**
	 * Function for Deleting value At Middle
	 */
	
	public void deleteAtMiddle(int pos)
	{
		Node temp;
		Node temp1;
		Node temp2;
		
		if(head==null)
		{
			System.out.println("The Node is Empty");;
		}
		else
		{
			temp1=head;
			temp2=head;
			for(int i=1;i<pos;i++)
			{
				temp1=temp1.next;
			}
			for(int i=1;i<pos-1;i++)
			{
				temp2=temp2.next;
			}
			temp=temp1.next;
			temp2.next=temp;
			temp1.next=null;
		}
	}
	
	/**
	 * Function for Searching the value int the list whether the value is present in the list or not
	 */
	
	public void search(int val) {
		Node temp;
		int count=0;
		boolean flag=false;
		if(head==null)
		{
			System.out.println("The Node is Empty");;
		}
		else
		{
			temp=head;
			while(temp != null)
			{
				if(temp.data==val) {
					flag=true;
					break;
				}
				temp=temp.next;	
			}
			if(flag==true)
			{
				System.out.println(val+" is present in the list");
			}
			else
			{
				System.out.println(val+" is not present in the list");
			}
		}
	}
	
	/**
	 * Function for Display the values in the list
	 */
	
	public void display() {
		Node temp=head;
		System.out.println("Values in the Linked List : ");
		while(temp != null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
	
	/**
	 * Function for Count the values in the list
	 */
	
	public int countNode() {
		Node temp=head;
		int count=0;
		while(temp != null)
		{
			temp=temp.next;
			count+=1;
		}
		System.out.println();
		System.out.println("Number of values in the list : "+count);
		return count;
	}
}
