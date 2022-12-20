public class Main {
    public static void main(String[] args) {
        Personas persona = new Personas();
        persona.setEdad(20);
        System.out.println("Edad");
        System.out.println(persona.getEdad());

        persona.setNombre("Anthony");
        System.out.println("Nmbre");
        System.out.println(persona.getNombre());

        persona.setTelefono(89672738);
        System.out.println("Telefono");
        System.out.println(persona.getTelefono());

    }

}
class Personas {
    private  int edad;
    private String nombre;
    private int telefono;

    //Constructor con las variables pasadas por parametros
    public void Personas (int edad, String nombre, int telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono= telefono;
    }

    //Funcion set para la variables Edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Funcion get para la variables Edad
    public int getEdad() {
        return edad;
    }

    //Funcion set para la variables nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//
//    //Funcion get para la variables nombre
    public String getNombre() {
        return nombre;
    }
//
//    //Funcion set para la variables telefono
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
//
//    //Funcion get para la variables telefono
    public int getTelefono() {
        return telefono;
    }
}