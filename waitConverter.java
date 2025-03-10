import java.util.Scanner;

public class waitConverter{
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
        System.out.println("        Welcome to the weight convertor        ");
        System.out.println(" ");
        System.out.println(" ");

        double weight;
        String unit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weights: ");
        weight = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Please specify the unit(KG / LBS): ");
        unit = scanner.nextLine();

        if (!(unit.equalsIgnoreCase("KG") || unit.equalsIgnoreCase("LBS"))){
            while (!(unit.equalsIgnoreCase("KG") || unit.equalsIgnoreCase("LBS"))) {
                System.out.print("Please ensure you entered the right unit (KG or LBS): ");
                unit = scanner.nextLine();
            }
        }

        if (unit.equalsIgnoreCase("KG")){
            unit = "LBS";
            weight = weight * 2.2;
            System.out.printf("Your weight in %s is %.2f\n", unit , weight);
        }
        else if(unit.equalsIgnoreCase("LBS")){
            unit = "KG";
            weight = weight / 2.2;
            System.out.printf("Your weight in %s is %.2f", unit , weight);
        }
   
        scanner.close();
    }
}