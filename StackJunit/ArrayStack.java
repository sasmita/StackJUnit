import java.util.EmptyStackException;

//import java.lang.IndexOutOfBoundsException;

public class ArrayStack implements MyStack {
	private int[] A;
	private int top;
	private int capacity;
	
	public ArrayStack(int c) {
		capacity = c;
		A = new int[c];
		top = -1;
	}

	public void push(int x) {
		
		if(Size() == capacity)
		{
			throw new IndexOutOfBoundsException();
		}
		
		A[++top] = x; // pre-incrementing top and then storing
		
	}

	public int pop() {
		if (top == -1) {
			throw new EmptyStackException();
		} else {
			return A[top--]; // First returning then post decrementing
		}
	}

	public int peek() {
		if (top == -1) {
			throw new EmptyStackException();
		} else {
			return A[top];
		}
	}

	public int Size() {
		return top + 1;
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

}
