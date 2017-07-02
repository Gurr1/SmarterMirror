package Model;

/**
 * Created by gustav on 2017-06-18.
 */

import Controller.ClockController;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class AnalogClockModel {
    enum TimeType {
        minute, hour
    }
    private Calendar time;
    public AnalogClockModel(){
        time = GregorianCalendar.getInstance();
    }

    public double getMinuteX(){
        double angle = getAngle(TimeType.minute, time.get(Calendar.MINUTE) + (time.get(Calendar.SECOND) / 0.6 * 0.01));
        return Math.cos(Math.toRadians(angle+270));
    }
    public double getMinuteY(){
        return 0;
    }
    public double getMinuteDegrees(){
        return 0;
    }
    public double getMinuteRadians(){
        double angle = getAngle(TimeType.minute, time.get(Calendar.MINUTE) + (time.get(Calendar.SECOND) / 0.6 * 0.01));
        angle = Math.toRadians(angle+270);
        return angle;
    }
    private double getAngle(TimeType timeType, double time) {
        double divider = 60;
        if (timeType == TimeType.hour) {
            divider = 24;
        }
        double ratio = time / divider;
        return ratio * 360;
    }
}