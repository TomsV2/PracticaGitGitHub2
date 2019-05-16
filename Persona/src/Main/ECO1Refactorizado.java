/*
//PG
	//Inicio
		//cargarArrayPersonas
		//categoriaPeso
		//esMayorEdad
		//mostrarInfoPersonas
	//Fin
*/

package Main;

import java.util.Scanner;
import Clase.Persona;

public class ECO1Refactorizado {
	
	public static Persona[] cargarArrayPersonas(){
		
		//Declaracion de variables
		Persona[] arrayPersonas = new Persona[3];
		
		String nombre = new String();
		String apellidos = new String();
		
		int edad = 0;
		
		double peso = 0;
		double altura = 0;
		
		char sexo = ' ';
		
		//Inicialiazaciones
		Scanner tecladoS = new Scanner(System.in);
		Scanner tecladoN = new Scanner(System.in);
		
		//Para contador == 1, mientras sea menor o igual que 3, aumenta contador
		for(int i=0; i<=2; i++) {
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("|       Lectura de la persona numero  " +(i+1) +"       |");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			//Leer nombre
			System.out.print("\tIntroduzca su nombre: ");
			nombre = tecladoS.nextLine();
			
			//Leer apellidos
			System.out.print("\tIntroduzca sus apellidos: ");
			apellidos = tecladoS.nextLine();
			
			Persona personaI = new Persona(nombre,apellidos);
			
			//Leer edad
			System.out.print("\tIntroduzca su edad: ");
			personaI.setEdad(tecladoN.nextInt());
			
			//Leer y validar sexo
			System.out.print("\tIntroduzca 'H' para hombre o 'M' para mujer\n\t(se asignará por defecto 'H' si el caracter no es correcto): ");
			personaI.setSexo(Character.toUpperCase(tecladoN.next().charAt(0)));
			System.out.print("\t"); personaI.comprobarSexo();
			
			//Leer peso
			System.out.print("\tIntroduzca su peso en kg: ");
			personaI.setPeso(tecladoN.nextDouble());
			
			//Leer altura
			System.out.print("\tIntroduzca su altura en m: ");
			personaI.setAltura(tecladoN.nextDouble());
			
			arrayPersonas[i] = personaI;
			
			System.out.println();
			
		}//Fin_Para
		
		return arrayPersonas;
	}
	
	public static void categoriaPeso(Persona arrayPersonas[]){
		for(Persona persona:arrayPersonas){
			if(persona.calcularIMC() == 0){
				System.out.println(persona.getNombre() +" " +persona.getApellidos() +" estás en tu peso ideal");
			}
			else{
				if(persona.calcularIMC() == -1){
					System.out.println(persona.getNombre() +" " +persona.getApellidos() +" estás por debajo de tu peso ideal");
				}
				else{
					System.out.println(persona.getNombre() +" " +persona.getApellidos() +" estás por encima de tu peso ideal");
				}
			}
			
		}
	}
	
	public static void esMayorEdad(Persona arrayPersonas[]){
		for(Persona persona:arrayPersonas){
			if(persona.esMayorDeEdad() == true){
				System.out.println(persona.getNombre() +" " +persona.getApellidos() +" es mayor de edad.");
			}
			else{
				System.out.println(persona.getNombre() +" " +persona.getApellidos() +" NO es mayor de edad.");
			}
		}
	}
	
	public static void mostrarInfoPersonas(Persona arrayPersonas[]){
		for(Persona persona:arrayPersonas){
			System.out.println();
			
			System.out.print(persona.toString());
		}
	}
	
	public static void main(String[] args){
		
		//Declaración de variables
		Persona[] arrayPersonas;
		
		//Inicializaciones
		
		//Inicio
			//cargarArrayPersonas
			arrayPersonas = cargarArrayPersonas();
			
			//categoriaPeso
			categoriaPeso(arrayPersonas);
			
			System.out.println();
			
			//esMayorEdad
			esMayorEdad(arrayPersonas);
			
			//mostrarInfoPersonas
			mostrarInfoPersonas(arrayPersonas);
		
		//Fin
	}
}
