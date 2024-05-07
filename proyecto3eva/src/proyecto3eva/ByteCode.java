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

	public ENUM_BYTECODE getbytecode() {
		return this.name;
	}
	
	public int getparam() {
		return this.param;
	}
	
	
	
	
	public String ToString() {
		String param2 = param.toString();
		String name2 = name.toString();
		String bytecodename = name2 + " " + param2;
		return bytecodename;
		
		//return param.toString();
	}
	
}
