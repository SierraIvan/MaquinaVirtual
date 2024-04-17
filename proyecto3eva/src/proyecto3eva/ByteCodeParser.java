package proyecto3eva;

public class ByteCodeParser {
	
	public static ByteCode parse(String s){
		
		
		String[] parts = s.split(" ");
		
		if(parts.length == 0) {
			return null;
		}else if(parts.length == 1) {
			switch(s) {
			case "ADD":
			case "SUB":
			case "MUL":
			case "DIV":
			case "OUT":
			case "HALT":
				return new ByteCode(ENUM_BYTECODE.valueOf(s), ENUM_BYTECODE.valueOf(s).getValueArg());
				//valueOf, recoge el valor de s, es decir si s es ADD, ENUM_BYTECODE.valueOf(s) devuelve ENUM_BYTECODE.ADD
				
			}
			
		}else if(parts.length == 2) {
			
			switch(parts[0]) {
			case "PUSH":
			case "LOAD":
			case "STORE":
				return new ByteCode(ENUM_BYTECODE.valueOf(parts[0]), Integer.parseInt(parts[1]));
				
				
			}
		}
			return null;
		
	
		//si no se presenta ningun comando retorna null

		
		
	}
	

}
