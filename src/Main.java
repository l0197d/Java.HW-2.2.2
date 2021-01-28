public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Bmi = service.calculate (96, 183);
        System.out.println(Bmi);
    }
}