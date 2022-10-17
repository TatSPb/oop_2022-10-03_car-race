public class Track extends Transport{

    public Track(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Завести грузовик");
    }

    @Override
    public void finish() {
        System.out.println("Заглушить грузовик");
    }


}
