/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author danii
 */
public class Tv {
    private int canal;
    private int volumen;
    private boolean poder;
    public Tv(){
        canal=0;
        volumen=0;
        poder=false;
  
        }
    public Tv(int can, int vol, boolean pod){
            canal=can;
            volumen=vol;
            poder=pod;
    }
     public int setCanal(){
        return canal;
    }
     public int setVolumen(){
        return volumen;
    }
      public boolean  setpoder(){
        return poder;
    }
      public void  getCanal(int valor){
          canal=valor;
          
      }
      public void getVolumen(int valor){
          volumen=valor;
      }
    public void getPoder(boolean valor){
        poder=valor;
        
    }
    public void imprimirdatos(){
        System.out.println("DATOS DEL VEHICULO");
        System.out.println("MARCA: "+canal);
        System.out.println("MODELO: "+volumen);
        System.out.println("ANIO : "+poder);
              
    }
    
}
