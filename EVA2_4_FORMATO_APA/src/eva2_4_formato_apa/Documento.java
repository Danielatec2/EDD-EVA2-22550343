/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_formato_apa;

/**
 *
 * @author danii
 */
public class Documento {
    private String autor;
    private String titulo;
    private int mes;
    private int dia;
    private String ciudad;

    public Documento() {
    }

    public Documento(String autor, String titulo, int mes, int dia, String ciudad) {
        this.autor = autor;
        this.titulo = titulo;
        this.mes = mes;
        this.dia = dia;
        this.ciudad = ciudad;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
    
    
}
