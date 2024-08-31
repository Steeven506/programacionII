package model;

public class Empleado {
    private  String codigo;
    private String nombreEmpleado;
    private int horasTrabajadas;
    private double valorHoraTrabajada;
    private double sueldo;

    public Empleado() {
        this.codigo = "00000";
        this.nombreEmpleado = "Sin definir";
        this.horasTrabajadas = 0;
        this.valorHoraTrabajada = 0;
        this.sueldo = 0;
    }

    public Empleado(String codigo, String nombreEmpleado, int horasTrabajadas, double valorHoraTrabajada, double sueldo) {
        this.codigo = codigo;
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraTrabajada = valorHoraTrabajada;
        this.sueldo = sueldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHoraTrabajada() {
        return valorHoraTrabajada;
    }

    public void setValorHoraTrabajada(double valorHoraTrabajada) {
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
