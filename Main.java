import java.util.*;

public class Main {

    public static void checkOddEven(int number) {
        if (number % 2 != 0) {
            System.out.printf("%d is an Odd Number", number);
        }
        else {
            System.out.printf("%d is an Even Number", number);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        checkOddEven(number);
        sc.close()
    }
}