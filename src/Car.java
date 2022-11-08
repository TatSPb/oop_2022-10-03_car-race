public class Car extends Transport{

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Вставить ключ в замок зажигания, запустить двигатель машины");
    }

    @Override
    public void finish() {
        System.out.println("Выключить зажигание, заглушить двигатель, вынуть ключ, покинуть машину");
    }
}
