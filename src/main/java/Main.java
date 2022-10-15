public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 30;
        int actual = (int) service.calculate(1000, true);
        System.out.println("1. " + expected + " зарегистрированных пользователей ниже лимита " + actual);

        expected = 500;
        actual = (int) service.calculate(1_000_000, true);
        System.out.println("2. " + expected + " зарегистрированных пользователей выше лимита " + actual);

        expected = 10;
        actual = (int) service.calculate(1000, false);
        System.out.println("3. " + expected + " не зарегистрированных пользователей ниже лимита " + actual);

        expected = 500;
        actual = (int) service.calculate(1_000_000, false);
        System.out.println("4. " + expected + " не зарегистрированных пользователей выше лимита " + actual);
    }
}
