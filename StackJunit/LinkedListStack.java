import java.util.LinkedList;
import java.util.EmptyStackException;

public class LinkedListStack implements MyStack{
	
	LinkedList<Integer> l1 = new LinkedList<Integer>();
	
	public void push(int x)
	{
		l1.addFirst(x); // check again
	}

	public int pop()
	{
		if(isEmpty() == true)
		{
			throw new EmptyStackException();
		}
		return l1.removeFirst(); // can also use pop()-- just check
	}
		
	public int peek()
	{
		if(isEmpty() == true)
		{
			throw new EmptyStackException();
		}
		return l1.getFirst(); 
	}
	
	public int Size()
	{
		return l1.size();
	}
	
	public boolean isEmpty()
	{
		if(l1.isEmpty())
			return true;
		else
			return false;
	}
}
