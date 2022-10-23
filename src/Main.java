import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int task(int taskNum) {
        System.out.println();
        System.out.println();
        System.out.println("Task №" + taskNum);
        return taskNum;
    }

    public static void task1() {
        task(1);
        isNotLeap(100);
    }

    public static boolean isNotLeap(int year) {
        boolean notLeap = year % 100 == 0 && year % 4 != 0 || year % 100 == 0 && year % 400 != 0;
        System.out.printf("The year %d is ", year);
        if (notLeap) {
            System.out.print("not leap");
        } else {
            System.out.println("leap");
        }
        return notLeap;
    }

    public static int defineOs(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015) {
            if (clientOS == 1) {
                System.out.print("Install the app for Android by the link, please!");
            }
            if (clientOS == 0) {
                System.out.print("Install the app for IOS by the link, please!");
            }
        } else {
            if (clientOS == 1) {
                System.out.print("Install the light version of Android by the link, please!");
            }
            if (clientOS == 0) {
                System.out.print("Install the light version of IOS by the link, please!");
            }
        }
        notProvided(clientOS);
        return clientOS;
    }

    public static int notProvided(int clientOS) {
        if (clientOS >= 2 || clientOS < 0) {
            System.out.println("Your OS is not provided! There is only apps for Android or IOS.");
        }
        return clientOS;
    }

    public static void task2() {
        task(2);
        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        defineOs(clientOS, clientDeviceYear);
    }

    public static int cardDeliveryDays(int deliveryDistance) {
        boolean day = deliveryDistance < 20;
        boolean plusDay = deliveryDistance >= 20 && deliveryDistance <= 60;
        boolean plusTwo = deliveryDistance > 60 && deliveryDistance <= 100;
        if (day) {
            System.out.println("It takes 1 day to deliver the card.");
        } else if (plusDay) {
            System.out.println("It takes 2 days to deliver the card.");
        } else if (plusTwo) {
            System.out.println("It takes 3 days to deliver the card.");
        } else {
            System.out.println("It takes more than 3 days to deliver the card.");
        }
        return deliveryDistance;
    }

    public static void task3() {
        task(3);
        int deliveryDistance = 60;
        cardDeliveryDays(deliveryDistance);
    }

}




