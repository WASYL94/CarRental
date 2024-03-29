package Rent;

import Vehicles.VehicleAble;

/**
 * @author WASYL
 */

abstract class RentedVehicle {
    private final VehicleAble vehicle;
    private final int rentDays;
    private int rentPrice;

    RentedVehicle(VehicleAble vehicle, int days) {
        this.vehicle = vehicle;
        this.rentDays = days;
        calculatePrice();
    }

    private void calculatePrice() {
        this.rentPrice = this.vehicle.getDayPrice() * this.rentDays;
    }

    VehicleAble getVehicle() {
        return this.vehicle;
    }

    void printInformation() {
        this.vehicle.printInformation();
        System.out.println("Dni wynajmu: " + this.rentDays);
        System.out.println("Koszt wynajmu: " + this.rentPrice + " zł");
    }
}
