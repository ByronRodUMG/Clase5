package Padre;

public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return "Nombre: " + this.getNombre() + "\nSueldo: " + this.getSueldo();
    }

    @Override
    public String toString() {
        return "Su nombre es: " + this.getNombre() + "\nSueldo: " + this.getSueldo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("Homero")) {
            this.nombre = "No Homeros";
        } else {
            this.nombre = nombre;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
