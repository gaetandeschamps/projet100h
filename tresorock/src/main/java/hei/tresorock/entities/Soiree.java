package hei.tresorock.entities;

import java.time.LocalDate;

/**
 * Classe définissant les différents paramètres d'une soirée et comment y accéder/les modifier.
 * @author gaetandeschamps, clementgeorjon
 */
public class Soiree {

    private Integer idSoiree;
    private LocalDate dateSoiree;
    private Double recetteCaisse;
    private String  themeSoiree;

    /**
     * Méthode permettant d'accéder à une soirée
     * @param idSoiree - identifiant unique d'une soirée
     * @param dateSoiree - date de la soirée
     * @param recetteCaisse - recette de la caisse d'une soirée (comptée par les personnes physiquement présentes).
     * @param themeSoiree - thème spécial (si nécessaire) de la soirée
     */
    public Soiree(Integer idSoiree, LocalDate dateSoiree, Double recetteCaisse, String themeSoiree){
        super();
        this.idSoiree = idSoiree;
        this.dateSoiree = dateSoiree;
        this.recetteCaisse = recetteCaisse;
        this.themeSoiree = themeSoiree;
    }

    /**
     * Méthode récupérant la date d'une soriée.
     * @return - date de la soirée
     */
    public LocalDate getDateSoiree() {
        return dateSoiree;
    }

    /**
     * Méthode permettant de définir la date d'une soriée.
     * @return - date de la soirée
     */
    public void setDateSoiree(LocalDate dateSoiree) {
        this.dateSoiree = dateSoiree;
    }

    /**
     * Méthode récupérant la recette de la caisse d'une soriée.
     * @return - recette caisse de la soirée
     */
    public Double getRecetteCaisse() {
        return recetteCaisse;
    }

    /**
     * Méthode permettant de définir la recette de la caisse d'une soriée.
     * @return - recette caisse de la soirée
     */
    public void setRecetteCaisse(Double recetteCaisse) {
        this.recetteCaisse = recetteCaisse;
    }

    /**
     * Méthode récupérant le thème d'une soriée.
     * @return - thème de la soirée
     */
    public String getThemeSoiree() {
        return themeSoiree;
    }

    /**
     * Méthode récupérant l'identifiant unique d'une soriée.
     * @return - identifiant de la soirée
     */
    public Integer getId() {
        return idSoiree;
    }

    /**
     * Méthode permettant de définir l'identifiant unique d'une soriée.
     * @return - date de la soirée
     */
    public void setId(Integer id) {
        this.idSoiree = id;
    }
}
