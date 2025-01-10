public class BmiService {

    public int calculate(double mass, double height) {

        double bmi = mass / (height * height);

        return (int) bmi;
    }
}
