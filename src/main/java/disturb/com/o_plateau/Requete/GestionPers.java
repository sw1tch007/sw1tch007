package disturb.com.o_plateau.Requete;

import disturb.com.o_plateau.Application.DatabaseConnection;
import disturb.com.o_plateau.Models.Personne;
import disturb.com.o_plateau.Utils.ResultAdapter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GestionPers {
    static Connection connection;

    static private Connection getConnection() {
        if (connection == null) {
            try {
                connection = DatabaseConnection.getConnection();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static ObservableList<Personne> listPersonne() throws SQLException {
        String sql = "SELECT * FROM Personne";

        PreparedStatement stat = getConnection().prepareStatement(sql);
        ResultSet res = stat.executeQuery();
        return FXCollections.observableArrayList(ResultAdapter.toListPersonne(res));

    }
}
