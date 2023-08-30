// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание №1");
        int iOS1 = 0;
        int android = 1;

        int clientOS1 = 0;

        if ( clientOS1 == android ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание №2");

        int iOS = 0;
        int adroid = 1;
        int clientDeviceYear = 2016;
        int clientOS = 1;

        if ( clientOS == iOS && clientDeviceYear >= 2015 ) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ( clientOS == iOS && clientDeviceYear < 2015 ) {
              System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if ( clientOS == adroid && clientDeviceYear >= 2015 ){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задание №3");
           int year =2400;
           int firstLeapYear = 1584;

           if ( year % 4 == 0 &&  year % 100 != 0 && year % 400 == 0   && year >= firstLeapYear ){
        System.out.println( year + " год является високосным");}
           else  {
               System.out.println(year + " год не является високосным");
           }
        System.out.println("Задание №5");

           int deliveryDistance = 5;
           if ( deliveryDistance < 20 ) {
               System.out.println("Потребуется 1 день");}
           else if ( deliveryDistance >= 20 && deliveryDistance < 60 ) {
                   System.out.println("Потребуется 2 дня");}
           else if ( deliveryDistance >=60 && deliveryDistance < 100 ) {
               System.out.println("Потребуется 3 дня");}
           else {
               System.out.println("Доставки нет");
           }

        System.out.println("Задание 6");

        int monthNumber = 16;
        switch (monthNumber) {
            case 12,1,2:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Осень");
                break;
            case 9,10,11:
                System.out.println("З");
                break;
            default:
                System.out.println("Erorr");

        }
      }


    }
