package proyecto3eva;

public class ByteCodeProgram {
	
	private ByteCode[] program;
	private int size;
	private int NumElem;
	
	public ByteCodeProgram() {
        this.size = 1;
        this.program = new ByteCode[size];
        this.NumElem = 0;
    }
	/*addbytecode*/
	public void setInstruction(ByteCode instruction) {
		if(NumElem < program.length) {
		program[NumElem] = instruction;
		NumElem++;
		}else {
			System.out.println("ERROR: no se pueden agregar, el programa esta completo");
		}
	}
	
	public void replacebytecode(ByteCode instruction, int pos) {
	
		if(pos <= NumElem) {
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
			temp = temp + " " + program[i];
		}
		return temp;
		
	}
	
	public ByteCode get(int pos) {
		
		return program[pos];
		
	}
	
	public void set() {
		
	}
	
	public String runProgram(CPU cpu) {
		String mensaje = "hola";
		for(int i = 0; i < NumElem;i++) {
			if(!cpu.isHalt() && cpu.execute(this.program [i])) {
				
			}else if(!cpu.isHalt()) {
				
			}
		}
		cpu.erase();
		return mensaje;
	}
	
	
	public void reset() {
		this.size = 1;
		this.program = new ByteCode[size];
		this.NumElem = 0;
	}

}
