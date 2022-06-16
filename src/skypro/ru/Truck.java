package skypro.ru;

public class Truck extends WheelsTransport implements ServiceTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку " + (i + 1));
        }
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}

