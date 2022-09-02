import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int currentYear = LocalDate.now().getYear();
        DetermineKindOfYear(currentYear);

        //Задание 2
        int clientOs = 0;
        int clientDeviceYear = 2022;
        selectVersion(clientOs,clientDeviceYear);

        //Задание 3
        int deliveryDistance = 61;
        DetermineDeliveryDistance(deliveryDistance);

    }
    //Задание 1 (метод решения)
    public static void DetermineKindOfYear(int currentYear) {
        if ((currentYear % 4) == 0 && (currentYear % 100) != 0 || (currentYear % 400) == 0 ) {
            System.out.println(currentYear + "год является високосным");}
        else {System.out.println(currentYear + "год не является високосным");}
    }
    //Задание 2 (метод решения)
    public static void selectVersion(int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear < LocalDate.now().getYear())
        { System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOs == 1 && clientDeviceYear < LocalDate.now().getYear())
        { System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else if (clientOs == 0 && clientDeviceYear >= LocalDate.now().getYear())
        { System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOs == 1 && clientDeviceYear >= LocalDate.now().getYear())
        { System.out.println("Установите версию приложения для Android по ссылке");}
    }
    //Задание 3 (метод решения)
    public static void DetermineDeliveryDistance(int deliveryDistance) {
        if(deliveryDistance <= 20) {
            System.out.println( "Потребуется дней: " + (1+((deliveryDistance - 20) / 40)));}
        else if(deliveryDistance > 20) {
            System.out.println( "Потребуется дней: " + (2+((deliveryDistance - 20) / 40)));}

        //Или так
        //int day = 0;
        //for (int i = 20; i <= deliveryDistance + 40 ; i= i+40) {
//            day++;}
//            System.out.println("Потребуется дней: " + day);

    }




}