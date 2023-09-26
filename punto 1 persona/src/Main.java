import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Persona p1= new Persona("Lugel", 27, "123456789");
        System.out.println(p1.mostrar());
        System.out.println(p1.mayorDeEdad());
        Persona p2= new Persona();
        p2.setIdentificacion("345678");
        p2.setNombre("Carlos");
        p2.setEdad(21);
        System.out.println(p2.mostrar());
        System.out.println(p2.mayorDeEdad());
        Persona p3= new Persona();
    }

}