/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author danii
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Circulo circulo= new Circulo();
        circulo.imprimirDatos();
        Figuras fig= circulo;
        System.out.println("AREA "+ fig.calcularArea());*/
      //ARREGLOS son objetos
      int [] datos= new int[10];
      //un arreglo en java va de la posicion de 0 a la N-1
      //N- es la cantidad de lementos del arreglo
      Circulo[] circulos= new Circulo[100];
      //circulos[0]= new Circulo();
     // circulos[0].calcularArea();
       /* for (int i = 0; i <circulos.length ; i++) { //CREAMOS UNO DE LOS OBJETOS
            circulos[i]= new Circulo(5);
            circulos[i].imprimirDatos();
        }*/
       Figuras[]figuras;// declaramos un arreglo , pero no lo hemos creado
       //Con el Scaner cpturamos por el teclado la cantidad de figuras a utilizar
       Scanner input= new Scanner(System.in);
        System.out.println("Cuantas figuras quieres capturar");
        int cant=input.nextInt();// nos permite capturar
        figuras= new Figuras[cant];// creamos el arreglo con la cantidad de figuras que el usuario quiere
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingresa el tipo de figura ");
            System.out.println("1. Circulo, 2.Triangulo");
            int figu=input.nextInt();
            if(figu==1){//CIRCULO
                Circulo circu= new Circulo();//crear objeto
                figuras[i]=circu;//arreglo
              //  figuras[i]=new Circulo();//arreglotambien se puede escribir asi
                System.out.println("Introduce el radio: ");
              circu.setRadio(input.nextDouble());
                
            }else{//TRIANGULO
                Triangulo tria=new Triangulo();
                figuras[i]=tria;
               // figuras[i]=new Triangulo();//arreglo
                System.out.println("Introduce la base: ");
               tria.setBase(input.nextDouble());
                System.out.println("Introduce la altura: ");
               tria.setAltura(input.nextDouble());
                
            }
        }
        //imprimir
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Circulo){
            System.out.println("Circulo");
            Circulo circu=(Circulo)figuras[i];//CASTING
            circu.imprimirDatos();
            }
            else{
                    System.out.println("TRIANGULO");
                    Triangulo tria=(Triangulo) figuras[i];
                    tria.imprimirDatos();
                    }
    }
    }
}
//Convertimos un Circulo y un Triangulo en una figura
        //Si hicimos un polimorfismo, podemos refresar a una figura al objeto original