public class BmiService {

    public int calculate(double heightMeters, double weightKilos) {
        return (int) (weightKilos / (heightMeters * heightMeters));
    }
}
