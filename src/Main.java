
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.87 /* (м) */;
        int m = 98 /* (кг) */;
        double index = service.calculate(m, h);
        System.out.println((int) index);
    }
}