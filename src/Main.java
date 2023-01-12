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
    public static void task1() {
        System.out.println("Задача №1");
        int money = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000){
            total = total + money;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача №2");
        int x = 0;
        while (x < 10){
            x = x + 1;
            System.out.print(x);
        }
        System.out.println();
        for (int i = 10; i > 0; i = i - 1){
            System.out.print(i);
        }
    }
    public static void task3() {
        System.out.println();
        System.out.println("Задача №3");
        int population = 12000000;
        int fertility = 17;
        int mortality = 8;
        int people = 1000;
        for (int i = 2000; i <= 2010; i++){
                people = people + fertility - mortality;
                population = population + people;
            System.out.println("Год " + i + " численность населения составляет " + population);
            }
        }
    public static void task4() {
        System.out.println("Задача №4");
        int salary = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total/100 * 7;
            total = total + salary;
                System.out.println("Месяц " + i + " Итого " + total);
            }

        }
    public static void task5() {
        System.out.println("Задача №5");
        int salary = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total / 100 * 7;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }
    public static void task6() {
        System.out.println("Задача №6");
        int salary = 15000;
        int total = 0;
        for (int i = 0; i < 108; i++) {
            total = total + total / 100 * 7;
            total = total + salary;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача №7");
        for (int i = 5; i <= 31; i++) {
            if (i == 5 || i == 12 || i == 19 || i == 26) {
                System.out.println("Сегодня пятница, " + i + " -е число");
            }
        }
    }
    public static void task8() {
        System.out.println("Задача №8");
        int thsYear = 2017;
        int pastYears = thsYear - 200;
        int possibleYear = thsYear + 100;
        for (; pastYears < possibleYear; pastYears = pastYears + 79){
            System.out.println("Комета пролетит над землей через " + pastYears + " лет");
        }
        while (pastYears < possibleYear){
            System.out.println(pastYears);
            pastYears = pastYears + 79;
        }
    }
}