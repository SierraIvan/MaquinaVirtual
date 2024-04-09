package proyecto3eva;

public class CommandParser {
	
	public static Command parse(String line) {
		
		
		
		//si line es distinto a algun comando, devuelve null
		
		String option = line.toUpperCase();		
		if(!option.equals("HELP") && !option.equals("QUIT") && !option.equals("NEWINST") && !option.equals("RUN") && !option.equals("REPLACE") && !option.equals("RESET")) {
			
		return null;
			
		}else if(option.equals("QUIT")) {
			System.out.println("Finalizando programa...");
			return null;
		}
		
		ENUM_COMMAND ENUM_COMMAND = null;
		return new Command(ENUM_COMMAND, null, -1);
		
	}

}
