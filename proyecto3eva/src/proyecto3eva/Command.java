package proyecto3eva;



public class Command {
	
	private ENUM_COMMAND name;
	private ByteCode instruction;
	private int replace;
	
    public Command(ENUM_COMMAND command) {
        this.name = command;
    }
    public Command(ENUM_COMMAND command, ByteCode instruction) {
        this.name = command;
        this.instruction = instruction;
    }
    public Command(ENUM_COMMAND command, int replace) {
        this.name = command;
        this.replace = replace;
    }
    
    

    
    
	public boolean execute(Engine engine) {

		
		
		
		//Engine engine1 = new Engine();
		
		
		switch (this.name) {
		case HELP:
			engine.help();
			return true;
		case QUIT:
			engine.setEnd();
			engine.quit();
			return true;
		case RUN:
			engine.run();
			return true;
		case NEWINST:
			/*manda un objeto tipo ByteCode*/

			engine.newinst(this.instruction);
			return true;
		case RESET:
			engine.reset();
			return true;
		case REPLACE:
			/*manda al metodo replace el numero*/
			engine.replace(this.replace);
			return true;
		default:
			System.out.println("Comando no reconocido.");
			return false;
		}
		// en caso de que la ejecucion del comando sea incorrecta, devuelve false
		
		
		}
}
