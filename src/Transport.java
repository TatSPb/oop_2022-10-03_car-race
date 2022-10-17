public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Укажите бренд";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Укажите бренд";
        } else {
            this.model = model;
        }

        if (engineVolume < 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

        /** методы **/
        public abstract void start ();
        public abstract void finish ();

        /** геттеры и сеттеры **/
        public String getBrand () {
            return brand;
        }

        public String getModel () {
            return model;
        }

        public double getEngineVolume () {
            return engineVolume;
        }

}