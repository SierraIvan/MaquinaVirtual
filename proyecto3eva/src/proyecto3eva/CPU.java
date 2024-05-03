package proyecto3eva;

public class CPU {
	
	private OperandStack pila;
	private Memory memoria;
	private boolean end;
	
	
	public CPU() {
		this.pila = pila;
		this.memoria = memoria;
		this.end = false;
	}
	
	
	public void ToString() {
		OperandStack operandStack = new OperandStack();
		operandStack.toString();
		Memory memory = new Memory();
		memory.toString();
	}
	
	
	public void erase() {
		this.pila = pila;
		this.memoria = memoria;
	}
	
	public boolean isHalt() {
		return end;
	}
	
	public void sumapila() {
		
	}
	
	public void restapila() {
		
	}
	
	public void divpila() {
		
	}
	
	public void mulpila() {
		
	}
	public boolean execute(ByteCode instr) {
		
		/*if(instr == ENUM_BYTECODE.ADD) {
			if(sumapila()) {
				return true;
			}else {
				return false;
			}
		}*/
		return false;
	}
}
	