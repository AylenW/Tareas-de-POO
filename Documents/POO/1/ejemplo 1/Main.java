public class Main{ //se define la clase main
//public significa que puede ser accedida desde otros archivos
/* en java toda apl
con main() para ejecutarse
*/
	public static void main(String[] args){
	/*punto de entrada en java
	public hace que el metodo sea accesible desde cualquier parte del progrma
	static permite ejecutar main() sin necesidad de crear un objeto de la clase Main
	String[] args es un array de argumentos*/
		Auto miAuto = new Auto("Toyota", "Rojo");
		/*declara una variable miAuto del tipo Auto
		usa new Auto("Toyota", "Rojo") para crear un nuevo objeto de la clase Auto
		Llama al constructor de Auto, pasandole "Toyota" y "Rojo"*/
		System.out.println("Marca: " + miAuto.marca);
		System.out.println("Color: " + miAuto.color);
		
		miAuto.acelerar();
	}
}