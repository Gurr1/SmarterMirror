package Controller;

import Model.AnalogClockModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by gustav on 2017-06-18.
 */
public class ClockController implements Initializable, Updatable {
    double minuteSize;
    @FXML
    Line minutePointer;
    @FXML
    Line hourPointer;
    AnalogClockModel analogClockModel;

    public void initialize(URL location, ResourceBundle resources) {
        analogClockModel = new AnalogClockModel();
        InternalClock.addToUpdates(this);
    }

    public void update() {
        double minuteToX = analogClockModel.getMinuteX()*minuteSize;
        double minuteToY = analogClockModel.getMinuteY()*minuteSize;
        minutePointer.setEndY(minuteToY);
        minutePointer.setEndX(minuteToX);
    }
}
