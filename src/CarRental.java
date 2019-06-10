import Rent.RentBase;
import Vehicles.Car;

/**
 * @author WASYL
 */

public class CarRental {
    public static void main(String[] args) {
        RentBase rentBase = new RentBase();
        Car car1 = new Car("Scania", "S", "1FMEU17W24LA26710", "czarny", "DW ETG01", 1174740, 100);
        Car car2 = new Car("Scania", "S", "1FTCR10A4NTA25345", "niebieski", "CT ETG02", 1063811, 200);
        Car car3 = new Car("Renault", "Magnum", "1GKS2MEF8ER163641", "biały", "LU ETG03", 189220, 300);

        rentBase.addVehicle(car1);
        rentBase.addVehicle(car2);
        rentBase.addVehicle(car3);

        rentBase.rentCar(car1, 5);
        rentBase.rentCar(car2, 5);
        rentBase.rentCar(car3, 5);

        rentBase.printAvailableVehicles();
        rentBase.printAllVehicles();
        rentBase.printRentedVehicles();

        System.out.println();
        System.out.println("Zapraszamy do wynajmu!");
    }

}
