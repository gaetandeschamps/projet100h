package hei.tresorock.entities;

public class Participe {

    private int idSoiree;
    private int idClient;
    private double prixPaye;

    public Participe(int idSoiree, int idClient, double prixPaye) {
        this.idSoiree = idSoiree;
        this.idClient = idClient;
        this.prixPaye = prixPaye;
    }

    public int getIdSoiree() {
        return idSoiree;
    }

    public void setIdSoiree(int idSoiree) {
        this.idSoiree = idSoiree;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public double getPrixPaye() {
        return prixPaye;
    }

    public void setPrixPaye(double prixPaye) {
        this.prixPaye = prixPaye;
    }
}
