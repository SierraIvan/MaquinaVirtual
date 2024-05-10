package proyecto3eva;

public class ByteCodeProgram {
	OperandStack operandStack;
	private ByteCode[] program;
	private int size;
	private int NumElem;
	
	public ByteCodeProgram() {
		operandStack = new OperandStack();
        this.size = 10;
        this.program = new ByteCode[size];
        this.NumElem = 0;
    }
	
	
	
	/*addbytecode*/
	public void setInstruction(ByteCode instruction) {
		if(this.NumElem < this.program.length) {
		this.program[this.NumElem] = instruction;
		this.NumElem++;
		System.out.println(program[0]);
		}else {
			System.out.println("ERROR: no se pueden agregar, el programa esta completo");
		}
	}
	
	public void replacebytecode(ByteCode instruction, int pos) {
	
		if(pos <= this.NumElem) {
		program[pos] = instruction;
		}else {
			System.out.println("no hay nada en ese espacio, porfavor, elija un espacio ya ocupado para poder reemplazarlo");
		}
	}
	
	public void resize() {
		size = size * 2;
	}
	
	public String toString() {
		
		String temp = "";
		for(int i = 0; i < program.length;i++) {
			if(program[i] == null) {
				
			}else {
				
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
		for(int i = 0; i < NumElem;i++) {
			
			if(!cpu.isHalt() && cpu.execute(this.program [i])) {
				
				mensaje = "El estado de la maquina tras ejecutar el bytecode PUSH 3 es: ";
				System.out.println(mensaje);
				operandStack.toString();
				
			}else if(!cpu.isHalt()) {
				
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
