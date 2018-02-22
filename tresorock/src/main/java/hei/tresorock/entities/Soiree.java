package hei.tresorock.entities;

import java.time.LocalDate;

public class Soiree {

    private LocalDate dateSoiree;
    private Double recetteCaisse;
    private String  themeSoiree;

    public Soiree(LocalDate dateSoiree, Double recetteCaisse, String themeSoiree){
        super();
        this.dateSoiree = dateSoiree;
        this.recetteCaisse = recetteCaisse;
        this.themeSoiree = themeSoiree;
    }
    public LocalDate getDateSoiree() {
        return dateSoiree;
    }

    public void setDateSoiree(LocalDate dateSoiree) {
        this.dateSoiree = dateSoiree;
    }

    public Double getRecetteCaisse() {
        return recetteCaisse;
    }

    public void setRecetteCaisse(Double recetteCaisse) {
        this.recetteCaisse = recetteCaisse;
    }

    public String getThemeSoiree() {
        return themeSoiree;
    }
}
