package view;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class View {

    public View(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/tracker.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Distance Tracker");
            stage.show();
        } catch (IOException e) {
            System.err.println("Problem while loading a fxml file");
            throw new RuntimeException(e);
        }
    }
}
