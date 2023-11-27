package registropersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre, apellido, DNI, fechaNacimiento;

        //Definimos el ArrayList para almacener los objetos de tipo Persona
        List<Persona> listaPersonas = new ArrayList<>();

        System.out.println("REGISTRO DE PERSONAS");
        Scanner sc = new Scanner(System.in);
        int opc;

        //Menú principal
        do {
            System.out.println("\n\t--MENU--");
            System.out.println("1. Registrar Persona\n2. Lista de Personas\n0. Salir");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1: //Opción para registrar a la persona
                    System.out.println("\n-----Registrar Persona-----\n");
                    System.out.println("REGISTRO DE PERSONA");
                    System.out.println("Ingrese sus datos por favor: ");
                    
                    //Se piden los datos y se hace la validación correspondiente para cada campo
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    while (nombre.equals("")) {
                        System.out.println("El nombre no puede estar en blanco");
                        nombre = sc.nextLine();
                    }

                    System.out.print("Apellido: ");
                    apellido = sc.nextLine();
                    while (apellido.equals("")) {
                        System.out.println("El apellido no puede estar en blanco");
                        apellido = sc.nextLine();
                    }

                    System.out.print("DNI (sin puntos): ");
                    DNI = sc.nextLine();
                    while (DNI.length() != 8) {
                        System.out.println("Ingrese un DNI valido");
                        DNI = sc.nextLine();
                    }

                    System.out.print("Fecha de nacimiento (dd/mm/yyyy): ");
                    fechaNacimiento = sc.nextLine();
                    while (!fechaNacimiento.matches("^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/(\\d{4})$")) {
                        System.out.println("Fecha incorrecta. Ingrese nuevamente");
                        fechaNacimiento = sc.nextLine();
                    }
                    
                    //Se crea un objeto de tipo Persona
                    Persona nuevaPersona = new Persona(nombre, apellido, DNI, fechaNacimiento);

                    listaPersonas.add(nuevaPersona); //Guarda al objeto en el ArrayList
                    System.out.println("\n***** Registro exitoso! *****");
                    break;
                    
                case 2://Opción para mostrar la lista de persona registradas
                    System.out.println("\nLista de Personas Registradas\n");
                    if (listaPersonas.isEmpty()) { //Verifica si el ArrayList está vacío o no
                        System.out.println("Aun no se han registrado personas");
                    } else {
                        for (Persona personas : listaPersonas) {
                            System.out.println(personas); //Si no esta vacío, muestra el objeto
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("\nGracias por usar la aplicacion!\nDesarrollador: Nicolas Nunez");
                    break;
                    
                default:
                    System.out.println("Opcion invalida. Ingrese nuevamente");
            }
        } while (opc != 0);
    }
}
