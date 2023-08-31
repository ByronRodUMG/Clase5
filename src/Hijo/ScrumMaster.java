package Hijo;

import Padre.Empleado;

public class ScrumMaster extends Empleado {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ScrumMaster(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles() {
        return "Desde Hijo:\n---Nombre: " + this.getNombre() + "\n---Sueldo: "
                + this.getSueldo() + "\n---Direccion: " + this.getDepartamento();
    }
}
