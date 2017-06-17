package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

/**
 * Created by gustav on 2017-06-18.
 */
public class ClockController implements Initializable{
    @FXML Line minutePointer;
    @FXML Line hourPointer;


    public void initialize(URL location, ResourceBundle resources) {
        Calendar calendar = GregorianCalendar.getInstance();
        System.out.println(calendar.getTime());
      //  minutePointer.setEndX();
      //  minutePointer.setEndY();
    }
}
