public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Успешный старт автобуса: ключ в зажигание вставлен, двигатель заведен");
    }

    @Override
    public void finish() {
        System.out.println("Успешный финиш автобуса: двигатель заглушен, ключ из замка зажигания извлечен");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус: произведена техническая остановка, проверено техническое состояние");
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшая скорость круга у автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость круга у автобуса");
    }
}


