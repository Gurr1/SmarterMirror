package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.sql.Time;
import java.util.ResourceBundle;

/**
 * Created by gustav on 2017-06-18.
 */
public class BackgroundController implements Initializable{
    @FXML Parent TimeWidget;
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(TimeWidget);
    }
}
