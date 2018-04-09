package hei.tresorock.DAO.DataBaseCommunication;

import hei.tresorock.DAO.ParticipeDao;
import hei.tresorock.entities.Participe;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe permet de faire le lien avec la table Participe dans la BDD
 */
public class ParticipeDaoImpl implements ParticipeDao {
    /**
     * Cette méthode retourne une liste de toutes les participations présentes dans la BDD dans une structure List
     *
     * @return une List<> d'objets Participe
     */
    @Override
    public List<Participe> listParticipe() {
        String query = "SELECT * FROM Participe";
        List<Participe> listOfParticipe = new ArrayList<>();
        try (
                Connection connection = DataBaseProvider.getdataBase().getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)
        ) {
            while (resultSet.next()) {
                listOfParticipe.add(
                        new Participe(
                                resultSet.getInt("idSoiree"),
                                resultSet.getInt("idClient"),
                                resultSet.getDouble("PrixPaye")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfParticipe;
    }
    /**
     * Cette méthode retourne un objet Participe correspondant à l'identifiant unique de la participations, passé en paramètre
     *
     * @param idParticipe de la participation recherchée
     * @return null
     */
    @Override
    public Participe getParticipe(Integer idParticipe) {
        String query = "SELECT * FROM Participe";
        try (
                Connection connection = DataBaseProvider.getdataBase().getConnection();
                PreparedStatement statement = connection.prepareStatement(query)) {
            try (
                    ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Participe(
                            resultSet.getInt("idClient"),
                            resultSet.getInt("idSoiree"),
                            resultSet.getDouble("PrixPaye"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Cette méthode permet d'ajouter une participation à une soirée dans la base de données
     * @param participe - participation à ajouter
     * @return null
     */

    @Override
    public Participe addParticipe(Participe participe) {
            String query = "INSERT INTO Participe(idClient, idSoiree, PrixPaye) VALUES (?,?,?)";
        try (
                Connection connection = DataBaseProvider.getdataBase().getConnection();
                PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){
            statement.setInt(1, participe.getIdClient());
            statement.setInt(2, participe.getIdSoiree());
            statement.setDouble(3,participe.getPrixPaye());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}