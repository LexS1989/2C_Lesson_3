package skypro.ru;

public class Car extends WheelsTransport implements ServiceTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку " + (i + 1));
        }
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
    }
}

