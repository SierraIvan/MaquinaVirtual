package proyecto3eva;

public class ByteCodeProgram {
	OperandStack operands = new OperandStack();
	private ByteCode[] program;
	private int size;
	private int NumElem;

	public ByteCodeProgram() {
		
		this.size = 10;
		this.program = new ByteCode[size];
		this.NumElem = 0;
	}

	/* addbytecode */
	public void setInstruction(ByteCode instruction) {
		if (this.NumElem < this.program.length) {
			this.program[this.NumElem] = instruction;
			this.NumElem++;
		} else {
			resize();
			System.out.println("ERROR: no se pueden agregar, el programa esta completo");
		}
	}

	public void replacebytecode(ByteCode instruction, int pos) {

		if (pos <= this.NumElem) {
			program[pos] = instruction;
		} else {
			System.out.println(
					"no hay nada en ese espacio, porfavor, elija un espacio ya ocupado para poder reemplazarlo");
		}
	}

	public void resize() {
		size = size * 2;
	}

	public String toString() {

		String temp = "";
		for (int i = 0; i < program.length; i++) {
			if (program[i] == null) {

			} else {

				temp = temp + i + ": " + program[i].getbytecode();
				switch (program[i].getbytecode()) {
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

	public ByteCode get(int pos) {

		return program[pos];

	}

	public void set() {

	}

	public String runProgram(CPU cpu) {
		String mensaje = "";
		for (int i = 0; i < NumElem; i++) {

			if (!cpu.isHalt() && cpu.execute(this.program[i])) {

				if (this.program[i].getbytecode() == ENUM_BYTECODE.PUSH || this.program[i].getbytecode() == ENUM_BYTECODE.LOAD || this.program[i].getbytecode() == ENUM_BYTECODE.STORE) {
					mensaje = "El estado de la maquina tras ejecutar de " + this.program[i].getbytecode() + " "
							+ this.program[i].getparam() + " es: ";
				} else {
					mensaje = "El estado de la maquina tras ejecutar de " + this.program[i].getbytecode() + " es: ";
				}

				mensaje = mensaje + cpu.toString();
				operands.toString();
			} else if (!cpu.isHalt()) {

			}
		}
		
		cpu.erase();
		return mensaje;
	}

	public void reset() {
		this.size = 10;
		this.program = new ByteCode[size];
		this.NumElem = 0;
	}

}
/*
 * public String runProgram(CPU cpu) {
		String mensaje = "";
		for (int i = 0; i < NumElem; i++) {

			if (!cpu.isHalt() && cpu.execute(this.program[i])) {

				if (this.program[i].getbytecode() == ENUM_BYTECODE.ADD) {
					mensaje = "El estado de la maquina tras ejecutar de " + this.program[i].getbytecode() + " es: ";
				} else {
					mensaje = "El estado de la maquina tras ejecutar de " + this.program[i].getbytecode() + " "
							+ this.program[i].getparam() + " es: ";
				}

				System.out.println(mensaje);
			} else if (!cpu.isHalt()) {

			}
		}
		operandStack.toString();
		cpu.erase();
		return mensaje;
	}
 * */
 