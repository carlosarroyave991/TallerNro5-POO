package Sueldos;
import java.util.Scanner;


public class Operarios {
	
	private Scanner teclado;
	private int[] sueldos;
	
	//constructor
	public Operarios() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		for(int f=0;f<5;f++) {
			System.out.println("Ingrese valor de la componente: ");
			sueldos[f]=teclado.nextInt();
			
			}
	}
	
	//metodos
	public void imprimir() {
		for(int i=0;i<5;i++) {
			System.out.println(sueldos[i]);
		}
	}

	public static void main(String[] args) {
		//instanciar la clase
		Operarios op = new Operarios();
		//imprimir los valores
		op.imprimir();
	}

}
