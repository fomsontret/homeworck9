public class Main {
    public static void main(String[] args) {
        Logger simple = new SimpleLogger();
        simple.log("Программа запущена");

        Logger smart = new SmartLogger();
        smart.log("Программа запущена");
        smart.log("Произошла ошибка Error 404");
        smart.log("Завершение работы");
    }
}
