package proyecto3eva;

/**
 * Maquina virtual, proyecto tercera evaluacion
 * 
 * @author Sierr
 */

public class CPU {

	private OperandStack pila;
	private Memory memoria;
	private boolean end;

	public CPU() {
		this.pila = new OperandStack();
		this.memoria = new Memory();
		this.end = false;
	}

	/**
	 * metodo para escribir el estado de la cpu
	 * 
	 * @param
	 * @return
	 */
	public String toString() {
		return "\n" + "\nEstado de la cpu; \n" + memoria.toString() + " \n" + pila.toString() + "\n";
	}

	/**
	 * metodo para reiniciar la pila y la memoria
	 * 
	 * @param
	 */
	public void erase() {
		this.pila = new OperandStack();
		this.memoria = new Memory();
	}

	/**
	 * booleano que retorna el final de la maquina
	 * @return
	 */
	
	public boolean isHalt() {
		return end;
	}

	/**
	 * metodo para sumas
	 * @return
	 */
	public boolean sumapila() {
		/*
		 * usar metodo pop, para sacarlo de la pila, sumarlo y luego meter el resultado
		 */

		int num1 = pila.pop();
		int num2 = pila.pop();

		int resultado = num1 + num2;

		// System.out.println(resultado);
		pila.push(resultado);

		return true;

		/* ¿Tienen que ser booleanos? */

	}

	/**
	 * metodo para restar
	 * @param
	 * @return
	 */
	public boolean restapila() {

		int num1 = pila.pop();
		int num2 = pila.pop();

		int resultado = num1 - num2;

		pila.push(resultado);

		return true;

	}

	/**
	 * metodo para dividir
	 * @param
	 */
	public boolean divpila() {

		int num1 = pila.pop();
		int num2 = pila.pop();

		int resultado = num1 / num2;

		pila.push(resultado);

		return true;
	}

	/**
	 * metodo para multiplicar
	 * @return
	 */
	public boolean mulpila() {

		int num1 = pila.pop();
		int num2 = pila.pop();

		int resultado = num1 * num2;

		pila.push(resultado);
		return true;

	}

	/**
	 * metodo para meter un valor en la pila
	 * @param n
	 * @return
	 */
	public boolean push(int n) {
		/* lo mete en la pila del operandStack */
		/* tengo que usar las otras clases */

		pila.push(n);
		return true;

	}
	
	/**
	 * metodo para hacer load
	 * @param pos
	 * @return
	 */

	public boolean load(int pos) {

		Integer CimaMemo = memoria.read(pos);
		if (pila.push(CimaMemo)) {
			return true;
		}
		return false;

	}

	
	/**
	 * metodo para hacer store
	 * @param pos
	 * @return
	 */
	public boolean store(int pos) {

		Integer CimaMemo = pila.getCima();
		if (memoria.write(pos, CimaMemo)) {
			pila.pop();
			return true;
		}

		return false;
	}

	/**
	 * metodo para hacer out
	 * @return
	 */
	public boolean out() {
		System.out.println("Cima de la pila: " + pila.getCima());
		return true;
	}

	/**
	 * metodo para hacer out
	 */
	
	public void halt() {
		this.end = true;
	}

	
	/**
	 * metodo para identificar el ByteCode y realizar la operacion
	 * @param instr
	 * @return
	 */
	public boolean execute(ByteCode instr) {
		switch (instr.getbytecode()) {
		case ADD:
			return sumapila();
		case SUB:
			return restapila();
		case MUL:
			return mulpila();
		case DIV:
			return divpila();
		case OUT:
			return out();
		case PUSH:
			return push(instr.getparam());
		case STORE:
			return store(instr.getparam());
		case LOAD:
			return load(instr.getparam());
		case HALT:
			halt();
			return true;
		default:
			System.out.println("Error: instrucción no reconocida.");
			return false;
		}
	}

	public OperandStack getOperandStack() {
		return this.pila;
	}

}
