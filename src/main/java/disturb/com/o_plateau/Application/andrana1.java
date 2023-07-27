/*
package ApplicationApp;

*/
/*import Controller.ControllerLogin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import mg.disturb.Presence.Navigation.Navigation;
import mg.disturb.Presence.Navigation.NavigationConfig;*//*


import java.io.IOException;

public class andrana1 extends Application {
    private Stage primaryStage;


    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        // Charger l'interface utilisateur depuis le fichier FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));


        // Créer une scène et ajouter l'interface utilisateur à la scène
        */
/*Scene scene = new Scene(fxmlLoader.load(), 1100, 750);*//*

        primaryStage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(fxmlLoader.load(), 380, 470);
        Navigation.configure(
                new NavigationConfig(
                        primaryStage,
                        "Login"
                )
        );

        // Définir le titre de la fenêtre et afficher la scène
        */
/*primaryStage.setTitle("...");*//*

        primaryStage.setScene(scene);
        primaryStage.show();

        ControllerLogin controller = fxmlLoader.getController();
        controller.setAppMain(this);
    }


    public static void main(String[] args) {
        launch();
    }

    public void setSceneAndShow(Scene scene) {
        primaryStage.setScene(scene);
        primaryStage.setHeight(630);
        primaryStage.setWidth(1100);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
*/
