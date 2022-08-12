package misiontic2022.reto5.Utilities;
import java.sql.*;

public class JDBCUtilities {
	private static final String UBICACION_BD = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }

}
