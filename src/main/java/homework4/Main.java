package homework4;


import homework4.phones.inheritors.Androids;
import homework4.phones.inheritors.Fuchsia;
import homework4.phones.inheritors.IPhones;
import homework4.vehicles.inheritors.Bus;
import homework4.vehicles.inheritors.Car;
import homework4.vehicles.inheritors.Motorbike;

public class Main {
    public static void main(String[] args) {
        sampleWithPhones();

        System.out.println("-------------------------------------");

        sampleWithVehicle();
    }

    private static void sampleWithVehicle() {
        Motorbike motorbike = new Motorbike("Honda", 2021, 1000, "petrol", "street", 220);
        motorbike.drive();
        motorbike.refuel();
        motorbike.wash();
        motorbike.callMotorbikeTaxi();

        System.out.println();

        Car car = new Car("KIA", 2022, 1.6, "petrol", "red", "crossover");
        car.drive();
        car.refuel();
        car.wash();
        car.callCarTaxi();

        System.out.println();

        Bus bus = new Bus("Isuzu", 2020, 5193, "diesel", "Japan", 30);
        bus.drive();
        bus.refuel();
        bus.wash();
        bus.bookBus();
        System.out.println("----------------------------------");
    }

    private static void sampleWithPhones() {
        IPhones iPhones = new IPhones("iPhone 13 Pro", "silver", 2021, 12, "multi-touch");
        iPhones.call();
        iPhones.internet();
        iPhones.sms();
        iPhones.openSafari();

        System.out.println();

        Androids androids = new Androids("Samsung Galaxy S21 ", "black", 2021, 12, 6.4);
        androids.call();
        androids.internet();
        androids.sms();
        androids.openChrome();

        System.out.println();


        Fuchsia fuchsia = new Fuchsia("Unnown ", "black", 2022, 1, "Fuchsia OS ");
        fuchsia.call();
        fuchsia.internet();
        fuchsia.sms();
        fuchsia.openChromeFuchsiaOS();

        System.out.println();
    }
}
