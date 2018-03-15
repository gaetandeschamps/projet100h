package hei.tresorock.DAO.communication_BDD;

import hei.tresorock.DAO.ClientDao;
import hei.tresorock.entities.Client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe permet de faire le lien avec la table Client dans la BDD
 */
public class ClientDaoImpl implements ClientDao{

    /**
     * Cette méthode retourne une liste de tous les clients présents dans la BDD dans une structure List
     * @return une List<> d'objets Client
     */
    @Override
    public List<Client> listClient() {
        String query = "SELECT * FROM Client ORDER BY IdClient";
        List<Client> listOfClients = new ArrayList<>();
        try (
                Connection connection = DataSourceProvider.getDataSource().getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)
        ) {
            while (resultSet.next()) {
                listOfClients.add(
                        new Client(
                                resultSet.getInt("IdClient"),
                                resultSet.getString("Nom"),
                                resultSet.getString("Prenom"),
                                resultSet.getString("Ecole"),
                                resultSet.getBoolean("Cotisant"),
                                resultSet.getString("Statut")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfClients;
    }

    /**
     * Cette méthode retourne un objet Client correpsondant à l'IdClient passé en paramètre
     * @param idClient du client recherché
     * @return un objet Client
     */
    @Override
    public Client getClient(Integer idClient) { return null; }

    @Override
    public Client addClient(Client client) {
        return null;
    }
}
