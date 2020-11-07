public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double indexmass = service.calculate(100,200);
        System.out.println(indexmass);
    }
}
