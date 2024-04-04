package proyecto3eva;

public class Memory {
	
	
	
	private final int MAX_Memory = 10;
	private Integer memory[];
	private int size;
	
	public Memory() {
		this.memory =  new Integer [MAX_Memory];
	}
	
	
	
	
	//recibe posicion y valor
	public boolean write(int pos, int valor){
		this.memory[pos] = valor;
		
		return true;
		
	}
	
	//recibe posicion del array
	public void Read(int pos) {
		System.out.println(this.memory[pos]);
		//return this.memory[pos];
		
	}
	
	//aumenta tamaño del array
	public void resize() {
		
	}
	
}
