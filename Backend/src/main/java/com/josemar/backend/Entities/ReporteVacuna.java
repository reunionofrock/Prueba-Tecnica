package com.josemar.backend.Entities;

public class ReporteVacuna {
    private String nombreEmpleado;
    private String nombrePuesto;
    private String nombreVacuna;
    private int dosisUnica;
    private String fechaDosis1;
    private String fechaDosis2;
    private int estadoVacuna;

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public String getFechaDosis1() {
        return fechaDosis1;
    }

    public void setFechaDosis1(String fechaDosis1) {
        this.fechaDosis1 = fechaDosis1;
    }

    public String getFechaDosis2() {
        return fechaDosis2;
    }

    public void setFechaDosis2(String fechaDosis2) {
        this.fechaDosis2 = fechaDosis2;
    }

    public int getEstadoVacuna() {
        return estadoVacuna;
    }

    public void setEstadoVacuna(int estadoVacuna) {
        this.estadoVacuna = estadoVacuna;
    }

    public int getDosisUnica() {
        return dosisUnica;
    }

    public void setDosisUnica(int dosisUnica) {
        this.dosisUnica = dosisUnica;
    }
}
