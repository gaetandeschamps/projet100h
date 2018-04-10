package hei.tresorock.dao.DataBaseCommunication;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;

public class DataBaseProvider {

    private static MysqlDataSource dataBase;

    public static DataSource getdataBase() {
        if (dataBase == null) {
            dataBase = new MysqlDataSource();
            dataBase.setServerName("dz8959rne9lumkkw.chr7pe7iynqr.eu-west-1.rds.amazonaws.com");
            dataBase.setPort(3306);
            dataBase.setDatabaseName("h9s3lz43rgmcyn3r");
            dataBase.setUser("sua6qjylb3e63ot8");
            dataBase.setPassword("deu6e8a237vvliwl");
        }
        return dataBase;
    }
}
