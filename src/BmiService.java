public class BmiService {

    public double calculate(double mass, double height) {

        int bmi = (int) (mass / (height * height));

        return (int) bmi;
    }
}
