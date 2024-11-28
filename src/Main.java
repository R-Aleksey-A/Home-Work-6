public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Home Work-6");
        }
        {
            System.out.println("Задание-1");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        {
            System.out.println("Задание-2");
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        {
            System.out.println("Задание-3");
        }
        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
        }
        {
            System.out.println("Задание-4");
        }
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        {
            System.out.println("Задание-5");
        }
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным».");
        }
        {
            System.out.println("Задание-6");
        }
        for (int number = 7; number <= 98; number = number + 7) {
            System.out.println(number);
        }
        {
            System.out.println("Задание-7");
        }
        for (int number = 2; number <= 512; number = number * 2) {
            System.out.println(number);
        }
        {
            System.out.println("Задание-8");
        }
        int money = 29000;
        int accumulated = 0;
        for (int month = 1; month <= 12; month++) {
            accumulated = accumulated + money;
            System.out.println("«Месяц " + month + " сумма накоплений равна " + accumulated + " рублей».");
        }
        {
            System.out.println("Задание-9");
        }

        int money1 = 29000;
        int accumulatedBank = 0;
        for (int month = 0; month <= 12; month++) {
            accumulatedBank = accumulatedBank + accumulatedBank / 100;
            accumulatedBank = accumulatedBank + money1;
            System.out.println("«Месяц " + month + " сумма накоплений равна " + accumulatedBank + " рублей».");
        }
        {
            System.out.println("Задание-10");
        }

int number=2;
int sum=0;
        for (int i = 2; i <= 10; i++) { sum=number*i;

            System.out.println(+number+"*"+i+"="+sum);
        }
    }
}