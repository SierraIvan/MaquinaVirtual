package proyecto3eva;

public class Command {
	
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;
	
	
	public boolean execute(Engine engine) {
		
		//en caso de que la ejecucion del comando sea incorrecta, devuelve false
		return false;
		
	}
	

}
