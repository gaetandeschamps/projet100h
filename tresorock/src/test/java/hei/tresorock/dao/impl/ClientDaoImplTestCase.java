package hei.tresorock.dao.impl;

import hei.tresorock.dao.ClientDao;
import hei.tresorock.dao.DataBaseCommunication.ClientDaoImpl;
import hei.tresorock.dao.DataBaseCommunication.DataBaseProvider;
import hei.tresorock.entities.Client;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class ClientDaoImplTestCase {

    private ClientDao clientDao = new ClientDaoImpl() {
    };

    @Before
    public void initDb() throws Exception {
        try (Connection connection = DataBaseProvider.getdataBase().getConnection();
             Statement stmt = connection.createStatement()) {
            stmt.executeUpdate("DELETE FROM Client");
            stmt.executeUpdate("INSERT INTO `Client`(`idClient`,`Nom`,`Prenom`,`Ecole`,`Cotisant`,`Statut`) VALUES (1,'TEST','TEST','TEST',false,'TEST')");

        }
    }
    @Test
    public void shouldAddTournoi() throws Exception {
        // GIVEN
        Client newClient = new Client(null, "TEST","TEST","TEST",false,"TEST");
        // WHEN
        Client createdClient = clientDao.addClient(newClient);
        // THEN
        assertThat(createdClient).isNotNull();
        assertThat(createdClient.getIdClient()).isNotNull();
        assertThat(createdClient.getNomClient()).isEqualTo("TEST");
        assertThat(createdClient.getPrenomClient()).isEqualTo("TEST");
        assertThat(createdClient.getEcoleClient()).isEqualTo("TEST");
        assertThat(createdClient.isCotisantClient()).isEqualTo(false);
        assertThat(createdClient.getStatutClient()).isEqualTo("TEST");

        try (Connection connection = DataBaseProvider.getdataBase().getConnection();
             Statement stmt = connection.createStatement()) {
            try (ResultSet rs = stmt.executeQuery("SELECT * FROM Client WHERE Nom = 'TEST'")) {
                assertThat(rs.next()).isTrue();
                assertThat(rs.getInt("idClient")).isEqualTo(createdClient.getIdClient());
                assertThat(rs.getString("Nom")).isEqualTo("TEST");
                assertThat(rs.getString("Prenom")).isEqualTo("TEST");
                assertThat(rs.getString("Ecole")).isEqualTo("TEST");
                assertThat(rs.getBoolean("Cotisant")).isEqualTo(false);
                assertThat(rs.getString("Statut")).isEqualTo("TEST");
                assertThat(rs.next()).isFalse();
            }
        }
    }
}
