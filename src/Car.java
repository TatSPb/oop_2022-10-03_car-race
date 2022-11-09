public class Car extends Transport implements Competing{

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Успешный старт машины: ключ в зажигание вставлен, двигатель заведен");
    }

    @Override
    public void finish() {
        System.out.println("Успешный финиш машины: двигатель заглушен, ключ из замка зажигания извлечен");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль: произведена техническая остановка, заменена шина");
    }

    @Override
    public void lapTime() {
        System.out.println("Лучшая скорость круга у автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость круга у автомобиля");
    }
}
