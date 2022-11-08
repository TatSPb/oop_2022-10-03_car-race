public class Truck extends Transport{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Вставить ключ в замок зажигания, и завести двигатель грузовика");
    }

    @Override
    public void finish() {
        System.out.println("Заглушить вдигатель, вытащить ключ грузовика");
    }


}
