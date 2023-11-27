package registropersona;

public class Persona {
    //Atributos
    private static int contador = 0; //Se crea variable estatica que funciona como contador, cada vez que se registra una persona, el contador suma 1
    private int id;
    private final String nombre;
    private final String apellido;
    private final String DNI;
    private final String fechaNacimiento;

    //Constructor
    public Persona(String nombre, String apellido, String DNI, String fechaNacimiento) { //Constructor con parámetros
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Método toString para mostrar la información del objeto
    @Override
    public String toString() {
        return "Persona: " + id + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + DNI + "\nFecha de nacimiento: " + fechaNacimiento + "\n-------------\n";
    }
}
