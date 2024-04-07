package proyecto3eva;

public class ByteCodeProgram {
	
	private ByteCode[] program;
	private int size;
	
	public ByteCodeProgram() {
        this.program = new ByteCode[10];
        this.size = 0;
    }
	
	public void addbytecode(ByteCode instruction) {
		program[size] = instruction;
		size++;
			
	}
	
	public void repalebytecode(ByteCode instruction, int pos) {
	
		program[pos] = instruction;
		
	}

}
