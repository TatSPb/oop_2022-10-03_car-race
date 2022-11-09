public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Успешный старт грузовика: ключ в зажигание вставлен, двигатель заведен");
    }

    @Override
    public void finish() {
        System.out.println("Успешный финиш грузовика: двигатель заглушен, ключ из замка зажигания извлечен");
    }


    @Override
    public void pitStop() {
        System.out.println("Грузовик: произведена техническая остановка, залито топливо");
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшая скорость круга у грузовика");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость круга у грузовика");
    }
}
