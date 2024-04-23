/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author carlo
 */
public class Empleado_Recibo extends Empleado {

    private String recibo;

    public Empleado_Recibo() {
    }

    public Empleado_Recibo(String nombre, String apellido, String dni, String direccion, int edad,
            String formacionAcademica, int añosExperiencia, int horas_trabajadas, int pagoPorHora,
            String recibo) {
        super(nombre, apellido, dni, direccion, edad, formacionAcademica, añosExperiencia, horas_trabajadas, pagoPorHora);
        this.recibo = recibo;
    }

    public String getRecibo() {
        return recibo;
    }

    public void setRecibo(String recibo) {
        this.recibo = recibo;
    }

    @Override
    public int cant_horas_extras() {
        if (getHoras_trabajadas() > 40) {
            return getHoras_trabajadas() - 40;
        } else {
            return 0;
        }
    }

    @Override
    public int horasExtras() {
        return cant_horas_extras() * (getPagoPorHora() * 2);
    }

    @Override
    public double sueldoBruto() {
        return getHoras_trabajadas() * getPagoPorHora();
    }

    @Override
    public double sueldoNeto() {
        return sueldoBruto() + horasExtras();
    }

    @Override
    public String imprimirReciboPago() {
        return "INFORME DEL TRABAJADOR" + "\n"
                + "----------------------" + "\n"
                + " " + "\n"
                + "Datos del Empleado" + "\n"
                + "Nombres: " + getNombre() + "\n"
                + "Apellidos: " + getApellido() + "\n"
                + "DNI: " + getDni() + "\n"
                + "Edad: " + getEdad() + "\n"
                + "Dirección: " + getDireccion() + "\n"
                + "Formación Academica: " + getFormacionAcademica() + "\n"
                + "Años de experiencia: " + getAñosExperiencia() + "\n"
                + " " + "\n"
                + "Resumen de Pago: " + getRecibo() + "\n"
                + "Sueldo Bruto: S/ " + sueldoBruto() + "\n"
                + "Horas Extras: " + cant_horas_extras() + "\n"
                + "Pago por horas Extras: S/ " + horasExtras() + "\n"
                + "Sueldo Neto: S/ " + sueldoNeto();
    }
}
