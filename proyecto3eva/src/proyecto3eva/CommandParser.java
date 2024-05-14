package proyecto3eva;
/**
 * Maquina virtual, proyecto tercera evaluacion
 * 
 * @author Sierr
 */

public class CommandParser {

	/**
	 * metodo para identificar que comando es
	 * @param line
	 * @return
	 */
	public static Command parse(String line) {
	        String[] parts = line.split(" ");
	        ENUM_COMMAND commandEnum;	
	        ByteCode instruction; 
	  
	        if (parts.length == 1) {
	        	switch (parts[0]) {
	            case "HELP":
	            	return new Command(ENUM_COMMAND.HELP);
	            case "QUIT":
	            	return new Command(ENUM_COMMAND.QUIT);
	            case "RUN":
	            	return new Command(ENUM_COMMAND.RUN);
	            case "RESET":
	            	return new Command(ENUM_COMMAND.RESET);
	            default:
	            	return null;
	        	}
	        }else if(parts.length == 2) {
	        	
	        	switch (parts[0]) {
	            case "NEWINST":
	            	instruction = ByteCodeParser.parse(parts[1]);
	            	if(instruction == null) {
	            		return null;
	            	}
	            	return new Command(ENUM_COMMAND.NEWINST, instruction);
	            case "REPLACE":
	            	int replace = Integer.parseInt(parts[1]);
	                return new Command(ENUM_COMMAND.REPLACE, replace);
	            default:
	            	return null;
	        	}
	        }else if(parts.length == 3) {
	        	switch (parts[0]) {
	            case "NEWINST":
	            	String temp = parts[1] + " " + parts[2];
	        		instruction = ByteCodeParser.parse(temp);
	            	return new Command(ENUM_COMMAND.NEWINST, instruction);
	            default:
	            	return null;
	            
	        	}
	            	
	        }
	        commandEnum = ENUM_COMMAND.valueOf(parts[0].toUpperCase());
	        return new Command(commandEnum);
	        
	}
}

