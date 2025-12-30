public class Main {
    public static void main(String[] args) {

        SimpleAccount simple = new SimpleAccount(1000);
        System.out.println("Баланс простого счета: " + simple.getBalance()); // 1000


        simple.pay(500);
        System.out.println("После покупки 500: " + simple.getBalance()); // 500


        simple.add(300);
        System.out.println("После пополнения 300: " + simple.getBalance()); // 800


        CreditAccount credit = new CreditAccount(1000);
        System.out.println("\nБаланс кредитного счета: " + credit.getBalance()); // 0
        System.out.println("Кредитный лимит: " + credit.getCreditLimit()); // 1000


        credit.pay(500);
        System.out.println("После покупки 500: " + credit.getBalance()); // -500


        boolean success = credit.pay(600);
        System.out.println("Покупка 600: " + success + ", баланс: " + credit.getBalance()); // false, -500


        credit.add(200);
        System.out.println("После пополнения 200: " + credit.getBalance()); // -300


        success = credit.add(400);
        System.out.println("Пополнение 400: " + success + ", баланс: " + credit.getBalance()); // false, -300


        System.out.println("\nПеревод 300 с простого на кредитный:");
        boolean transferSuccess = simple.transfer(credit, 300);
        System.out.println("Перевод успешен: " + transferSuccess);
        System.out.println("Баланс простого: " + simple.getBalance()); // 500
        System.out.println("Баланс кредитного: " + credit.getBalance()); // 0
    }
}