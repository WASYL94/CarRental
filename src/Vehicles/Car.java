package Vehicles;

/**
 * @author WASYL
 */
public class Car implements VehicleAble {
    private String plate;
    private int dayPrice;

    public Car(String plate, int dayPrice) {
        this.plate = plate;
        this.dayPrice = dayPrice;
    }

    @Override
    public int getDayPrice() {
        return this.dayPrice;
    }

    @Override
    public void printInformation() {
        System.out.println("Cena dziennego wynajmu: " + this.dayPrice + " zł");
        System.out.println("Tablica rejestracyjna: " + this.plate);
    }
}
