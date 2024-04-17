package proyecto3eva;

public class CommandParser {
	
	public static Command parse(String line) {
		
		
		
		//si line es distinto a algun comando, devuelve null
		String[] parts = line.split(" ");
		
		if(parts.length == 0) {
			return null;
		}else if(parts.length == 1) {
			switch(line) {
			case "HELP":
			case "QUIT":
			case "RUN":
			case "RESET":
				return new Command(ENUM_COMMAND.valueOf(line));
			}
			}else if(parts.length == 2) {
				switch(parts[0]) {
				case "NEWINST":
					return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(parts[1]));
				case "REPLACE":
					return new Command(ENUM_COMMAND.REPLACE, Integer.parseInt(parts[1]));
				}
		}
		return null;
		
		
		
		
		/*String option = line.toUpperCase();		
		if(!option.equals("HELP") && !option.equals("QUIT") && !option.equals("NEWINST") && !option.equals("RUN") && !option.equals("REPLACE") && !option.equals("RESET")) {
			
		return null;
			
		}else {
		return new Command(null, null, -1);
		}*/
	}

}
