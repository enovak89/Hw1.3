public class Main {
    public static void main(String[] args) {
    task1();
    }

    public static void task1 () {
        byte a = 1;
        short b = 150;
        int c = 30000;
        long d = 1000_000_000;
        float e = 3.14f;
        double f = 6.28;
        System.out.println("Задача 1" + "\n" + "Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
}