public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // task 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }

        // task 3
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // task 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int time;
        if (deliveryDistance <= 20) {
            time = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            time = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            time = 3;
        } else {
            time = -1;
        }
        if (time == -1) {
            System.out.println("Не можем доставить");
        } else {
            System.out.println("Потребуется дней: " + time + " + срок доставки");
        }

        // task 5
        System.out.println("Задание 5");
        int monthNumber = 9;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некоректный месяц: " + monthNumber);
        }
    }
}