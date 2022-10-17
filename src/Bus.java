public class Bus extends Transport{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Завести автобус");
    }

    @Override
    public void finish() {
        System.out.println("Заглушить автобус");
    }
}


