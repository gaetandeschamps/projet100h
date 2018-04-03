package hei.tresorock.managers;

import hei.tresorock.dao.ClientDao;
import hei.tresorock.dao.DataBaseCommunication.ClientDaoImpl;
import hei.tresorock.dao.DataBaseCommunication.ParticipeDaoImpl;
import hei.tresorock.dao.DataBaseCommunication.SoireeDaoImpl;
import hei.tresorock.dao.ParticipeDao;
import hei.tresorock.dao.SoireeDao;
import hei.tresorock.entities.Client;
import hei.tresorock.entities.Participe;
import hei.tresorock.entities.Soiree;

import java.util.List;

public class ListeSoiree {

    private static class ListeSoireeHolder {
        private final static ListeSoiree instance = new ListeSoiree();
    }

    public static ListeSoiree getInstance() {
        return ListeSoireeHolder.instance;
    }

    private ClientDao clientDao = new ClientDaoImpl();
    private SoireeDao soireeDao = new SoireeDaoImpl();
    private ParticipeDao participeDao = new ParticipeDaoImpl();

    private ListeSoiree() {
    }

    //méthode liées au traitement des informations des soirées
    public List<Soiree> listSoiree() {  return soireeDao.listSoiree();  }

    public Soiree getSoiree(Integer idSoiree){  return soireeDao.getSoiree(idSoiree);}

    public Soiree addSoiree (Soiree soiree){
        if (soiree == null) {
            throw new IllegalArgumentException("The soiree should not be null.");
        }
        if (soiree.getDateSoiree() == null) {
            throw new IllegalArgumentException("The date of the soiree should not be null.");
        }
        if (soiree.getRecetteCaisse() == null) {
            throw new IllegalArgumentException("The recetteCaisse of soiree should not be null.");
        }
        if (soiree.getThemeSoiree() == null) {
            throw new IllegalArgumentException("The soiree's Theme should not be null.");
        }
        if (soiree.getIdSoiree() == null) {
            throw new IllegalArgumentException("The soiree's ID should not be null.");
        }
        if (soiree.getErreurCaisse() == null) {
            throw new IllegalArgumentException("The soiree's erreurCaisse should not be null.");
        }
        soireeDao.addSoiree(soiree);
        return soiree;
    }

    //méthodes liées au traitement des informations des clients
    public List<Client> listClient() {
        return clientDao.listClient();
    }

    public Client getClient(Integer idClient) {
        return clientDao.getClient(idClient);
    }

    public Client addClient(Client client) {
        if (client == null) {
            throw new IllegalArgumentException("The client should not be null.");
        }
        if (client.getNomClient() == null || "".equals(client.getNomClient())) {
            throw new IllegalArgumentException("The client's name should not be empty.");
        }
        if (client.getPrenomClient() == null || "".equals(client.getPrenomClient())) {
            throw new IllegalArgumentException("The client's first name should not be empty.");
        }
        if (client.getEcoleClient()== null || "".equals(client.getEcoleClient())) {
            throw new IllegalArgumentException("The client's school should not be empty.");
        }
        if (client.getStatutClient() == null || "".equals(client.getStatutClient())) {
            throw new IllegalArgumentException("The client's status should not be null or equal to 0.");
        }

        clientDao.addClient(client);
        return client;
    }

    //méthodes liées au traitement des informations des participations des clients aux soirées
    public List<Participe> listParticipe() {    return participeDao.listParticipe();    }

    public Participe getParticipeDao(Integer idParticipe) { return participeDao.getParticipe(idParticipe);   }

    public Participe addParticipe (Participe participe){
        /*

    idParticipation int(11) NOT NULL AUTO_INCREMENT,
    idClient int(11) NOT NULL,
    idSoiree int(11) NOT NULL,
    DateSoiree date NOT NULL,
    Nom char(20) NOT NULL,
    Prenom char(20) NOT NULL,
    PrixPaye double NOT NULL,

         */

        /*
        if (participe==null){
            throw new IllegalArgumentException("La participation du client à la soirée ne doit pas etre null");
        }
        if (participe.getidParticipe() == null){
            throw new IllegalArgumentException("La participation du client à la soirée ne doit pas etre null");
        }
        if (participe.getIdClient()==null){
            throw new IllegalArgumentException("La participation du client à la soirée ne doit pas etre null");
        }
        if (participe.getIdSoiree()==null){
            throw new IllegalArgumentException("La participation du client à la soirée ne doit pas etre null");
        }
        if (participe.getDateSoiree==null){
            throw new IllegalArgumentException("La participation du client à la soirée ne doit pas etre null");
        }
        if (participe.getN==null){
            throw new IllegalArgumentException("La participation du client à la soirée ne doit pas etre null");
        }
        if (participe==null){
            throw new IllegalArgumentException("La participation du client à la soirée ne doit pas etre null");
        }
        if (participe==null){
            throw new IllegalArgumentException("La participation du client à la soirée ne doit pas etre null");
        }
        */

        participeDao.addParticipe(participe);
        return participe;
    }


}
