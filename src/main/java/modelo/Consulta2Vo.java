/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jsofi
 */
public class Consulta2Vo {
    private Integer id_proyecto;
    private String constructora;
    private Integer numero_habitaciones;
    private String ciudad; 

    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(Integer numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    @Override
    public String toString() {
        return String.format("%3d %-25s %-20s %-15s", id_proyecto, constructora, numero_habitaciones,
        ciudad);
    }
}
