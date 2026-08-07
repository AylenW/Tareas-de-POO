//una clase es como una plantilla para crear objetos
//Un objeto es una instancia de una clase (en el ejemplo, un auto especifico)


//definicion de la clase auto
 
 
 //atributos (caracteristicas)
 class Auto{
	String marca;
	String color;
	int velocidad;
	
//Método (acción) para acelerar

	void acelerar(){
		velocidad +=10;
		System.out.println("El auto aceleró. Velocidad: " + velocidad + "km/h");
	}
//Método (accion) para frenar
	void frenar(){
		velocidad -=10;
		System.out.println("El auto frenó. Velocidad: " + velocidad + "km/h");
	} 
}