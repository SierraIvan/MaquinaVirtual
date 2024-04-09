package proyecto3eva;

public class ByteCodeProgram {
	
	private ByteCode[] program;
	private int size;
	
	public ByteCodeProgram() {
        this.program = new ByteCode[10];
        this.size = 0;
    }
	
	public void addbytecode(ByteCode instruction) {
		if(size < program.length) {
		program[size] = instruction;
		size++;
		}else {
			System.out.println("ERROR: no se pueden agregar, el programa esta completo");
		}
			
	}
	
	public void replacebytecode(ByteCode instruction, int pos) {
	
		program[pos] = instruction;
		
	}

}
