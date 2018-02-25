package hei.tresorock.entities;

public class Client {

    private Integer idClient;
    private String nom;
    private String prenom;
    private String ecole;
    private boolean cotisant;
    private String type;

    public Client(Integer id, String n, String p, String e, boolean c, String t){
        super();
        this.idClient = id;
        this.nom = n;
        this.prenom = p;
        this.ecole = e;
        this.cotisant = c;
        this.type = t;
    }

    public Integer getIdClient() { return idClient; }

    public void setIdClient(Integer idClient) { this.idClient = idClient; }

    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }

    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEcole() { return ecole; }

    public void setEcole(String ecole) { this.ecole = ecole; }

    public boolean isCotisant() { return cotisant; }

    public void setCotisant(boolean cotisant) { this.cotisant = cotisant; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
}
