package biblioteca;

public class Planta {
	public String nombre; //Nombre de la planta
	public int capacidad; //Capacidad de libros de la planta
	public boolean estado; //Si está abierta o cerrada la planta
	
	public Planta(String nombre, int capacidad, boolean estado) {
//Constructor para crear un objeto por cada planta de la biblioteca, al crearla
// se le asignan los atributos de este
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.estado = estado;
	}
	public Planta() {
		
	}
	
// MÉTODOS //
	
	public String listarLibro() {
//Para mostrar los libros que están en esa planta
		return "0";
	}
	
}
