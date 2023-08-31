import Hijo.ScrumMaster;
import Padre.Empleado;

public class Main {

    public static void imprime(Empleado emple) {
        System.out.println("Objeto.obtenerDetalles() : \n"+ emple.obtenerDetalles());
    }

    public static void prueb(int dato) {
        System.out.println("Nada");
    }

    public static void determinarTipo(Empleado emple) {
        if (emple instanceof ScrumMaster) {
            System.out.println("Esto viene de ScrumMaster");
        } else if (emple instanceof Empleado) {
            System.out.println("Esto viene de Empleado");
        } else if (emple instanceof Object) {
            System.out.println("Es cualquier cosa");
        }
    }

    public static void main(String[] args) {
        Empleado em = new Empleado("Juan", 3500);
        //imprime(em);
        ScrumMaster sm = new ScrumMaster("Pedro", 3000, "Desarrollo");
        //imprime(sm);
        System.out.println(em.toString());
    }
}