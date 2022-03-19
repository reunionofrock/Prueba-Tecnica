package com.josemar.backend.Entities;

import java.util.Date;

public class Empleado {
    private int idEmpleado;
    private String nombreEmpleado;
    private int idPuesto;
    private String nombrePuesto;
    private int idVacuna;
    private String nombreVacuna;
    private Date fechaPrimerDosis;
    private Date fechaSegundaDosis;
    private int dosisUnica;
    private int estadoVacuna;


    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public Date getFechaPrimerDosis() {
        return fechaPrimerDosis;
    }

    public void setFechaPrimerDosis(Date fechaPrimerDosis) {
        this.fechaPrimerDosis = fechaPrimerDosis;
    }

    public Date getFechaSegundaDosis() {
        return fechaSegundaDosis;
    }

    public void setFechaSegundaDosis(Date fechaSegundaDosis) {
        this.fechaSegundaDosis = fechaSegundaDosis;
    }

    public int getDosisUnica() {
        return dosisUnica;
    }

    public void setDosisUnica(int dosisUnica) {
        this.dosisUnica = dosisUnica;
    }

    public int getEstadoVacuna() {
        return estadoVacuna;
    }

    public void setEstadoVacuna(int estadoVacuna) {
        this.estadoVacuna = estadoVacuna;
    }
}
