public class Car extends Transport{

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Завести машину");
    }

    @Override
    public void finish() {
        System.out.println("Заглушить машину");
    }
}
