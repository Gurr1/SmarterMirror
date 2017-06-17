import Controller.BackgroundController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

/**
 * Created by gustav on 2017-06-17.
 */
public class main extends Application{
    public static void main(String[] args){
            launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Background.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("View/style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setFullScreen(true);

    }
}
