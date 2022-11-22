public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {

        Car audiA8 = new Car("Audi", "A8", 3.0, TypeOfBody.COUPE);
        Car scodaFabia = new Car("Scoda", "Fabia", 1.6, TypeOfBody.SEDAN);
        Car fiat500C = new Car("Fiat", "500C", 1.1, TypeOfBody.SEDAN);
        Car opelAstra = new Car("Opel", "Astra", 1.8, TypeOfBody.HATCHBACK);

        Truck volvoFh16 = new Truck("Volvo", "FH16", 16.0, TypeOfWeight.N1);
        Truck kamaz5460 = new Truck("Kamaz", "5460", 12.0, TypeOfWeight.N2);
        Truck manTgs = new Truck("MAN", "TGS", 14.0, TypeOfWeight.N3);
        Truck belaz10 = new Truck("Belaz", "10", 15.0, TypeOfWeight.N1);

        Bus nefaz5299 = new Bus("Nefaz", "5299", 11.80, TypeOfCapacity.MEDIUM);
        Bus paz3205 = new Bus("PAZ", "3205", 12.60, TypeOfCapacity.SMALL);
        Bus liaz5256 = new Bus("LIAZ", "5256", 11.15, TypeOfCapacity.EXTRA_LARGE);
        Bus hyundaiA201 = new Bus("Hyundai", "A201", 13.00, TypeOfCapacity.LARGE);



        DriverB inp = new DriverB("Иванов Николай Петрович", 'B', 5, audiA8);
        DriverC kiv = new DriverC("Коломенский Илья Васильевич", 'C', 8, kamaz5460);
        DriverD niv = new DriverD("Насонов Игорь Валерьевич", 'D', 10, hyundaiA201);

        printInfo(inp, opelAstra);
        printInfo(kiv, kamaz5460);
        printInfo(niv, liaz5256);

        System.out.println("\nДанные по диагностике:" );
        service(
                audiA8, scodaFabia, fiat500C, opelAstra,
                volvoFh16, kamaz5460, manTgs, belaz10,
                nefaz5299, paz3205, liaz5256, hyundaiA201
        );
    }


    private static void printInfo(Driver<?> driver, Transport transport) {
        System.out.println(
                "Водитель " + driver.getFIO() + " "
                        + "управляет " + transport.getBrand() + " " + transport.getModel() + " "
                        + "и будет участвовать в заезде."

        );
        transport.printType();
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " "
                        + transport.getModel() + " не прошел диагностику");
            }
        }catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
    }
