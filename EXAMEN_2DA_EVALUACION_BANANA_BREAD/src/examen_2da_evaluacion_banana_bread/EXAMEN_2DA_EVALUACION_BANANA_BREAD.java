/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_2da_evaluacion_banana_bread;

import Problema1.Movimiento;
import Problema1.MovimientoU;
import Problema1.MovimientoUa;
import Problema1.MovimientoUv;
import Problema2.Apoyo;
import Problema2.Jefe;
import Problema2.Manufactura;
import Problema3.Administrador;
import Problema3.EmpleadoTiempoParcial;

/**
 *
 * @author danii
 */
public class EXAMEN_2DA_EVALUACION_BANANA_BREAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PROBLEMA 1");
        Movimiento M1 = new MovimientoU (10,20,2,5) {};  
        System.out.println("La distancia de un movimiento uniforme es = "+M1.CalcularDistancia());
        Movimiento M2 = new MovimientoUa(10,20,2,5){}; 
        System.out.println("La distancia de un movimiento Uniforme acelerado = "+M2.CalcularDistancia());
        Movimiento M3 = new MovimientoUv(10,20,2,5){};
        System.out.println("La distancia de un movimiento uniforme variado es ="+M3.CalcularDistancia());
        System.out.println("");
        
        System.out.println("PROBLEMA 2");
        Manufactura Manufac = new Manufactura("Ruben","González",25,40);
        System.out.println("SALARIO EMPLEADO DE MANUFACTURA: " + Manufac.calcularSalario(15));
        
        Apoyo Apo = new Apoyo("Carlos","Reyes",32,50);
        System.out.println("SALARIO EMPLEADO DE APOYO: " + Apo.calcularSalario(15));
        
        Jefe  jef = new Jefe("Eduardo","Valadez",40,5000);
       
        System.out.println("SALARIO JEFE: " + jef.calcularSalario(0));
        System.out.println("");
       
        System.out.println("PROBLEMA 3");
        EmpleadoTiempoParcial tiemp = new EmpleadoTiempoParcial();
        tiemp.setPagoPorHora(50);
        tiemp.setHorasTrabajadas(3);
        System.out.println("SALARIO TIEMPO PARCIAL:"+tiemp.calcularSalario());
        tiemp.calcularSalario();
        Administrador adm = new Administrador();
        adm.setSalario(100);
        adm.setPorcentajeDelBono(34);
        adm.calcularSalario();
        System.out.println("PORCENTAJE DEL: "+adm.calcularBono());
        System.out.println ("SALARIO CON BONO: "+adm.calcularSalario());
    }

}
