package hei.tresorock.managers;

import hei.tresorock.entities.Soiree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

public class ListeSoiree {

    private static class ListeSoireeHolder {
        private final static ListeSoiree instance = new ListeSoiree();
    }

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


    public Soiree getFilm(Integer idSoiree) {
        return soireeList.get(idSoiree);
    }


    public Soiree addSoiree(Soiree soiree) {
        Integer idSoiree = soireeList.lastKey() + 1;
        soiree.setId(idSoiree);
        soireeList.put(idSoiree, soiree);
        return soiree;
    }



    private void initialize() {

        soireeList = new TreeMap<>();
        soireeList.put(1, new Soiree(1,LocalDate.of(2017, 12,6),100.00,"Noël"));
        soireeList.put(2, new Soiree(2,LocalDate.of(2017,11,29),172.00,"Aucun"));
        soireeList.put(3, new Soiree(3,LocalDate.of(2017,11,22),234.00,"Aucun"));
        soireeList.put(4, new Soiree(4,LocalDate.of(2017,11,15),70.00,"Halloween"));
        soireeList.put(5, new Soiree(5,LocalDate.of(2017,10,25),35.00,"Aucun"));

    }
}
