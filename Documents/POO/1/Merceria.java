import java.util.Scanner;
public class Merceria{
public static void main(String [] args){
		//int cantidadPaquetes;
		double diferencia, descuento, totalDesc;
		Scanner numero= new Scanner(System.in);
		System.out.println("Ingrese la cantidad de paquetes: ");
		int cantidadPaquetes= numero.nextInt();
		
		if (cantidadPaquetes > 5){
			System.out.println("Ingrese el monto total: ");
			numero= new Scanner(System.in);
			double montoTotal= numero.nextDouble();
			System.out.println(montoTotal);
			//envio
			if (cantidadPaquetes >= 5 && cantidadPaquetes <= 15){
				System.out.println("El envio es de 10 USD");
				montoTotal= montoTotal + 10;
			}else {System.out.println("El envio es gratis");}
			
			//descuentos
			if (montoTotal < 100){
				diferencia= 100 - montoTotal;
				System.out.println("El monto total es de " + montoTotal + " USD");
				System.out.println("No posee promociones, le falta " + diferencia + " USD para poder acceder a una promoción");
			}else {
				if (montoTotal > 100 && montoTotal < 300){
					descuento= montoTotal * 0.05;
					totalDesc= montoTotal - descuento;
					System.out.println("Posee un descuento del 5%. El monto total con el descuento aplicado es: " + totalDesc);
				}else{
					descuento= montoTotal * 0.1;
					totalDesc= montoTotal - descuento;
					System.out.println("Posee un descuento del 10%. El monto total con el descuento aplicado es: " + totalDesc);
				}
					
			}
		
			
		}else {
			System.out.println("No se puede vender menos de 5 paquetes");
		}
 }
}