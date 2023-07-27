package disturb.com.o_plateau.Utils;

import disturb.com.o_plateau.Models.Personne;
import javafx.scene.control.ListCell;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class ListCellPers extends ListCell<Personne> {
    @Override
    protected void updateItem(Personne personne, boolean empty) {
        super.updateItem(personne, empty);

        if (empty || personne == null) {
            setText(null);
            setGraphic(null);
        } else {
            GridPane gridPane = new GridPane();
            Text nomText = new Text(personne.getNom());
            Text ageText = new Text("Age: " + personne.getAge());
            gridPane.addRow(0, nomText, ageText);

            setGraphic(gridPane);
        }

    }
}
