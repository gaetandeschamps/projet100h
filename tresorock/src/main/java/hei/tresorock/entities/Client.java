package hei.tresorock.entities;

/**
 * Classe définissant les différents paramètres/caractéristiques d'un client participant à une soirée.
 * @author gaetandeschamps, clementgeorjon
 */
public class Client {

    private Integer idClient;
    private String nomClient;
    private String prenomClient;
    private String ecoleClient;
    private boolean cotisantClient;
    private String typeClient;

    /**
     * Méthode permettant d'accéder aux infos d'un participant.
     *
     * @param idClient       -
     * @param nomClient      -
     * @param prenomClient   -
     * @param ecoleClient    -
     * @param cotisantClient -
     * @param typeClient     -
     */
    public Client(Integer idClient, String nomClient, String prenomClient, String ecoleClient, boolean cotisantClient, String typeClient) {
        super();
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.ecoleClient = ecoleClient;
        this.cotisantClient = cotisantClient;
        this.typeClient = typeClient;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getEcoleClient() {
        return ecoleClient;
    }

    public void setEcoleClient(String ecoleClient) {
        this.ecoleClient = ecoleClient;
    }

    public boolean isCotisantClient() {
        return cotisantClient;
    }

    public void setCotisantClient(boolean cotisantClient) {
        this.cotisantClient = cotisantClient;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }
}



