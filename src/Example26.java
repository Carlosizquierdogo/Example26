import java.util.Scanner;
public class Example26 {
    public static void main(String[] args) {
        int number;
        System.out.println("Please type the number that you want to read its divisors  ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number = inputValue.nextInt();
        for(int i = 1; i < number; i++) {
           if (number % i == 0)
            System.out.println("  " + i);
        }
    }
}