package proyecto3eva;

import java.util.Scanner;

public class Command {
	
	private ENUM_COMMAND command;
	private ByteCode instruction;
	private int replace;
	
    public Command(ENUM_COMMAND command, ByteCode instruction, int replace) {
        this.command = command;
        this.instruction = instruction;
        this.replace = replace;
    }

	public boolean execute(Engine engine) {
		
		Scanner sc = new Scanner(System.in);
		String option;
		option = sc.next();
		switch (option) {
		case "HELP":
			help();
			break;
		case "QUIT":
			quit();
			break;
		case "RUN":
			run();
			break;
		case "NEWINST":
			newinst();
			break;
		case "RESET":
			reset();
			break;
		case "REPLACE":
			replace();
			break;
		default:
			System.out.println("Comando no reconocido");
			break;
		}
		//en caso de que la ejecucion del comando sea incorrecta, devuelve false
		return false;
		
	}
	public static void help() {
		System.out.println("HELP: Te muestra los comandos\nQUIT: Se sale del programa\nRUN: Inicia el programa");
		System.out.println("NEWINST BYTECODE: Introduce una nueva instrucción al programa\nRESET: Resetea el programa");
		System.out.println("REPLACE N: Reemplaza la instrucción N");
	}

	public static void quit() {
		System.out.println("Saliendo del programa...");

	}

	public static void run() {
		System.out.println("Iniciando el programa...");
			
		
	}

	public static void newinst() {

	}

	public static void reset() {
		
	}

	public static void replace() {

	}
	

}
