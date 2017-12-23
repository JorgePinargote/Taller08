    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emsamablajecomputadoras.creacional;

/**
 *
 * @author Palacios
 */

public class Computador implements Icomputadora{
    
    public String marca;
    public String modelo;
    
    public Memoria ram;
    public Memoria almacenamiento;
    
    public boolean coolerExterno;
    
    public SistemaOperativo os;
    
    public Mainboard placa;
    
    

    public Computador() {
    }
    
    

    public SistemaOperativo getOs() {
        return os;
    }

    public void setOs(SistemaOperativo os) {
        this.os = os;
    }


    public Mainboard getPlaca() {
        return placa;
    }

    public void setPlaca(Mainboard placa) {
        this.placa = placa;
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

    public boolean isCoolerExterno() {
        return coolerExterno;
    }

    public void setCoolerExterno(boolean coolerExterno) {
        this.coolerExterno = coolerExterno;
    }
    
    

      
    
    public String especificacionesTecnicas(){
        return "Especificiaciones Tecnicas:\n"
               +"Modelo : "+modelo+"\n"
               +"Marca: "+marca+"\n"
               +"Mainboard: "+placa+"\n"
               +"Memoria Ram: "+ram.capacidad+ " " + ram.tipo+"\n"
               +"Disco duro: "+almacenamiento.capacidad +" "+ almacenamiento.tipo +"\n"
               +"Sistema Operativo: "+os;
               
    }
    
    
    
    
}
