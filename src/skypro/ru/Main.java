package skypro.ru;

public class Main {

    public static void main(String[] args) {
        ServiceTransport car = new Car("car1", 4);
        ServiceTransport car2 = new Car("car2", 4);

        ServiceTransport truck = new Truck("truck1", 6);
        ServiceTransport truck2 = new Truck("truck2", 8);

        ServiceTransport bicycle = new Bicycle("bicycle1", 2);
        ServiceTransport bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck2);
        station.check(truck);
    }
}

