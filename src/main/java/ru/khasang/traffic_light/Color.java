package ru.khasang.traffic_light;

/**
 * Created by Victory on 11.07.2017.
 */
public enum Color {
    GREEN,
    YELLOW,
    RED;

    @Override
    public String toString() {
        switch (this){
            case GREEN  : return "зеленый";
            case YELLOW : return "желтый";
            case RED    : return "красный";
            default: return "";
        }
    }
}
