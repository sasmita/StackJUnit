
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;


public class ArrayStackTest extends BaseTestStack {

	@Before
	public void start() {
		s = new ArrayStack(50);
		s1 = new Stack<Integer>();
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testFullStack()
	{
		int capacity = 10;
		s = new ArrayStack(capacity);
		
		for(int i = 0; i < capacity; i++)
			s.push(i);
		
		// pushing after the stack is full
		s.push(5);
	}
}
