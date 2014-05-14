import static org.junit.Assert.*;

import java.util.EmptyStackException;
import java.util.Stack;
import org.junit.Test;

public abstract class BaseTestStack {

	MyStack s;
	Stack<Integer> s1;
	
	@Test
	public void testEmpty() {
		assertTrue(s.isEmpty() == true);
	}
	
	@Test
	public void testSize() {
		assertEquals(s.Size(), 0);
	}
	
	@Test
	public void testSizeK() 
	{
		int i;
		int k = 5; // todo is this the best way??
		
		for(i = 0; i < k; i++)
			s.push(i);
		
		assertTrue("testSizeK failed: Either Stack is empty or Size is not K", (s.isEmpty() == false && s.Size() == k));
	}
	
	@Test
	public void testSizeSame()
	{
		int p = 3;
		s.push(p);
		
		// Size before peaking
		int prevSize = s.Size();
		
		assertEquals(s.peek(), p);
		assertEquals(s.Size(), prevSize);
	}
	
	@Test
	public void testPop()
	{
		int p = 5;
		s.push(p);
		assertTrue("testPop failed", s.pop() == p);
	}
	
	@Test
	public void testKPops()
	{
		int i;
		int k = 5;
		for (i = 0; i < k ; i++)
			s.push(i);
		
		// At this point size is k
		assertTrue("After K pushes, size should be k", s.Size() == k);
		
		for(i = 0; i < k; i++)
			s.pop();
		
		assertTrue("After K pops, size should be zero", s.Size() == 0);
	}

	@Test(expected = EmptyStackException.class)
	public void testPopEmpty()
	{	
		s.pop();
	}
	
	@Test(expected = EmptyStackException.class)
	public void testPeekEmpty()
	{
		s.peek();
	}
	
	@Test
	public void testWithApiForEmpty()
	{
		assertEquals(s.isEmpty(), s1.isEmpty());
	}
	
	@Test
	public void testWithApiForKPushes()
	{
		int k = 5;
		
		for(int i = 0; i < k; i++) {
			s.push(i);
			s1.push(i);
		}
		
		assertEquals(s.Size(), s1.size());
	}	
}
