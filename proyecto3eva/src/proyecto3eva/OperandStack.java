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
		String chain = "";
		if (this.isEmpty() == true) {
			return "<Vacia>";
		} else {

			for (int i = 0; i < this.numElems; i++) {
				chain += stack[i] + " ";
			}
			return chain;
		}
	}

	public boolean isEmpty() {
		if (this.numElems == 0) {
			return true;
		}
		return false;

	}

	public boolean push(int elem) {
		if (MAX_STACK <= numElems) {
			System.out.println("La pila está llena.");
			return false;
		}

		stack[numElems] = elem;
		numElems++;
		return true;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			int value = stack[numElems - 1];
			stack[numElems - 1] = 0;
			numElems--;
			return value;
		}
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		} else {
			return stack[numElems];
		}
	}

	public int getcima() {

		return stack[numElems - 1];

	}

}
