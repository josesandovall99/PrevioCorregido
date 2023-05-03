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
public class vendedor extends Empleado {



    protected String telefonoMovil;
    protected String areaDeVenta;
    protected Double porcentajeComision;
    protected Carro carrovendedor;
    protected ArrayList<Cliente> ClientesList;
   

    public vendedor() {
    }

    public vendedor(String telefonoMovil, String areaDeVenta, Double porcentajeComision, Carro carrovendedor, String nombre, String apellidos, String dni, String direccion, String añosAntiguedad, String telefono, double salario) {
        super(nombre, apellidos, dni, direccion, añosAntiguedad, telefono, salario);
        this.telefonoMovil = telefonoMovil;
        this.areaDeVenta = areaDeVenta;
        this.porcentajeComision = porcentajeComision;
        this.carrovendedor = carrovendedor;
        this.ClientesList = new ArrayList <>();
    }

    

//    @Override
//    public String toString() {
//        return "vendedor{" + "ClientesList=" + ClientesList + '}';
//    }

    @Override
    public String toString() {
        return "puesto :vendedor\n{" + "telefonoMovil=" + telefonoMovil + ", areaDeVenta=" + areaDeVenta + ", porcentajeComision=" + porcentajeComision + ", carrovendedor=" + carrovendedor + ", \nClientesList=" + ClientesList + '}';
    }



  


    

    

    
    
    

    
//    public String imprimir() {
//        super.toString();
//        System.out.println("Datos De Vendedor{" + "telefonoMovil=" + telefonoMovil + ", areaDeVenta=" + areaDeVenta + ", porcentajeComision=" + porcentajeComision + ", carrovendedor=" + carrovendedor + ", lista De Clientes: "+ ClientesList+ '}');
//        System.out.println("puesto: vendedor");
//        return null;
//    }

   
    
    

    public void darDeAltaCliente(Cliente Ncliente){
    
        ClientesList.add(Ncliente);
    
    }
    
    public void darDeBajaCliente(Cliente Fcliente){
    
        ClientesList.remove(Fcliente);
    
    }
    
    public Carro CambiarCarro(Carro Ncarro){
    
    
        carrovendedor = Ncarro;
        return Ncarro;
    
    }
    

    
    
    
    
    
    

}
