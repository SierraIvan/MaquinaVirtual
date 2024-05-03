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
		if(MAX_STACK <= numElems) {
			System.out.println("La pila está llena.");
            return false;
		}
		numElems++;
        stack[numElems] = elem;
        return true;
		
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("la pila esta vacia");
			return -1;
		}else {
			int value = stack[numElems];
			numElems--;
			return value;
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("la pila esta vacia");
			return -1;
		}else {
			return stack[numElems];
		}
	}

}
