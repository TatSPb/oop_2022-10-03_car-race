public class DriverC extends Driver<Truck>{
    /*** конструкторы
     * @param FIO
     * @param typeOfLicense
     * @param experience
     * @param typeOfCar***/
    protected DriverC(String FIO, Character typeOfLicense, int experience, Truck typeOfCar) {
        super(FIO, typeOfLicense, experience, typeOfCar);
    }
}
