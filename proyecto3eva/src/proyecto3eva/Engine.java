package proyecto3eva;

import java.util.Scanner;

class Engine {
    private ByteCodeProgram program;
    private boolean end;

    public Engine() {
        this.program = new ByteCodeProgram();
        this.end = false;
    }
        

	public void start() {
		System.out.println("El programa se ha iniciado");
		Scanner sc = new Scanner(System.in);
		String option;
		do {
		System.out.print("> ");
		option = sc.next();
		switch (option.toUpperCase()) {
		case "HELP":
			Command.help();
			break;
		case "QUIT":
			Command.quit();
			break;
		case "RUN":
			Command.run();
			break;
		case "NEWINST":
			Command.newinst();
			break;
		case "RESET":
			Command.reset();
			break;
		case "REPLACE":
			Command.replace();
			break;
		default:
			System.out.println("Comando no reconocido");
			break;
		}
		
		
		//sc.close();
	}while (!option.equals("QUIT") && !option.equals("quit") && !option.equals("Quit"));
	}
	

    
}