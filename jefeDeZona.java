/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcial2;

import java.util.ArrayList;

/**
 *
 * @author JOSE SANDOVAL
 */
public class jefeDeZona extends Empleado {
    
    protected String despachoJefe;
    protected Empleado secretarioAcargo;
    protected Carro carroJefe;
    protected ArrayList <Empleado> listaVendedores;

    public jefeDeZona(String despachoJefe, Empleado secretarioAcargo, Carro carroJefe, String nombre, String apellidos, String dni, String direccion, String añosAntiguedad, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, añosAntiguedad, telefono, salario);
        this.despachoJefe = despachoJefe;
        this.secretarioAcargo = secretarioAcargo;
        this.carroJefe = carroJefe;
        this.listaVendedores = new ArrayList <Empleado>();
    }

    

    
    
//    
//    public String mostrar() {
//
//        super.toString();
//        System.out.println("Datos De jefeDeZona{" + "despachoJefe=" + despachoJefe + ", carroJefe=" + carroJefe + ", listaVendedores=" + listaVendedores + '}');
//        System.out.println("secretario a cargo : "+ secretarioAcargo.toString());
//        System.out.println("puesto: jefe de zona");
//        return null;
//    }

    @Override
    public String toString() {
        return "jefeDeZona{" + "despachoJefe=" + despachoJefe + ", secretarioAcargo=" + secretarioAcargo + ", carroJefe=" + carroJefe + ", listaVendedores=" + listaVendedores + '}';
    }
    
    
    
    
    public Carro CambiarDeAuto (Carro carroN){
        this.carroJefe = carroN;
    return carroN;
    }
    
    public void darDeAltaVendedor(vendedor ven1){
    
    
    
    
     listaVendedores.add(ven1);
    }
    
    public Empleado darDeBajaVendedor(vendedor ven2){
    
    listaVendedores.remove(ven2);
    return ven2;
    }
    
    public Empleado cambiarSecretario (secretario sec1) {
    
        this.secretarioAcargo = sec1;
    
        
    return sec1;
    }
    
    
    
    
    
    
}
