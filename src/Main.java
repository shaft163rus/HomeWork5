public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;
        //int clientDeviceYear = 2015;

        switch (clientOS) {
           case 0:
               System.out.println("Установите версию приложения для iOS по ссылке");
               break;
           case 1:
               System.out.println("Установите версию приложения для Android по ссылке");
               break;
            }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;

        if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch(clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }

        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2023;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year +" - високосный год");
        }
        else if (year % 400 == 0 ) {
            System.out.println(year +" - високосный год");
        } else {
            System.out.println(year +" - невисокосный год");
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 195;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 3;
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Такого месяца нет");
            return;
        }
        switch (monthNumber) {
            case (12):
            case (1):
            case (2):
                System.out.println("Зима");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println("Весна");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("Лето");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println("Осень");
                break;
        }

    }

}


