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
	//haces un array nuevo con el doble del anterior
	//en la mitad del nuevo array se meten los elementos que habia en el array de antes y en la segunda mitad se inicializan todas las posiciones a null
	//luego el nuevo array pasa a ser el atributo
	//this.memory = new_array
	//solamente se ejecuta cuando la posicion en la que quiero escribir esta fuera del array.lenght
	//deberia recibir pos
	public void resize() {
		Integer new_array[] = new Integer[memory.length * 2];
		for(int i = 0; i < new_array.length;i++) {
			if(i<= new_array.length/2) {
				new_array[i] = memory[i];
			}else {
				new_array[i] = null;
			}
		}
		this.memory = new_array;

	}

}
