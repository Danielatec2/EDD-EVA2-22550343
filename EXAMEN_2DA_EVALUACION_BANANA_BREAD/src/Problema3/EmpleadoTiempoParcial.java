/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

import examen_2da_evaluacion_banana_bread.*;

/**
 *
 * @author danii
 */
public class EmpleadoTiempoParcial extends Empleados {

    private double pagoPorHora;
    private double horasTrabajadas;

    public EmpleadoTiempoParcial() {
        pagoPorHora = 0;
        horasTrabajadas = 0;
    }

    public EmpleadoTiempoParcial(double pagoPorHora, double horasTrabajadas, String id, String nombre, float salario) {
        super(id, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        salario = pagoPorHora * horasTrabajadas;
        return salario;
    }

}
