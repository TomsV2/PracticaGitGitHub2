/*	Nombre: Persona
 *
 * 	Básicas:
 * 		- nombre    => String => Consultable y Modificable
 * 		- apellidos => String => Consultable y Modificable
 * 	    - edad      => int    => Consultable y Modificable
 * 	    - sexo      => char   => Consultable y Modificable
 * 	    - peso      => double => Consultable y Modificable
 * 	    - altura    => double => Consultable y Modificable
 *
 * 	Derivadas:
 * 		No tiene
 *
 * 	Compartidas:
 * 		No hay
 *
 * 	Restricciones:
 * 		No tiene
 *
 * 	Métodos añadidos:
 * 		- calcularIMC		(peso/(altura^2)	peso ---> Kg	altura ---> m
 * 		- esMayorDeEdad
 * 		- comprobarSexo
 */

package Clase;

public class Persona {
	
	//Atributos
	private String nombre = new String();
	private String apellidos = new String();
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	
	//Constructor por defecto
	public Persona(){
		nombre = "NombrePorDefecto";
		apellidos = "ApellidosPorDefecto";
		edad = 0;
		sexo = 'H';
		peso = 0;
		altura = 0;
	}
	
	//Constructor con parámetros (solo nombre y apellidos)
	public Persona(String nombre, String apellidos){
		this.nombre = nombre;
		this.apellidos = apellidos;
		edad = 0;
		sexo = 'H';
		peso = 0;
		altura = 0;
	}
        
        public Persona(String nombre, String apellidos, int edad, double peso, double altura){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		sexo = 'H';
		this.peso = peso;
		this.altura = altura;
	}
	
	//Gets
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	//Sets
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Métodos sobrecargados
	@Override
	public String toString(){
		String s = "Nombre y apellidos: " +getNombre() +" " +getApellidos() +"\n"
				+"Edad: " +getEdad() +"\n"
				+"Sexo: " +getSexo() +"\n"
				+"Peso: " +getPeso() +"\n"
				+"Altura: " +getAltura() +"\n";
		return s;
	}
	
	//Métodos añadidos
	public int calcularIMC(){
		
		int devuelto = 0;
		int resultadoIMC = 0;
		
		resultadoIMC = (int)(getPeso()/(getAltura()*getAltura()));
		
		if(resultadoIMC<20){
			devuelto = -1;
		}
		else{
			if(resultadoIMC>25){
				devuelto = 1;
			}
			else{
				devuelto = 0;
			}
		}
		
		return devuelto;
	}
	
	public boolean esMayorDeEdad(){
		
		boolean mayorDeEdad = false;
		
		if(getEdad() >= 18){
			mayorDeEdad = true;
		}
		
		return mayorDeEdad;
	}
	
	public void comprobarSexo(){
		
		if(Character.toUpperCase(getSexo()) != 'H' && Character.toUpperCase(getSexo()) != 'M'){
		
			setSexo('H');
			System.out.println("La letra era incorrecta y se ha actualizado por defecto.");
			
		}
		else{
			System.out.println("La letra es correcta.");
		}
		
	}
	
}
