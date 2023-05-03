/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.parcial2;

/**
 *
 * @author JOSE SANDOVAL
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro CARRO1 = new Carro ("1A","nissan","3");
        Carro CARRO2 = new Carro ("1B","toyota","1");
        Carro CARRO3 = new Carro ("1B","chevrolet","6");
        Carro CARRO4 = new Carro ("1D","bmw","2");
        Cliente client1 = new Cliente("pedro","sanchez",20);
        Cliente client2 = new Cliente("laura","sanchez",20);
        Cliente client3 = new Cliente("santiago","lopez",20);
        Cliente client4 = new Cliente("camilo","buitrago",20);
        
                
        secretario juan = new secretario("despacho1",20,"juan","garcia","353245","2N-patios","6","423424", 2000000);
        jefeDeZona jose = new jefeDeZona("despacho2",juan,CARRO4 ,"jose","rodriguez","43535","20g-guaimaral","5","252535",3000000);
        vendedor carlos = new vendedor("23423442","area1" ,0.20,CARRO1,"carlos","acevedo","4353435","204g-guaimaral","4","4252535",3000000);
        vendedor carla = new vendedor("3453" , "area2", 0.20 , CARRO2 , "carla" , "sanchez" , "453543" , "direccion" , "4" , "23324" , 3000000);
        

        juan.cambiarSupervisor(carlos);
        juan.incrementarSalario(5);
        System.out.println(juan.toString());
       
        System.out.println("--------------------");
        
        carlos.cambiarSupervisor(juan);
        carlos.incrementarSalario(10);
        carlos.CambiarCarro(CARRO2);
        carlos.darDeAltaCliente(client1);
        carlos.darDeAltaCliente(client2);
        carlos.darDeAltaCliente(client3);
        carlos.darDeBajaCliente(client3);
        System.out.println(carlos);
        
        System.out.println("------------------");
        
        jose.CambiarDeAuto(CARRO3);
        jose.cambiarSecretario(juan);
        jose.cambiarSupervisor(carlos);
        jose.darDeAltaVendedor(carlos);
        jose.darDeAltaVendedor(carla);
        jose.darDeBajaVendedor(carlos);
        System.out.println(jose.toString());

        
    }
//    
    
    
}
