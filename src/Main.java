import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

       int year = 2400;
       leapYear(year);
       int oS = 1;
       int yearPhone = 2021;
       application(oS, yearPhone);
       int kilometer = 181;
       deliveryDays(kilometer);
       int day = deliveryDays(kilometer);
       System.out.println(" Дней для доставки - " + day);
    }

    // Задание 1
    public static void leapYear(int enterYear) {
        int ourYear = enterYear;
        if (ourYear % 4 == 0 && ourYear % 100 != 0 || ourYear % 400 == 0) {
            System.out.println(ourYear + " год является високосным");
        } else {
            System.out.println(ourYear + " год не високосный");
        }
    }


    // Заание 2
    public static void application(int device, int numberYear) {
        int currentYear = LocalDate.now().getYear();
        int phoneOs = device;
        int manufacturedYear = numberYear;
        int remains = currentYear - manufacturedYear;
        if (phoneOs == 0 && remains == 0) {
            System.out.println("Установите обычную версию для IOS!");
        } else if (phoneOs == 1 && remains == 0) {
            System.out.println("Установите обычную версию для Android!");
        } else if (phoneOs == 0 && remains > 0) {
            System.out.println("Установите версию Лайт для IOS");
        } else if (phoneOs == 1 && remains > 0) {
            System.out.println("Установите версию Лайт для Android");
        } else System.out.println("Вы живёте в Будующем?");
    }

// Задание 3
   public static int deliveryDays(int kilometers) {
       int distance = kilometers;
       int standardDistance = 20;
       int standardDelivery = 1;
       int plusDay = 40;
       int deltaDay = (distance - standardDistance) % plusDay;

       if (distance > 20 && deltaDay == 0) {
           standardDelivery = standardDelivery + (distance - standardDistance) / plusDay;
           } else if (distance > 20 && deltaDay > 0) {
            standardDelivery = standardDelivery + (distance - standardDistance) / plusDay + 1;
           }
       return standardDelivery;
    }

}