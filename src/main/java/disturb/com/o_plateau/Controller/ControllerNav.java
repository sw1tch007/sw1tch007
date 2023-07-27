package disturb.com.o_plateau.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.util.Objects;

public class ControllerNav {

    @FXML
    private StackPane stackPane;

    public void initialize() {
        try {
            Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml")));
            stackPane.getChildren().removeAll();
            stackPane.getChildren().setAll(parent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Customer() throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Customer.fxml")));
        stackPane.getChildren().removeAll();
        stackPane.getChildren().setAll(parent);
    }

    public void Dashboard() throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dashboard.fxml")));
        stackPane.getChildren().removeAll();
        stackPane.getChildren().setAll(parent);
    }
}
