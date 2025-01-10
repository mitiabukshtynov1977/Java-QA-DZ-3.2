
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.72 /* (м) */;
        double mass = 98 /* (кг) */;
        int bmi = (int) service.calculate(mass, height);
        System.out.println("Индекс массы тела" + bmi);

    }
}