package proyecto3eva;



public class Command {
	
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;
	
    public Command(ENUM_COMMAND command) {
        this.command = command;
    }
    public Command(ENUM_COMMAND command, ByteCode instruction) {
        this.command = command;
        this.instruction = instruction;
    }
    public Command(ENUM_COMMAND command, int replace) {
        this.command = command;
        this.replace = replace;
    }
    
    public Command(ENUM_COMMAND command, ByteCode instruction, int replace) {
        this.command = command;
        this.instruction = instruction;
        this.replace = replace;
    }
    
    public ENUM_COMMAND getCommand() {
        return command;
    }	

    public ByteCode getInstruction() {
        return instruction;
    }

    public int getReplace() {
        return replace;
    }
    
    
    
	public static boolean execute(String engine) {

		
		String[] parts = engine.trim().split(" ");
		
		Engine engine1 = new Engine();
		
		switch (parts[0]) {
		case "HELP":
			engine1.help();
			break;
		case "QUIT":
			engine1.quit();
			engine1.setEnd();
			break;
		case "RUN":
			engine1.run();
			break;
		case "NEWINST":
			engine1.newinst();
			break;
		case "RESET":
			engine1.reset();
			break;
		case "REPLACE":
			engine1.replace();
			break;
		default:
			System.out.println("Comando no reconocido.");
			return false;
		}
		// en caso de que la ejecucion del comando sea incorrecta, devuelve false
		
	
		return true;}

	/*public static boolean execute(String engine) {
		
		Engine engine1 = new Engine();
		switch (engine) {
		case "HELP":
			engine1.help();
			break;
		case "QUIT":
			 engine1.quit();
             engine1.setEnd();
			break;
		case "RUN":
			engine1.run();
			break;
		case "NEWINST":
			engine1.newinst();
			break;
		case "RESET":
			engine1.reset();
			break;
		case "REPLACE":
			engine1.replace();
			break;
		default:
			System.out.println("Comando no reconocido.");
			return false;
		}
		//en caso de que la ejecucion del comando sea incorrecta, devuelve false
		return true;
		
		
	}*/
	

	

}
