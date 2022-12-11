public class Main {
    public static void main(String[] args) {
   task1();
   task2();
   task3();
   task4();
   task5();
   }
    public static void task1() {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Вы где-то ошиблись");
        }
    }
        public static void task3(){
            System.out.println("Задание 3");
            int  year = 2024;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println("Год " + year + " является високосным.");
            } else {
                System.out.println("Год " + year + " является невисокосным.");
            }
        }
    public static void task4() {
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance < 20 && day == 1) {
            System.out.println("Потребуется дней:" + day);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:" + (day + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней:" + (day + 2));
        } else {
            System.out.println(" доставки нет");
        }
    }
        public static void task5(){
            System.out.println("Задание 5");
            int monthNumber = 12;
            switch (monthNumber){
                case 1:
                case 2:
                case 12:
                    System.out.println("зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("лето");
                case 9:
                case 10:
                case 11:
                    System.out.println("осень");
                    break;
                default:
                    System.out.println("такого месяца нет");
            }
    }
}