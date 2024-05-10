package proyecto3eva;

public class CPU {

	private OperandStack pila;
	private Memory memoria;
	private boolean end;

	public CPU() {
		this.pila = new OperandStack();
		this.memoria = new Memory();
		this.end = false;
	}

	public void ToString() {
		OperandStack operandStack = new OperandStack();
		operandStack.toString();
		Memory memory = new Memory();
		memory.toString();
	}

	public void erase() {
		this.pila = new OperandStack();
		this.memoria = new Memory();
	}

	public boolean isHalt() {
		return end;
	}

	public boolean sumapila() {
		/*
		 * usar metodo pop, para sacarlo de la pila, sumarlo y luego meter el resultado
		 */

		int num1 = pila.pop();
		int num2 = pila.pop();

		int resultado = num1 + num2;

		System.out.println(resultado);
		pila.push(resultado);

		return true;

		/* ¿Tienen que ser booleanos? */

	}

	public boolean restapila() {

		
		int num1 = pila.pop();
		int num2 = pila.pop();

		int resultado = num1 - num2;

		pila.push(resultado);

		return true;

	}

	public boolean divpila() {

	
		int num1 = pila.pop();
		int num2 = pila.pop();

		int resultado = num1 / num2;

		pila.push(resultado);

		return true;
	}

	public boolean mulpila() {

		
		int num1 = pila.pop();
		int num2 = pila.pop();

		int resultado = num1 * num2;

		System.out.println(resultado);
		pila.push(resultado);
		return true;

	}

	public boolean push(int n) {
		/* lo mete en la pila del operandStack */
		/* tengo que usar las otras clases */

		pila.push(n);
		return true;

	}

	public void load(int pos) {

		memoria.read(pos);

	}

	public void store(int pos) {

		// memoria.store(pos, pila.peek());
	}

	public boolean out() {
		System.out.println("Cima de la pila: " + pila.getcima());
		return true;
	}
	
	public void halt() {
		this.end = true;
	}
	

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
		case HALT:
			halt();
			return true;
		default:
			System.out.println("Error: instrucción no reconocida.");
			return false;
		}
	}

}
