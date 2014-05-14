import java.util.Queue;
import java.util.LinkedList;
import java.util.EmptyStackException;

public class QueueStack implements MyStack {
	
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int a)
	{
		//enqueue
		q1.add(a); 
	}
	
	public int pop()
	{
		if (q1.size() == 0)
			throw new EmptyStackException();
		else
		{
			int len = q1.size();
			for (int i = 0; i < len - 1; i++)
			{
				q2.add(q1.remove());
			}
			int res = q1.remove();
			
			for(int i = 0; i < len - 1; i++)
			{
				q1.add(q2.remove());
			}
			
			return res;
		}
	}
	
	public int peek()
	{
		if(q1.isEmpty() == true)
			throw new EmptyStackException();
		return q1.peek();		
	}
	
	public int Size()
	{
		return q1.size();
	}
	
	public boolean isEmpty()
	{
		if (q1.size() == 0)
			return true;
		else
			return false;
	}
	

}
