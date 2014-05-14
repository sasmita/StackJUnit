
import java.util.EmptyStackException;
//import java.util.LinkedList;

public class MyLinkedListStack implements MyStack {
	
	private class Node
	{
		public int data;
		public Node next;
		
		public Node(int data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	
	private Node head = null;
	
	public void push(int item)
	{
			head = new Node(item, head);
	}
	
	public int pop()
	{
			if(head == null)
				throw new EmptyStackException();
			
			int item = peek();
			
			head = head.next;
			return item;	
	}
	public int peek()
	{
			if(head == null)
				throw new EmptyStackException();
			return head.data;	
	}
		
	public int Size()
	{
			int counter = 0;
			Node temp = head;
			while(temp!=null)
			{	
				temp = temp.next;
				counter ++;
			}
			return counter;
	}
		
		
	public boolean isEmpty()
	{
			return head == null;
	}

}

