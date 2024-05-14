package proyecto3eva;
/**
 * Maquina virtual, proyecto tercera evaluacion
 * 
 * @author Sierr
 */

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

	/**
	 * metodo que retorna el nombre del bytecode
	 * @return
	 */
	public ENUM_BYTECODE getbytecode() {
		return this.name;
	}
	
	/**
	 * metodo que retorna el parametro del bytecode
	 * @return
	 */
	public int getparam() {
		return this.param;
	}
	
	
	
	/**
	 * metodo tu estrng qe retorna el bytecode entero
	 * @return
	 */
	public String ToString() {
		String param2 = param.toString();
		String name2 = name.toString();
		String bytecodename = name2 + " " + param2;
		return bytecodename;
		
		
	}
	
}
