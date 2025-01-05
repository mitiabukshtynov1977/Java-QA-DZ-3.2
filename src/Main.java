
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.72 /* (м) */;
        double mass = 105 /* (кг) */;
        int bmi = (int) service.calculate(mass, height);
        System.out.println("Индекс массы тела (BMI)");
        System.out.println((int) bmi);
    }
}