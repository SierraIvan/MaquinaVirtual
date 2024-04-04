package proyecto3eva;

import java.util.Scanner;

public class Engine {

	public void start() {
		System.out.println("El programa se ha iniciado");
		Scanner sc = new Scanner(System.in);
		String option;
		do {
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
		//sc.close();
	}while (!option.equals("QUIT"));
	}

	public void help() {
		System.out.println("HELP: Te muestra los comandos\nQUIT: Se sale del programa\nRUN: Inicia el programa");
		System.out.println("NEWINST BYTECODE: Introduce una nueva instrucción al programa\nRESET: Resetea el programa");
		System.out.println("REPLACE N: Reemplaza la instrucción N");
	}

	public void quit() {
		System.out.println("Saliendo del programa...");

	}

	public void run() {
		System.out.println("Iniciando el programa...");
	}

	public void newinst() {

	}

	public void reset() {
		
	}

	public void replace() {

	}
}
