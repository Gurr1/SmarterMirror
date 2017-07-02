package Controller;

import java.util.ArrayList;
import java.util.List;

public class InternalClock {
    private static List<Updatable> updateList = new ArrayList<Updatable>();
    private static boolean updateEnabled = false;
    private static double delta = 0;
    private InternalClock(){

    }
    public static void addToUpdates(Updatable updatable){
        updateList.add(updatable);
    }
    public static void beginUpdates(){
        if(!updateEnabled){
            updateEnabled = true;
            while(updateEnabled){
                double startTime = System.currentTimeMillis();
                for(Updatable updatable : updateList){
                    updatable.update();
                }
                delta = System.currentTimeMillis() - startTime;
            }
        }
    }
}
