
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87 /* (м) */;
        double mass = 102 /* (кг) */;
        double index = service.calculate(mass, height);
        System.out.println((int) index);
    }
}