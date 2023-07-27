package disturb.com.o_plateau.Controller;

import disturb.com.o_plateau.Models.Personne;
import disturb.com.o_plateau.Requete.GestionPers;
import disturb.com.o_plateau.Utils.ListCellPers;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.SQLException;

public class ControllerPersonne {
    @FXML
    private ListView<Personne> listView;

    @FXML
    public void Afficher() {
        try {
            listView.setCellFactory(param -> new ListCellPers());
            listView.setItems( GestionPers.listPersonne());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
