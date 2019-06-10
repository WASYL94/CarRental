import Rent.NotFoundVehicleException;
import Rent.RentBase;
import Vehicles.Car;

/**
 * @author WASYL
 */
public class CarRental {
    public static void main(String[] args) {
        RentBase rentBase = new RentBase();
        Car car = new Car("DW ETG01", 1);
        Car car2 = new Car("LU ETG03", 1500100900);

        rentBase.addVehicle(car);
        rentBase.addVehicle(car2);

        rentBase.rentCar(car, 5);

        rentBase.printAvailableVehicles();
        rentBase.printAllVehicles();
        rentBase.printRentedVehicles();

        System.out.println();
        System.out.println("Zapraszamy do wynajmu! :)");
    }

}
