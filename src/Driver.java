public abstract class Driver<T extends Transport & Competing> {

    private final String FIO;
    private final Character typeOfLicense;
    private int experience;
    private T typeOfCar;


    /*** конструкторы ***/
    protected Driver(String FIO, Character typeOfLicense, int experience, T typeOfCar) {
        if (FIO == null || FIO.isEmpty()) {
            throw new NullPointerException("Укажите ФИО водителя");
        } else {
            this.FIO = FIO;
        }

        if (typeOfLicense != 'D' && typeOfLicense != 'B' && typeOfLicense != 'C' & typeOfLicense != '0') {
            throw new NullPointerException("Отсутствует право управления а/м");
        } else {
            this.typeOfLicense = typeOfLicense;
        }

        if (typeOfCar != null) {
            this.typeOfCar = typeOfCar;
        }

        setExperience(experience);
    }
    /*** *** ***/

    /*** методы ***/
    public void startMovement() {
        System.out.println("Водитель " + FIO + " начинает движение " + typeOfCar.getBrand() + " " + typeOfCar.getModel());
    }

    public void stopMovement() {
        System.out.println("Водитель " + FIO + " останавливает движение " + typeOfCar.getBrand() + " " + typeOfCar.getModel());
    }

    public void refuel() {
        System.out.println("Водитель " + FIO + " заправляет " + typeOfCar.getBrand() + " " + typeOfCar.getModel());
    }

    public void driverInfo() {
        System.out.println("Водитель " + getFIO() + " управляет " + typeOfCar.getBrand() + " "+ typeOfCar.getModel() + " " +
                "и будет участвовать в заезде.");
    }


    /*** *** ***/


    /*** геттеры и сеттеры ***/
    public String getFIO() {
        return FIO;
    }

    public Character getTypeOfLicense() {
        return typeOfLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            throw new NullPointerException("Отсуствует стаж вождения");
        } else {
            this.experience = experience;
        }
    }

    public T getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(T typeOfCar) {
        this.typeOfCar = typeOfCar;
    }
/*** *** ***/

}
