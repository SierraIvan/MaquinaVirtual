package proyecto3eva;

public class OperandStack {

	private final int MAX_STACK = 10;
	private int stack[];
	int numElems;

	public OperandStack() {
		this.stack = new int[MAX_STACK];
		this.numElems = 0;
	}

	public String toString() {
		String temp = null;
		if(stack.length == 0) {
			temp = "vacio";
		}
		return temp;
	}

	public boolean isEmpty() {
		return this.numElems == 0;
		
	}

	public boolean push(int elem) {
		return true;
		
	}

	public void pop() {
		if (isEmpty() == true) {
		
		}
	}

	public void peek() {
		if (isEmpty() == true) {
			
		}
	}

}
