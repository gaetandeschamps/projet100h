package hei.tresorock.DAO.impl;

import hei.tresorock.DAO.DataBaseCommunication.DataBaseProvider;
import hei.tresorock.DAO.DataBaseCommunication.SoireeDaoImpl;
import hei.tresorock.DAO.SoireeDao;
import hei.tresorock.entities.Soiree;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;

public class SoireeDaoImplTestCase {
    private SoireeDao soireeDao = new SoireeDaoImpl();

    @Before
    public void initDb() throws Exception {
        try (Connection connection = DataBaseProvider.getdataBase().getConnection();
             Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(
                    "INSERT INTO `Soiree`(`idSoiree`,`DateSoiree`,`RecetteDeCaisse`, `ErreurDeCaisse`, `Theme`) "
                            + "VALUES (6, '2018-01-01', '23.5', '0', 'Vampire')");
            stmt.executeUpdate(
                    "INSERT INTO `Soiree`(`idSoiree`,`DateSoiree`,`RecetteDeCaisse`, `ErreurDeCaisse`, `Theme`) "
                            + "VALUES (7, '2018-04-07', '18.5', '-5', '')");
        }
    }

    @Test
    public void shouldListSoiree() {
        // WHEN
        List<Soiree> soirees = soireeDao.listSoiree();
        // THEN
        assertThat(soirees).hasSize(2);
        assertThat(soirees).extracting("idSoiree","dateSoiree","recetteCaisse","erreurCaisse","themeSoiree").containsOnly(
                tuple(6, LocalDate.of(2018, 01, 01), "23.5", "0", "Vampire"),
                tuple(7, LocalDate.of(2018, 04, 07), "18.5", "-5", "")
        );

    }

}
