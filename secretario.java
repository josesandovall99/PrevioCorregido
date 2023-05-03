/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcial2;

/**
 *
 * @author JOSE SANDOVAL
 */
public class secretario extends Empleado {
    
    
    private String despacho;
    private int numerodeFax;

    public secretario(String despacho, int numerodeFax, String nombre, String apellidos, String dni, String direccion, String añosAntiguedad, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, añosAntiguedad, telefono, salario);
        this.despacho = despacho;
        this.numerodeFax = numerodeFax;
    }



    @Override
    public String toString() {
        
        return super.toString() + "secretario{" + "despacho=" + despacho + ", numerodeFax=" + numerodeFax + '}';
    }
    
    
    

    

    
    
    

    
    
    

    
    
    
    
}
