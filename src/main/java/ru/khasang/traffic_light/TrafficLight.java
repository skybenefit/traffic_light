package ru.khasang.traffic_light;

import java.util.Scanner;

/**
 * Created by Victory on 11.07.2017.
 */
public class TrafficLight{

    private Lamp greenLamp;
    private Lamp yellowLamp;
    private Lamp redLamp;

    public TrafficLight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время в минутах");

        System.out.print("Зеленый должен гореть : ");
        this.greenLamp  = new Lamp(Color.GREEN,   scanner.nextInt());

        System.out.print("Желтый  должен гореть : ");
        this.yellowLamp = new Lamp(Color.YELLOW,  scanner.nextInt());

        System.out.print("Красный должен гореть : ");
        this.redLamp    = new Lamp(Color.RED,     scanner.nextInt());
        scanner.close();

    }

    public void run(){
        this.greenLamp.run();
        this.yellowLamp.run();
        this.redLamp.run();
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.run();
    }
}
