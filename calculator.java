import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        String operation = scanner.nextLine();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        double result;
        scanner.nextLine();

        switch (operation) {
            case "+":

                result = firstNumber + secondNumber;
                System.out.printf("%.3f %s %.3f = %.3f\n",firstNumber, operation, secondNumber, result);
                break;

            case "-":

                result = firstNumber - secondNumber;
                System.out.printf("%.3f %s %.3f = %.3f\n",firstNumber, operation, secondNumber, result);    
                break;

            case "*":

                result = firstNumber * secondNumber;
                System.out.printf(" %.3f %s % .3f = % .3f\n",firstNumber, operation, secondNumber, result);    
                break;

            case "/":
                if (secondNumber == 0){
                    System.out.println("ERROR: Cannot divide by zero!\n");
                }
                else{
                result = firstNumber / secondNumber;
                System.out.printf("% .3f %s % .3f = % .3f\n",firstNumber, operation, secondNumber, result);    
                }
                break;

            case "^":

                result = Math.pow(firstNumber, secondNumber);
                System.out.printf("% .3f %s % .3f = % .3f\n",firstNumber, operation, secondNumber, result);    
                break;

            default:

                System.out.println("this operation is not supported by our calculator. Please try again with one of these values (+, -, *, /, ^)\n");
                break;
        }
        scanner.close();
    }
}
