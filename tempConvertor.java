import java.util.Scanner;

public class tempConvertor{
    public static void main(String[] args){
        /*WEIGHT CONVERTOR
         User enters weight
         User enter unit
         IF user enter kg
         convert to lbs using the ratio
         If user enter lbs
         convert to kg using the ratio
        */
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Welcome to the temperature convertor        ");
        System.out.println(" ");
        System.out.println(" ");

        double temperature;
        String unit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter the unit of measurement (C/F, please note that the default is C): ");
        unit = scanner.nextLine();

        unit = (unit.equalsIgnoreCase("C")) ? "F" : "C";

        temperature = (unit.equalsIgnoreCase("C")) ? (temperature - 32)/1.8 : (temperature * 1.8) + 32;


        System.out.println(" ");
        System.out.printf("The temperature is %.1fº%s\n", temperature, unit);



        
        scanner.close();
    }
}
