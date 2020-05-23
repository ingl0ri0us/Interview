package Lesson_3.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

        int maxNumber = 17712;
        int f0 = 0;
        int f1 = 1;
        int currentNumber = 0;

        System.out.print(f0 + ", " + f1 + ", ");

        while (true) {
            currentNumber = f0 + f1;
            if(currentNumber > maxNumber) break;
            System.out.print(currentNumber + ", ");
            f0 = f1;
            f1 = currentNumber;
         }
    }
}
