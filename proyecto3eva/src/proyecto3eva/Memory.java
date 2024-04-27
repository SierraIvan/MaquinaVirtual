package proyecto3eva;

public class Memory {
	
	
	
	private final int MAX_Memory = 10;
	private Integer memory[];
	private int size;
	private boolean empty;
	
	public Memory() {
		this.memory =  new Integer [MAX_Memory];
		
	}
	
	
	
	
	//recibe posicion y valor
	public boolean write(int pos, int valor){
		if(pos >=0) {
			this.resize(pos);
		this.memory[pos] = valor;
		return true;
		}else {
			return false;
		}
		
	}
	
	//recibe posicion del array
	public Integer Read(int pos) {
		//System.out.println(this.memory[pos]);
		if(this.memory[pos] == null) {
			return -1;
		}else {
		return this.memory[pos];
		}
	}
	
	//aumenta tamaño del array
	//haces un array nuevo con el doble del anterior
	//en la mitad del nuevo array se meten los elementos que habia en el array de antes y en la segunda mitad se inicializan todas las posiciones a null
	//luego el nuevo array pasa a ser el atributo
	//this.memory = new_array
	//solamente se ejecuta cuando la posicion en la que quiero escribir esta fuera del array.lenght
	//deberia recibir pos
	private void resize(int pos) {
		empty = false;
		if(pos >= this.size) {
			pos = pos * 2;
		Integer array2[] = new Integer[pos];
		for(int i = 0; i < array2.length;i++) {
			if(i <= array2.length/2) {
				array2[i] = memory[i];
			}else {
				array2[i] = null;
			}
		}
		this.memory = array2;
		}
	}

}
