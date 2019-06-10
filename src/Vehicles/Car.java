/**
 * @author WASYL
 */
package Vehicles;

import java.text.NumberFormat;

public class Car implements VehicleAble {
    private final String mark;
    private final String model;
    private final String vin;
    private final String color;
    private final String plate;
    private final int kilometers;
    private final int dayPrice;

    public Car(String mark, String model, String vin, String color, String plate, int kilometers, int dayPrice) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.vin = vin;
        this.plate = plate;
        this.kilometers = kilometers;
        this.dayPrice = dayPrice;
    }

    @Override
    public int getDayPrice() {
        return this.dayPrice;
    }

    @Override
    public void printInformation() {
        System.out.println("Marka: " + this.mark);
        System.out.println("Model: " + this.model);
        System.out.println("Nr VIN: " + this.vin);
        System.out.println("Kolor: " + this.color);
        System.out.println("Tablica rejestracyjna: " + this.plate);
        System.out.println("Przebieg: " + NumberFormat.getInstance().format(this.kilometers) + " km");
        System.out.println("Cena dziennego wynajmu: " + this.dayPrice + " zł");
    }
}
