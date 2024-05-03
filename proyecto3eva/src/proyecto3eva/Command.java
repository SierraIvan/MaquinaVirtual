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
    
    

    
    
	public static boolean execute(String engine) {

		
		String[] parts = engine.trim().split(" ");
		
		Engine engine1 = new Engine();
		
		switch (parts[0]) {
		case "HELP":
			engine1.help();
			return true;
		case "QUIT":
			engine1.setEnd();
			engine1.quit();
			return true;
		case "RUN":
			engine1.run();
			return true;
		case "NEWINST":
			/*manda un objeto tipo ByteCode*/
			String temp = parts[1] + " " + parts[2];
			ByteCode bytecode = ByteCodeParser.parse(temp);
			engine1.newinst(bytecode);
			return true;
		case "RESET":
			engine1.reset();
			return true;
		case "REPLACE":
			/*manda al metodo replace el numero*/
			/*hay que pasar de String a int para pasarselo a replace*/
			int numEntero = Integer.parseInt(parts[0]);
			engine1.replace(numEntero);
			return true;
		default:
			System.out.println("Comando no reconocido.");
			return false;
		}
		// en caso de que la ejecucion del comando sea incorrecta, devuelve false
		
		
		}
}
