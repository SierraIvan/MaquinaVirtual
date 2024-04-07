package proyecto3eva;

public class CommandParser {
	
	public static Command parse(String line) {
		
		
		
		//si line es distinto a algun comando, devuelve null
		
		String option = line.toUpperCase();		
		if(option != "HELP" && option != "RUN" && option != "NEWINST" && option != "RESET" && option != "REPACE") {
			return null;
		}
		return null;
		
		
	}

}
