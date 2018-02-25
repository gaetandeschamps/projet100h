package hei.tresorock.managers;

import hei.tresorock.entities.Soiree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

/**
 * Classe regroupant la liste de toutes les soirées créées et présentes dans la base de données.
 * @author gaetandeschamps, clementgeorjon
 */
public class ListeSoiree {

    /**
     * Méthode qui crée la liste de toutes les soirées.
     */
    private static class ListeSoireeHolder {
        private final static ListeSoiree instance = new ListeSoiree();
    }

    /**
     * Méthode pour récupérer l'instance.
     * @return - récupère l'instance de la liste des soirées.
     */
    public static ListeSoiree getInstance() {
        return ListeSoireeHolder.instance;
    }

    private TreeMap<Integer, Soiree> soireeList;



    private ListeSoiree() {
        this.initialize();
    }

    public List<Soiree> soireeList() {
        return new ArrayList<>(soireeList.values());
    }

    /**
     * Méthode servant à récupérer une soirée en particulier grâce à son id.
     * @param idSoiree - identifiant unique donné à chaque soirée permettant de choisir celle sur laquelle on veut travailler.
     * @return - id de la soirée
     */
    public Soiree getSoiree(Integer idSoiree) {
        return soireeList.get(idSoiree);
    }

    /**
     * Méthode permettant d'ajouter une nouvelle soirée à la liste de soirées créées auparavant.
     * @param soiree - nouvelle soirée à ajouter
     * @return - la soirée nouvellement ajoutée.
     */
    public Soiree addSoiree(Soiree soiree) {
        Integer idSoiree = soireeList.lastKey() + 1;
        soiree.setId(idSoiree);
        soireeList.put(idSoiree, soiree);
        return soiree;
    }


    /**
     * Méthode simulant une base de données en attendant de connecter la "vraie".
     */
    private void initialize() {

        soireeList = new TreeMap<>();
        soireeList.put(1, new Soiree(1,LocalDate.of(2017, 12,6),100.00,"Noël"));
        soireeList.put(2, new Soiree(2,LocalDate.of(2017,11,29),172.00,"Aucun"));
        soireeList.put(3, new Soiree(3,LocalDate.of(2017,11,22),234.00,"Aucun"));
        soireeList.put(4, new Soiree(4,LocalDate.of(2017,11,15),70.00,"Halloween"));
        soireeList.put(5, new Soiree(5,LocalDate.of(2017,10,25),35.00,"Aucun"));

    }
}
