/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author carlo
 */
public class InformeEmpleado extends Empleado {

    private int cant_hijos;
    private String hacienda;
    private String retencion;

    public InformeEmpleado() {
    }

    public InformeEmpleado(String nombre, String apellido, String dni, String direccion, int edad,
            String formacionAcademica, int añosExperiencia, int horas_trabajadas, int pagoPorHora,
            int cant_hijos, String hacienda, String retencion) {
        super(nombre, apellido, dni, direccion, edad, formacionAcademica, añosExperiencia, horas_trabajadas, pagoPorHora);
        this.cant_hijos = cant_hijos;
        this.hacienda = hacienda;
        this.retencion = retencion;
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    public String getHacienda() {
        return hacienda;
    }

    public void setHacienda(String hacienda) {
        this.hacienda = hacienda;
    }

    public String getRetencion() {
        return retencion;
    }

    public void setRetencion(String retencion) {
        this.retencion = retencion;
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
        return sueldoBruto() + pension() + bonoHijos();
    }

    private double pension() {
        if (getRetencion().equals("retencion 2,5%")) {
            return sueldoBruto() * 0.025;
        } else if (getHacienda().equals("hacienda 1,5%")) {
            return sueldoBruto() * 0.015;
        } else {
            return 0;
        }
    }

    private double bonoHijos() {
        double sueldoBruto = sueldoBruto();
        if (getCant_hijos() >= 1 && getCant_hijos() <= 2) {
            return sueldoBruto * 0.032;
        } else if (getCant_hijos() <= 4) {
            return sueldoBruto * 0.05;
        } else {
            return sueldoBruto * 0.075;
        }
    }

    @Override
    public String imprimirReciboPago() {
        return "INFORME DEL TRABAJADOR" + "\n"
                + "---------------------" + "\n"
                + " " + "\n"
                + "Datos del Empleado" + "\n"
                + "Nombres: " + super.getNombre() + "\n"
                + "Apellidos: " + super.getApellido() + "\n"
                + "DNI: " + super.getDni() + "\n"
                + "Edad: " + super.getEdad() + "\n"
                + "Dirección: " + super.getDireccion() + "\n"
                + "Formación Academica: " + super.getFormacionAcademica() + "\n"
                + "Años de experiencia: " + super.getAñosExperiencia() + "\n" + " " + "\n"
                + "Resumen de Pago" + "\n" + " " + "\n"
                + "Sueldo Bruto: S/ " + this.sueldoBruto() + "\n"
                + "Horas Extras: " + cant_horas_extras() + "\n"
                + "Pago por horas Extras: S/ " + horasExtras() + "\n"
                + "Pension: S/ " + pension() + "\n"
                + "Bono por hijos: S/ " + bonoHijos() + "\n" + "Sueldo Neto: S/ " + sueldoNeto();

    }
}
