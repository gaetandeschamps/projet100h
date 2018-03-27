package hei.tresorock.managers;

import hei.tresorock.dao.ClientDao;
import hei.tresorock.DAO.DataBaseCommunication.ClientDaoImpl;
import hei.tresorock.DAO.DataBaseCommunication.SoireeDaoImpl;
import hei.tresorock.dao.SoireeDao;
import hei.tresorock.entities.Client;

import java.util.List;

public class 	ListeSoiree {

    private static class ListeSoireeHolder {
        private final static ListeSoiree instance = new ListeSoiree();
    }

    public static ListeSoiree getInstance() {
        return ListeSoireeHolder.instance;
    }

    private ClientDao clientDao = new ClientDaoImpl();
    private SoireeDao soireeDao = new SoireeDaoImpl();

    private ListeSoiree() {
    }

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
            throw new IllegalArgumentException("The client's title should not be empty.");
        }
        if (client.getPrenomClient() == null || "".equals(client.getPrenomClient())) {
            throw new IllegalArgumentException("The client's director should not be empty.");
        }
        if (client.getEcoleClient()== null || "".equals(client.getEcoleClient())) {
            throw new IllegalArgumentException("The client's summary should not be empty.");
        }
        if (client.getStatutClient() == null || "".equals(client.getStatutClient())) {
            throw new IllegalArgumentException("The client's duration should not be null or equal to 0.");
        }

        clientDao.addClient(client);
        return client;
    }

}
