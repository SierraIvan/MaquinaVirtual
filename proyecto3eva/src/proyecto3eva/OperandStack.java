package proyecto3eva;

/**
 * Maquina virtual, proyecto tercera evaluacion
 * 
 * @author Sierr
 */

public class OperandStack {

	private final int MAX_STACK = 10;
	private int stack[];
	int numElems;

	public OperandStack() {
		this.stack = new int[MAX_STACK];
		this.numElems = 0;
	}

	/**
	 * metodo que transforma el array en un string
	 */
	public String toString() {
		String chain = "";
		if (this.isEmpty() == true) {
			return "<Vacia>";
		} else {
			for (int i = 0; i < this.numElems; i++) {
				chain += stack[i] + " ";
			}
			chain = "Pila: " + chain;
			return chain;
		}
	}

	/**
	 * metodo que devuelve si el array esta vacio o no
	 * @return
	 */
	public boolean isEmpty() {

		return (this.numElems == 0);
	}

	/**
	 * metodo para meter en el array
	 * @param elem
	 * @return
	 */
	public boolean push(int elem) {
		if (MAX_STACK <= numElems) {
			System.out.println("La pila está llena.");
			return false;
		}

		stack[numElems] = elem;
		numElems++;
		return true;
	}
	
	/**
	 * metodo para sacar del array
	 * @return
	 */

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
	
	/**
	 * metodo para mostrar valor del array
	 * @return
	 */

	public int peek() {
		if (isEmpty()) {
			return -1;
		} else {
			return stack[numElems];
		}
	}
	/**
	 * metodo que devuelve la cima del array
	 * @return
	 */

	public int getCima() {

		return stack[numElems - 1];

	}

}
