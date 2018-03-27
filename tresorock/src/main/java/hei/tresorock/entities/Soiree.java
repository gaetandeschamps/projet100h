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
    private Double erreurCaisse;
    private String  themeSoiree;

    /**
     * Méthode permettant d'accéder à une soirée
     * @param idSoiree - identifiant unique d'une soirée
     * @param dateSoiree - date de la soirée
     * @param recetteCaisse - recette de la caisse d'une soirée (comptée par les personnes physiquement présentes).
     * @param themeSoiree - thème spécial (si nécessaire) de la soirée
     */
    public Soiree(Integer idSoiree, LocalDate dateSoiree, Double recetteCaisse, Double erreurCaisse, String themeSoiree){
        super();
        this.idSoiree = idSoiree;
        this.dateSoiree = dateSoiree;
        this.recetteCaisse = recetteCaisse;
        this.erreurCaisse = erreurCaisse;
        this.themeSoiree = themeSoiree;
    }

    /**
     * Méthode récupérant la date d'une soirée.
     * @return - date de la soirée
     */
    public LocalDate getDateSoiree() {
        return dateSoiree;
    }

    /**
     * Méthode permettant de définir la date d'une soirée.
     * @return - date de la soirée
     */
    public void setDateSoiree(LocalDate dateSoiree) {
        this.dateSoiree = dateSoiree;
    }

    /**
     * Méthode récupérant la recette de la caisse d'une soirée.
     * @return - recette caisse de la soirée
     */
    public Double getRecetteCaisse() {
        return recetteCaisse;
    }

    /**
     * Méthode permettant de définir la recette de la caisse d'une soirée.
     * @return - recette caisse de la soirée
     */
    public void setRecetteCaisse(Double recetteCaisse) {
        this.recetteCaisse = recetteCaisse;
    }

    /**
     * Méthode récupérant le thème d'une soirée.
     * @return - thème de la soirée
     */
    public String getThemeSoiree() {
        return themeSoiree;
    }

    /**
     * Méthode récupérant l'identifiant unique d'une soirée.
     * @return - identifiant de la soirée
     */
    public Integer getIdSoiree() {
        return idSoiree;
    }

    /**
     * Méthode permettant de définir l'identifiant unique d'une soirée.
     * @return - date de la soirée
     */
    public void setIdSoiree(Integer id) {
        this.idSoiree = id;
    }

    /**
     * Méthode permettant de récupérer l'erreur de caisse d'une soirée.
     * @return - erreur de la caisse
     */
    public Double getErreurCaisse() {
        return erreurCaisse;
    }

    /**
     * Méthode permettant de définir l'erreur de caisse d'une soirée.
     * @return - erreur de la caisse
     */
    public void setErreurCaisse(Double erreurCaisse) {
        this.erreurCaisse = erreurCaisse;
    }
}
