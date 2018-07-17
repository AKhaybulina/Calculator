import java.util.Scanner;

/** Калькулятор
 * Осуществляет сложение дробных чисел
 * @author Khaybulina Anna
 */

public class Calc {
    /**
     * Операция сложение
     * @param FirstNumber Первое слагаемое
     * @param SecondNumber Второе слагаемое
     */
    public static float plus (float FirstNumber, float SecondNumber) {
        return FirstNumber + SecondNumber;
    }

public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Ввод пользователем первого слагаемого
    System.out.println("Enter the first number:");
    Float FirstNumber = scanner.nextFloat();

    //Ввод пользователем второго слагаемого
    System.out.println("Enter the second number:");
    Float SecondNumber = scanner.nextFloat();

    //Вывод суммы чисел
    System.out.printf("Sum is: %.4f", plus(FirstNumber, SecondNumber));
}



}

