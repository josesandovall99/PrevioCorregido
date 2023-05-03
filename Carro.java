/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.parcial2;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Carro {
    protected String matricula;
    protected String marca;
    protected String modelo;

    
    
    
    public Carro(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    
    @Override
    public String toString() {
        return "Carro{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + '}';
    }

    
}
