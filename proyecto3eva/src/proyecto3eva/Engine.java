package proyecto3eva;

import java.util.Scanner;

class Engine {
    private ByteCodeProgram program;
    boolean end;

    public Engine() {
        this.program = new ByteCodeProgram();
        this.end = false;
    }
        

	public void start() {
		//System.out.println("El programa se ha iniciado");
		Scanner sc = new Scanner(System.in);
		String option;
		do {
		System.out.print("> ");
		
			
		
		option = sc.next().toUpperCase();
		//String line = sc.nextLine();
		Command command = CommandParser.parse(option);
		if(command == null) {
			System.out.println("comando incorrec");
		}else {
		//if(CommandParser.parse(option) == null) {
		
			Command.execute(option);

		
		}
	}while (!option.equals("QUIT"));
	}
	
    
    public void setEnd() {
       this.end = true;
    }
    
	public void help() {
		System.out.println("HELP: Te muestra los comandos\nQUIT: Se sale del programa\nRUN: Inicia el programa");
		System.out.println("NEWINST BYTECODE: Introduce una nueva instrucción al programa\nRESET: Resetea el programa");
		System.out.println("REPLACE N: Reemplaza la instrucción N");
	}

	public void quit() {
		setEnd();
		System.out.println("Saliendo del programa...");

	}

	public  void run() {
		System.out.println("Iniciando el programa...");
			
	}

	public void newinst() {
		
	}

	public void reset() {
		System.out.println("pila reseteada");
		
	}

	public void replace() {
		
	}
	

    
}
