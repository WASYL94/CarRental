import Rent.RentBase;
import Vehicles.Car;

/**
 * @author WASYL
 */
public class CarRental {
    public static void main(String[] args) {
        RentBase rentBase = new RentBase();
        Car car1 = new Car("DW ETG01", 100);
        Car car2 = new Car("LU ETG03", 300);

        rentBase.addVehicle(car1);
        rentBase.addVehicle(car2);

        rentBase.rentCar(car1, 5);
        rentBase.rentCar(car2, 5);

        rentBase.printAvailableVehicles();
        rentBase.printAllVehicles();
        rentBase.printRentedVehicles();

        System.out.println();
        System.out.println("Zapraszamy do wynajmu!");
    }

}
