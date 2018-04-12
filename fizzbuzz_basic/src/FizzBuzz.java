import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        int num1, num2;
        Scanner inNum = new Scanner(System.in);

        System.out.println("Enter low number: ");
        num1 = inNum.nextInt();

        System.out.println("Ender high number: ");
        num2 = inNum.nextInt();

        while(num2<=num1) {
            System.out.println("Enter high number (higher than first): ");
            num2 = inNum.nextInt();
        }

        inNum.close();

        for(int i=num1; i<=num2; i++) {
            if(i%15==0) {
                System.out.println("fizzbuzz");
            }
            else if(i%3==0) {
                System.out.println("fizz");
            }
            else if(i%5==0) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
