package proyecto3eva;

public class CommandParser {

	public static Command parse(String line) {
	        String[] parts = line.trim().split("\\s+");
	        ENUM_COMMAND commandEnum;
	        commandEnum = ENUM_COMMAND.valueOf(parts[0].toUpperCase());
	        if (parts.length == 1) {
	        	switch (commandEnum) {
	            case HELP:
	            	return new Command(commandEnum.HELP);
	            case QUIT:
	            	return new Command(commandEnum.QUIT);
	            case RUN:
	            	return new Command(commandEnum.RUN);
	            case RESET:
	            	return new Command(commandEnum.RESET);
	        	}
	        }else if(parts.length == 2) {
	        	
	        	switch (commandEnum) {
	            case NEWINST:
	            	ByteCode instruction = ByteCodeParser.parse(parts[1]);
	            	return new Command(commandEnum.NEWINST, instruction);
	            case REPLACE:
	            	int replace = Integer.parseInt(parts[1]);
	                return new Command(commandEnum.RESET, replace);
	        	}
	        }else if(parts.length == 3) {	
	        		ByteCode instruction = ByteCodeParser.parse(parts[1]);
					int replace = Integer.parseInt(parts[2]);
	            	return new Command(commandEnum.NEWINST, instruction, replace);
	        	
	           
	        
	        }
	        throw new IllegalArgumentException("Comando no válido: " + line);
	        
	       
	        /*try {
	            commandEnum = ENUM_COMMAND.valueOf(parts[0].toUpperCase());
	        } catch (IllegalArgumentException e) {
	            System.out.println("Comando no reconocido.");
	            return null;
	        }*/

	
	
	
	
	
	
	
	
	/*public static Command parse(String line) {
		
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
		}else if(parts.length == 3) {
			return new Command(ENUM_COMMAND.NEWINST, ByteCodeParser.parse(parts[1]), Integer.parseInt(parts[1]));
		}
		return null;

	}*/

	}
}

/*
 * String option = line.toUpperCase(); if(!option.equals("HELP") &&
 * !option.equals("QUIT") && !option.equals("NEWINST") && !option.equals("RUN")
 * && !option.equals("REPLACE") && !option.equals("RESET")) {
 * 
 * return null;
 * 
 * }else { return new Command(null, null, -1); }
 */