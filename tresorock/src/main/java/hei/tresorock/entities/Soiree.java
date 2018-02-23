package hei.tresorock.entities;

import java.time.LocalDate;

public class Soiree {

    private Integer idSoiree;
    private LocalDate dateSoiree;
    private Double recetteCaisse;
    private String  themeSoiree;

    public Soiree(Integer idSoiree, LocalDate dateSoiree, Double recetteCaisse, String themeSoiree){
        super();
        this.idSoiree = idSoiree;
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

    public Integer getId() {
        return idSoiree;
    }

    public void setId(Integer id) {
        this.idSoiree = id;
    }
}
