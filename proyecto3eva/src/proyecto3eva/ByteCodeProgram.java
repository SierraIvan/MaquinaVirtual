package proyecto3eva;
/**
 * Maquina virtual, proyecto tercera evaluacion
 * 
 * @author Sierr
 */

public class ByteCodeProgram {
	OperandStack operands;
	private ByteCode[] program;
	private int size;
	private int NumElem;

	public ByteCodeProgram() {

		this.size = 1;
		this.program = new ByteCode[size];
		this.NumElem = 0;
		operands = new OperandStack();
	}

	/* addbytecode */
	/**
	 * mete una instruccion en el array
	 * @param instruction
	 */
	
	public void setInstruction(ByteCode instruction) {
		if (NumElem >= size) {
			this.resize();
		}
		this.program[this.NumElem] = instruction;
		this.NumElem++;

	}

	/**
	 * remplaza un bytecode
	 * @param instruction
	 * @param pos
	 */
	public void replacebytecode(ByteCode instruction, int pos) {

		if (pos <= this.NumElem) {
			program[pos] = instruction;
		} else {
			System.out.println(
					"no hay nada en ese espacio, porfavor, elija un espacio ya ocupado para poder reemplazarlo");
		}
	}

	/**
	 * este metodo aumenta el tamaño del array
	 */
	public void resize() {
		size = size * 2;
		
			ByteCode[] temp = new ByteCode[size];
			for (int i = 0; i < this.program.length; i++) {
				temp[i] = this.program[i];
			}
			this.program = temp;
		
	}

	/**
	 * convierte el array en un string
	 */
	public String toString() {

		String temp = "";
		for (int i = 0; i < program.length; i++) {
			if (this.program[i] == null) {

			} else {

				temp = temp + i + ": " + this.program[i].getbytecode();
				switch (this.program[i].getbytecode()) {
				case PUSH:
				case LOAD:
				case STORE:
					temp += " " + program[i].getparam();
					break;
				default:
					break;
				}

				temp += "\n";

			}

		}
		return temp;

	}
/**
 * retorna el bytecode de la posicion indicada
 * @param pos
 * @return
 */
	public ByteCode get(int pos) {

		return this.program[pos];

	}

/**
 * metodo para recorrer el programa
 * @param cpu
 * @return
 */
	public String runProgram(CPU cpu) {
		String mensaje = "";
		for (int i = 0; i < this.NumElem; i++) {

			if (!cpu.isHalt() && cpu.execute(this.program[i])) {
				/*
				 * para que el objeto de operandStack de cpu este aqui, es decir, para que este
				 * objeto operandstack coja los valores del objeto de operandstack de cpu
				 */
				this.operands = cpu.getOperandStack();
				if (this.program[i].getbytecode() == ENUM_BYTECODE.PUSH
						|| this.program[i].getbytecode() == ENUM_BYTECODE.LOAD
						|| this.program[i].getbytecode() == ENUM_BYTECODE.STORE) {
					mensaje = "El estado de la maquina tras ejecutar de " + this.program[i].getbytecode() + " "
							+ this.program[i].getparam() + " es: ";
				} else {
					mensaje = "El estado de la maquina tras ejecutar de " + this.program[i].getbytecode() + " es: ";
				}

				mensaje = mensaje + cpu.toString();
				System.out.println(mensaje);

				// System.out.println(this.operands.toString());

			} else if (!cpu.isHalt()) {

			}
		}

		cpu.erase();
		return mensaje;
	}
/**
 * metodo para resetear los parametros de la clase
 */
	public void reset() {
		this.size = 1;
		this.program = new ByteCode[size];
		this.NumElem = 0;
	}

}

