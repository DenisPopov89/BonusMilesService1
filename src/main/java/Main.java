public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 30;
        int actual = (int) service.calculate(1_000, true);
        System.out.println("1. " + expected + " равно " + actual);

        expected = 500;
        actual = (int) service.calculate(1_000_000, false);
        System.out.println("2, " + expected + " равно " + actual);
    }
}
