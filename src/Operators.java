import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Сколько человек придет в ресторан?");

        int numberOfPeople = myScanner.nextInt();

        if (numberOfPeople > 100) {
            System.out.println("Не хватает мест");

        } else {
            System.out.println("Достаточно мест");
        }
    }
}