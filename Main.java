import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Variables
            double numberChoosed; // Input for validation (0 - 10_000)
        // Logic Prime Number
        // While(True)
        while(true){
            System.out.println("Choose the number: ");
            numberChoosed = scanner.nextDouble();

            try {
                if (numberChoosed < 0 || numberChoosed > 10_000 || numberChoosed != scanner.nextDouble()){
                    throw new NumberFormatException("Invalid input!");
                }else {
                    break;
                }
                System.out.println("Invalid Number!Only numb
            } catch (NumberFormatException e) {
                er and [0 - 10.000]");
            }
        }
    }
}
