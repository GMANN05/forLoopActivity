import java.util.Scanner;

public class distanceTravled {
    public static void main(String[] args) {
        int speed, time, distance;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed of the vehicle in mph:");
        speed = scanner.nextInt();
        System.out.println("Enter how long you are traveling for:");
        time = scanner.nextInt();

        for (int i = 1; i <= time; i++){
            distance = (speed * i);
            System.out.printf("Hour---------Distance Traveled\n");
            System.out.println(i + "                " + distance);

        }


    }
}
