package proyecto3eva;

public class CommandParser {
	
	public static Command parse(String line) {
		
		
		
		//si line es distinto a algun comando, devuelve null
		
		String option = line.toUpperCase();		
		if(option != "HELP" && option != "RUN" && option != "NEWINST" && option != "RESET" && option != "REPACE") {
			
			return null;
			
		}
		ENUM_COMMAND ENUM_COMMAND = null;
		return new Command(ENUM_COMMAND, null, -1);
		
	}

}
