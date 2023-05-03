/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.edu.udes.parcial2;

import java.util.ArrayList;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Empleado {

    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String direccion;
    protected String añosAntiguedad;
    protected String telefono;
    protected double salario;
    protected Empleado supervisor;
    

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, String dni, String direccion, String añosAntiguedad, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.añosAntiguedad = añosAntiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = supervisor;
    }

    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion + ", a\u00f1osAntiguedad=" + añosAntiguedad + ", telefono=" + telefono + ", salario=" + salario + ", supervisor=" + supervisor + '}';
    }

   
    

//    @Override
//    public String toString() {
//        System.out.println("Datos De Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion + ", añosAntiguedad=" + añosAntiguedad + ", telefono=" + telefono + ", salario=" + salario + '}');
//        System.out.println("supervisor de "+ nombre+ " :");
//        System.out.println(this.supervisor);
//        return null;
//    }

    public  String cambiarSupervisor(Empleado nuevoSup) {

        supervisor = nuevoSup;
        return null;
    }

    

    public double incrementarSalario(double aumentoAnual) {
        double sueldo = salario + (salario*(aumentoAnual/100));
        System.out.println("salario incrementado: "+sueldo);
        return sueldo;
    }

   

    

}
