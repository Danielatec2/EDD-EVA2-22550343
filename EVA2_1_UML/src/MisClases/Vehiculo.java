/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author danii
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int annio;
    
    public Vehiculo(){
        marca="";
        modelo="";
        annio=0;
    }
    public Vehiculo(String marc, String mod, int an){
        marca=marc;
        modelo=mod;
        annio=an;
        
    }
    public String setMarca(){
        return marca;
    }
     public String setModelo(){
        return modelo;
    }
      public int  setAnnio(){
        return annio;
    }
      public void  getMarca(String valor){
          marca=valor;
          
      }
      public void getModelo(String valor){
          modelo=valor;
      }
    public void getannio(int valor){
        annio=valor;
        
    }
    public void imprimirdatos(){
        System.out.println("DATOS DEL VEHICULO");
        System.out.println("MARCA: "+marca);
        System.out.println("MODELO: "+modelo);
        System.out.println("ANIO : "+annio);
              
    }
     
    
}
