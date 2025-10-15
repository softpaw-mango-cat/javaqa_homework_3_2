public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.65;
        double weightKilos = 55;
        System.out.println("Индекс массы тела: " +
                service.calculate(heightMeters, weightKilos));
    }
}
