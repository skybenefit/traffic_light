package ru.khasang.traffic_light;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by Victory on 11.07.2017.
 */
public class Lamp {
    private Color color;
    private long timeMinutes;

    public Lamp(Color color) {
        this(color, 1);
    }

    public Lamp(Color color, int timeMinutes) {
        this.color       = color;
        this.timeMinutes = timeMinutes;
    }

    public long getTimeMinutes() {
        return timeMinutes;
    }

    public void setTimeMinutes(long timeMinutes) {
        this.timeMinutes = timeMinutes;
    }

    public Color getColor() {
        return color;
    }


    public void run() {
        System.out.println("Горит " + this.color  );
        int i = 1;
        try {
            for (; i <= 60 * this.timeMinutes; i++){
                System.out.print(i + " ");
                TimeUnit.SECONDS.sleep(1);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("\n" + this.color + " свет горел " + --i + " секунд " );

        }

    }


}
