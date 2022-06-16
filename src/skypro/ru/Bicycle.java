package skypro.ru;

public class Bicycle extends WheelsTransport implements ServiceTransport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку " + (i + 1));
        }
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
    }
}

