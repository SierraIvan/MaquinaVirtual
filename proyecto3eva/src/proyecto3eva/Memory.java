package proyecto3eva;

/**
 * Maquina virtual, proyecto tercera evaluacion
 * 
 * @author Sierr
 */

public class Memory {

	private final int MAX_Memory = 10;
	private Integer memory[];
	private int size;
	private boolean empty;

	public Memory() {
		this.memory = new Integer[MAX_Memory];
		this.size = 0;

	}

	/**
	 * metodo que trasnforma el array en un string
	 */
	public String toString() {
		String chain = "";
		int lol = 0;
		if (this.isEmpty() == true) {
			return "Memoria: <Vacia>";
		} else {
			for (int i = 0; i < memory.length; i++) {
				chain = "[" + i + "]" + ": " + memory[i] + " ";
				// lol = i;
			}
			chain = "Memoria: " + chain;

			return chain;
		}
	}

	/**
	 * metodo para escribir en el array de memory
	 * 
	 * @param pos
	 * @param valor
	 * @return
	 */

	// recibe posicion y valor
	public boolean write(int pos, int valor) {
		if (pos >= 0) {
			this.resize(pos);
			this.memory[pos] = valor;
			size++;
			return true;
		} else {
			return false;
		}

	}

	/**
	 * metodo booleano que retorna si el array esta vacio o no
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	/**
	 * metodo para leer la posicion indicada del array
	 * 
	 * @param pos
	 * @return
	 */

	// recibe posicion del array
	public Integer read(int pos) {
		// System.out.println(this.memory[pos]);
		if (this.memory[pos] == null) {
			return -1;
		} else {
			return this.memory[pos];
		}
	}

	/**
	 * metodo para aumentar el tamaño del array
	 * 
	 * @param pos
	 */
	private void resize(int pos) {
		empty = false;
		if (pos >= this.size) {
			pos = pos * 2;
			Integer array2[] = new Integer[pos];
			for (int i = 0; i < array2.length; i++) {
				if (i <= memory.length) {
					array2[i] = memory[i];
				}
			}
			this.memory = array2;
		}
	}

}
