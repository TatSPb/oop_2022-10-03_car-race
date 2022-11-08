public class Bus extends Transport{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Вставить ключ в замок зажигания, и завести двигатель автобуса");
    }

    @Override
    public void finish() {
        System.out.println("Выключить зажигание, вытащить ключ и покинуть автобус");
    }
}


