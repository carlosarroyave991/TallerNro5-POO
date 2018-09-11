package Alumno;
import java.util.Scanner;


public class Alumno {

	private Scanner sc;
	String nombre;
	int edad;
	
	public void TomarNombre() {
		sc = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre = sc.nextLine();
		}
	public void TomarEdad() {
		sc=new Scanner(System.in);
		System.out.println("Ingrese la edad: ");
		edad = sc.nextInt();
	}
	
	public void imprimir() {
		System.out.println("El nombre del alumno es: "+nombre);
		
	}
	
	public void MayorEdad() {
		if(edad <18) {
			System.out.println("El estudiante tiene "+edad+" entonces es mayor de edad");
		}else {
			System.out.println("El estudiante tiene "+edad+" entonces es menor de edad");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TomarNombre tm = new TomarNombre();
		TomarEdad te = new TomarEdad();
		 tm.imprimir();
		 te.MayorEdad();
	}

}
