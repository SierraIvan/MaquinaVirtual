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
	
	public void addbytecode(ByteCode instruction) {
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
		
		return null;
		
	}
	
	
	public void get() {
		
	}
	
	public void set() {
		
	}
	
	public void RunProgram() {
		for(int i = 0; i< program.length;i++) {
			
		}
	}

}
