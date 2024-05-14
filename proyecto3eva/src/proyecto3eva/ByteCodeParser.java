package proyecto3eva;

/**
 * Maquina virtual, proyecto tercera evaluacion
 * 
 * @author Sierr
 */
public class ByteCodeParser {
	/**
	 * metodo estatico que identifica el bytecode
	 * @param s
	 * @return
	 */
	public static ByteCode parse(String s){
		
		
		String[] parts = s.split(" ");
		

		
		ENUM_BYTECODE bytecodeEnum;
        bytecodeEnum = ENUM_BYTECODE.valueOf(parts[0].toUpperCase());
		
       /* if(bytecodeEnum != ENUM_BYTECODE.ADD || bytecodeEnum != ENUM_BYTECODE.SUB || bytecodeEnum != ENUM_BYTECODE.MUL || bytecodeEnum != ENUM_BYTECODE.DIV
        		|| bytecodeEnum != ENUM_BYTECODE.OUT || bytecodeEnum != ENUM_BYTECODE.HALT || bytecodeEnum != ENUM_BYTECODE.PUSH
        		|| bytecodeEnum != ENUM_BYTECODE.LOAD || bytecodeEnum != ENUM_BYTECODE.STORE) {
        	return null;
        	
        }*/
        
		if(parts.length == 0) {
			return null;
		}else if(parts.length == 1) {
			switch(bytecodeEnum) {
			case ADD:
				return new ByteCode(ENUM_BYTECODE.ADD);
			case SUB:
				return new ByteCode(ENUM_BYTECODE.SUB);
			case MUL:
				return new ByteCode(ENUM_BYTECODE.MUL);
			case DIV:
				return new ByteCode(ENUM_BYTECODE.DIV);
			case OUT:
				return new ByteCode(ENUM_BYTECODE.OUT);
			case HALT:
				return new ByteCode(ENUM_BYTECODE.HALT);
			default:
				return null;
			
				
				//return new ByteCode(ENUM_BYTECODE.valueOf(s), ENUM_BYTECODE.valueOf(s).getValueArg());
				//valueOf, recoge el valor de s, es decir si s es ADD, ENUM_BYTECODE.valueOf(s) devuelve ENUM_BYTECODE.ADD
			}
			
		}else if(parts.length == 2) {
			
			switch(bytecodeEnum) {
			case PUSH:
				return new ByteCode(ENUM_BYTECODE.PUSH, Integer.parseInt(parts[1]));
			case LOAD:
				return new ByteCode(ENUM_BYTECODE.LOAD, Integer.parseInt(parts[1]));
			case STORE:
				return new ByteCode(ENUM_BYTECODE.STORE, Integer.parseInt(parts[1]));
				
				
			}
		}
			return null;
		
	
		//si no se presenta ningun comando retorna null

		
		
	}
	

}
