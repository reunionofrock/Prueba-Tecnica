package com.josemar.backend.Entities;

public class Vacuna {
    private int idVacuna;
    private String NombreVacuna;
    private int diasPostPrimerDosis;
    private int dosisUnica;

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getNombreVacuna() {
        return NombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        NombreVacuna = nombreVacuna;
    }

    public int getDiasPostPrimerDosis() {
        return diasPostPrimerDosis;
    }

    public void setDiasPostPrimerDosis(int diasPostPrimerDosis) {
        this.diasPostPrimerDosis = diasPostPrimerDosis;
    }

    public int getDosisUnica() {
        return dosisUnica;
    }

    public void setDosisUnica(int dosisUnica) {
        this.dosisUnica = dosisUnica;
    }
}
