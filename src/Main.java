public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
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

    public static void task2 () {
    float a = 27.12f;
    long b = 987678965549L;
    float c = 2.786f;
    short d = 569;
    short e = -159;
    int f = 27897;
    byte g = 67;
    }

    public static void task3 () {
        int studiesNum;
        studiesNum = 23 + 27 + 30;
        float sheetsNum = studiesNum / 480f;
        System.out.println("Задача 3" + "\n" + "На каждого ученика рассчитано листов бумаги " + sheetsNum);
    }

    public static void task4 () {
        byte prod = 8;
        byte time1 = 20;
        short time2 = 60 * 24;
        int time3 = time2 * 3;
        long time4 = time2 * 30;
        int bot1 = prod * time1;
        int bot2 = prod * time2;
        int bot3 = prod * time3;
        long bot4 = prod * time4;

        System.out.println("Задача 4" + "\n" + "За время машина произвела штук бутылок " + bot1);
        System.out.println("За время машина произвела штук бутылок " + bot2);
        System.out.println("За время машина произвела штук бутылок " + bot3);
        System.out.println("За время машина произвела штук бутылок " + bot4);
    }

    public static void task5 () {
        int wh, br, cl;
        byte sumCan = 120;
        wh = sumCan / 3;
        br = wh * 2;
        cl = wh / 2;
        System.out.println("Задача 5" + "\n" + "В школе, где " + cl + " классов, нужно " + wh + " банок белой краски и " + br + " банок коричневой краски");
    }

    public static void task6 () {
        int bananaWeight = 5 * 80;
        int milkWeight = 2 * 105;
        int icecreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        float sumWeight, sumWeightKilo;
        sumWeight = (bananaWeight + milkWeight + icecreamWeight + eggsWeight);
        sumWeightKilo = (sumWeight / 1000f);
        System.out.println("Задача 6" + "\n" + sumWeight + " " + sumWeightKilo);
    }

    public static void task7 () {
        byte weight = 7;
        float lose1 = 0.25f, lose2 = 0.5f;
        float day1, day2, daysAverage;
        day1 = (weight / lose1);
        day2 = (weight / lose2);
        daysAverage = (day1 + day2) / 2;
        System.out.println("Задача 7" + "\n" + day1 + " " + day2 + " " + daysAverage);
    }

    public static void task8 () {
        int m = 67760, d = 83690, k = 76230, mu, du, ku, md, dd, kd;
        float muf, duf, kuf;
        mu = m * 110 / 100;
        muf = m * 1.1f;
        du = d * 110 / 100;
        duf = d * 1.1f;
        ku = k * 110 / 100;
        kuf = k * 1.1f;
        System.out.println("Задача 8" + "\n" + mu + " " + du + " " + ku);
        md = mu - m;
        dd = du - d;
        kd = ku - k;
        System.out.println(md + " " + dd + " " + kd);
    }
}