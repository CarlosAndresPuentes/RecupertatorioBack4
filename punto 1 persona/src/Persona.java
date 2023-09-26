public class Persona {
    private String nombre;
    private int edad;
    private String identificacion;

    public Persona(){
        this.nombre="Julio Cesar";
        this.edad=0;
        this.identificacion="";
    }
    public Persona(String nombre, int edad, String identificacion){
        this.nombre=nombre;
        this.edad=edad;
        this.identificacion=identificacion;
    }

    public String mostrar(){
        return "Nombre: " + this.nombre + " Edad: " + this.edad + " Id: " + this.identificacion + " mayor de edad: " + mayorDeEdad();

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public boolean mayorDeEdad(){
        if (edad>=18){
            System.out.println("es mayor de edad");
            return true;

        }else {
            System.out.println("es menor de edad");
            return false;
        }
    }

}
