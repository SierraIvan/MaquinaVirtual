package proyecto3eva;

public class ByteCode {
	
	private ENUM_BYTECODE name;
	private Integer param;
	
	public ByteCode(ENUM_BYTECODE name) {
		this.name = name;
			
	}
	
	public ByteCode(ENUM_BYTECODE name, Integer param) {
		
		this.name = name;
		this.param = param;
		// TODO Auto-generated constructor stub
	}

	public void push(int n) {
		/*lo mete en la pila del operandStack*/
		
	}
	
	public void add() {
		
	}
	
	public void sub() {
		
	}
	
	public void mul() {
		
	}
	
	public void div() {
		
	}
	
	public void load(int pos) {
		
	}
	
	public void store(int pos ) {
		
	}
	
	public void out() {
		
	}
	
	public void halt() {
		
	}
	
	public String ToString() {
		String param2 = param.toString();
		String name2 = name.toString();
		String bytecodename = name2 + " " + param2;
		return bytecodename;
		
		//return param.toString();
	}
	
}
