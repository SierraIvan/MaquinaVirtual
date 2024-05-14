package proyecto3eva;

/**
 * Maquina virtual, proyecto tercera evaluacion
 * 
 * @author Sierr
 */

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

	/**
	 * metodo que ejecuta la maquina
	 */
	public void start() {
		// System.out.println("El programa se ha iniciado");

		String option;
		do {
			System.out.print("> ");

			option = sc.nextLine().toUpperCase();

			Command command = CommandParser.parse(option);
			if (command == null) {

			}
			System.out.println("Comienza la ejecucion de " + option);

			if (command == null) {
				System.out.println("ERROR, el comando " + option + " no es valido");

			} else {
				// Pasamos 'this' como argumento para que Command pueda ejecutar el comando en
				// el contexto de 'this' (Engine)
				command.execute(this);
				System.out.println("Programa almacenado: ");
				System.out.println(program.toString());
			}
		} while (!option.equals("QUIT"));
	}

	/**
	 * metodo para terminar la maquina
	 */
	public void setEnd() {
		this.end = true;
	}

	/**
	 * metodo que muestra los comandos que hay
	 */
	public void help() {
		System.out.println(" HELP: Te muestra los comandos\n QUIT: Se sale del programa\n RUN: Inicia el programa");
		System.out
				.println(" NEWINST BYTECODE: Introduce una nueva instrucción al programa\n RESET: Resetea el programa");
		System.out.println(" REPLACE N: Reemplaza la instrucción N");
	}

	/**
	 * metodo para finalizar la maquina
	 */
	public void quit() {
		setEnd();

	}

	/**
	 * metodo para recorrer la maquina
	 */
	public void run() {

		program.runProgram(cpu);

	}

	/**
	 * metodo para enviar un bytecode
	 * 
	 * @param BC
	 */
	public void newinst(ByteCode BC) {

		/* crea una instruccion (push 3) que la añade al ByteCodeProgram */
		// System.out.println(BC.getbytecode() + " " + BC.getparam());
		this.program.setInstruction(BC);

	}

	/**
	 * metodo para resetear la maquina
	 */
	public void reset() {
		System.out.println("pila reseteada");

		this.program.reset();

	}

	/**
	 * metodo para remplazar una instruccion de la maquina
	 * 
	 * @param Num
	 */
	public void replace(Integer Num) {

		// System.out.println(Num);
		System.out.println("Nueva instruccion");
		String optionreplace = sc.nextLine().toUpperCase();
		ByteCode command = ByteCodeParser.parse(optionreplace);
		// System.out.println(command.getbytecode());
		this.program.replacebytecode(command, Num);

	}

}
