package Rent;

import Vehicles.VehicleAble;

import java.util.ArrayList;

/**
 * @author TheArczi
 */
public class RentBase {
    private ArrayList<VehicleAble> vehicles;
    private ArrayList<RentedVehicle> rentVehicles;

    public RentBase() {
        this.vehicles = new ArrayList<>();
        this.rentVehicles = new ArrayList<>();
    }

    private ArrayList<VehicleAble> getFreeVehicles() {
        ArrayList<VehicleAble> freeVehicles = new ArrayList<>(this.vehicles);
        for (RentedVehicle rentVehicle : rentVehicles) {
            freeVehicles.remove(rentVehicle.getVehicle());
        }
        return freeVehicles;
    }

    public void addVehicle(VehicleAble vehicle) {
        this.vehicles.add(vehicle);
    }

    private void checkAvailableVehicle(VehicleAble vehicle) throws NotFoundVehicleException {
        if (!this.getFreeVehicles().contains(vehicle)) {
            throw new NotFoundVehicleException();
        }
    }

    public void rentCar(VehicleAble vehicle, int days) {
        try {
            checkAvailableVehicle(vehicle);
            RentedVehicle rentCar = new RentCar(vehicle, days);
            this.rentVehicles.add(rentCar);
        } catch (NotFoundVehicleException e) {
            System.out.println("\u001B[31mPojazd nie jest dostępny!");
            vehicle.printInformation();
            System.out.println("------------------------------");
            e.printStackTrace();
            System.exit(0);
        }
    }


    public void printAvailableVehicles() {
        System.out.println("------------------------------");
        System.out.println("Dostępne pojazdy: ");
        if (!this.getFreeVehicles().isEmpty()) {
            for (VehicleAble vehicleAble : this.getFreeVehicles()) {
                vehicleAble.printInformation();
                System.out.println();
            }
        } else {
            System.out.println("- BRAK - ");
            System.out.println();
        }
    }

    public void printAllVehicles() {
        System.out.println("------------------------------");
        System.out.println("Wszystkie pojazdy: ");
        if (!this.vehicles.isEmpty()) {
            for (VehicleAble vehicleAble : this.vehicles) {
                vehicleAble.printInformation();
                System.out.println();
            }
        } else {
            System.out.println("- BRAK - ");
            System.out.println();
        }
    }

    public void printRentedVehicles() {
        System.out.println("------------------------------");
        System.out.println("Wynajęte pojazdy: ");
        if (!this.rentVehicles.isEmpty()) {
            for (RentedVehicle rentedVehicle : this.rentVehicles) {
                rentedVehicle.printInformation();
                System.out.println();
            }
        } else {
            System.out.println("- BRAK - ");
            System.out.println();
        }
    }

}
