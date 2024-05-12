package proyecto3eva;

import java.util.Scanner;

	class Engine {
	    ByteCodeProgram program;
	    CPU cpu;
	    boolean end;
	    Scanner sc;
	    
	
	    public Engine() {
	    	this.program = new ByteCodeProgram();
	        this.cpu = new CPU();
	        this.end = false;
	        this.sc = new Scanner(System.in);
	    }
	        
	
		public void start() {
			//System.out.println("El programa se ha iniciado");
			
			String option;
		    do {
		        System.out.print("> ");
		        
		        option = sc.nextLine().toUpperCase();
		        
		        
		        Command command = CommandParser.parse(option);
		        if(command == null) {
		        	
		        }
		        System.out.println("Comienza la ejecucion de " + option);
		        
		        
		        if (command == null) {
		            System.out.println("ERROR, el comando " + option + " no es valido");
		            
		        } else {
		            // Pasamos 'this' como argumento para que Command pueda ejecutar el comando en el contexto de 'this' (Engine)
		            command.execute(this);
		            System.out.println("Programa almacenado: ");
		            System.out.println(program.toString());
		        }
		    } while (!option.equals("QUIT"));
		}
		
	    
	    public void setEnd() {
	       this.end = true;
	    }
	    
		public void help() {
			System.out.println(" HELP: Te muestra los comandos\n QUIT: Se sale del programa\n RUN: Inicia el programa");
			System.out.println(" NEWINST BYTECODE: Introduce una nueva instrucción al programa\n RESET: Resetea el programa");
			System.out.println(" REPLACE N: Reemplaza la instrucción N");
		}
	
		public void quit() {
			setEnd();
	
		}
	
		public void run() {

			
			program.runProgram(cpu);
			
			
			
				
		}
	
		public void newinst(ByteCode BC) {
		
			/*crea una instruccion (push 3) que la añade al ByteCodeProgram*/
			//System.out.println(BC.getbytecode() + " " + BC.getparam());
			this.program.setInstruction(BC);
			
			
		}
	
		public void reset() {
			System.out.println("pila reseteada");
		
			this.program.reset();
			
		}
	
		public void replace(Integer Num) {
			
			System.out.println(Num);
			System.out.println("Nueva instruccion");
			String optionreplace = sc.nextLine().toUpperCase();
			ByteCode command = ByteCodeParser.parse(optionreplace);
			System.out.println(command.getbytecode());
			this.program.replacebytecode(command, Num);
			
			
			
		}
	

    
}
