package proyecto3eva;

public class Memory {

	private final int MAX_Memory = 10;
	private Integer memory[];
	private int size;
	private boolean empty;

	public Memory() {
		this.memory = new Integer[MAX_Memory];
		this.size = 0;

	}

	/*
	 * operandStack, memomry, BCprogram, y no se acuerda de mas, esta en el commit
	 * que tiene privado, la CPU,me espero epicamente, cree que ya esta, un saludo
	 */

	public String toString() {
		String chain = "";
		int lol = 0;
		if (this.isEmpty() == true) {
			return "Memoria: <Vacia>";
		} else {
			for (int i = 0; i < memory.length; i++) {
				chain = "[" + i + "]" + ": " + memory[i] + " ";
				//lol = i;
			}
			chain = "Memoria: " + chain;
			
			return chain;
		}
	}

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

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	// recibe posicion del array
	public Integer read(int pos) {
		// System.out.println(this.memory[pos]);
		if (this.memory[pos] == null) {
			return -1;
		} else {
			return this.memory[pos];
		}
	}

	// aumenta tamaño del array
	// haces un array nuevo con el doble del anterior
	// en la mitad del nuevo array se meten los elementos que habia en el array de
	// antes y en la segunda mitad se inicializan todas las posiciones a null
	// luego el nuevo array pasa a ser el atributo
	// this.memory = new_array
	// solamente se ejecuta cuando la posicion en la que quiero escribir esta fuera
	// del array.lenght
	// deberia recibir pos
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
