import java.util.Scanner;
public class ticTacToe{

    public static boolean GameOver(String Array[]){
        //top-row
        if (!Array[0].trim().isEmpty() && Array[0].equals(Array[1]) && Array[1].equals(Array[2])) {  
            System.out.printf("The winner is player %s!", Array[0]);
            return true;
        }

        //left-column
        else if (!Array[0].trim().isEmpty() && Array[0].equals(Array[3]) && Array[3].equals(Array[6])) {  
            System.out.printf("The winner is player %s!", Array[0]);
            return true;
        }

        //diagonal top left to bottom right
        else if (!Array[0].trim().isEmpty() && Array[0].equals(Array[4]) && Array[4].equals(Array[8])) {  
            System.out.printf("The winner is player %s!%n", Array[0]);
            return true;
        }

        //middle collumn
        else if (!Array[1].trim().isEmpty() && Array[1].equals(Array[4]) && Array[4].equals(Array[7])) {  
            System.out.printf("The winner is player %s!%n", Array[1]);
            return true;
        }

        //right column
        else if (!Array[2].trim().isEmpty() && Array[2].equals(Array[5]) && Array[5].equals(Array[8])) {  
            System.out.printf("The winner is player %s!%n", Array[2]);
            return true;
        }
        
        //middle-row
        else if (!Array[3].trim().isEmpty() && Array[3].equals(Array[4]) && Array[4].equals(Array[5])) {  
            System.out.printf("The winner is player %s!%n", Array[3]);
            return true;
        }

        //bottom-row
        else if (!Array[6].trim().isEmpty() && Array[6].equals(Array[7]) && Array[7].equals(Array[8])) {  
            System.out.printf("The winner is player %s!%n", Array[6]);
            return true;
        }

        //if a spot is empty it means you can still play thus game over is false
        for (int i = 0; i < Array.length; i++) {
            if (Array[i].trim().isEmpty()){
                return false;
            }
            
        }
        //No more spot and no condition is satisfied so by default the game is Over
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("!!Game over!!");
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("########## WELCOME TO TIC-TAC-TOE ##########");
        System.out.println(" ");
        System.out.println(" ");
        String x11 = " ";
        String x12 = " ";
        String x13 = " ";
        String x21 = " ";
        String x22 = " ";
        String x23 = " ";
        String x31 = " ";
        String x32 = " ";
        String x33 = " ";

        String values[] = {x11, x12, x13, x21, x22, x23, x31, x32, x33};
        String[][] valuePosition = {
            {values[0], "top-left"},
            {values[1], "top-center"},
            {values[2],"top-right"},
            {values[3], "middle-left"},
            {values[4], "middle-center"},
            {values[5],"middle-right"},
            {values[6], "bottom-left"},
            {values[7], "bottom-center"},
            {values[8],"bottom-right"},
        };
        String options[] = {"X", "O"};

        System.out.printf("                | %s | %s | %s |\n", x11, x12, x13);
        System.out.println("                +-----------+");
        System.out.printf("                | %s | %s | %s |\n", x21, x22, x23);
        System.out.println("                +-----------+");
        System.out.printf("                | %s | %s | %s |\n", x31, x32, x33);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Rules:");
        System.out.println("The X player, plays first:");
        System.out.println("To choose a position you can enter one of the following: top-left, top-center, top-right, middle-left, middle-center, middle-right, bottom-left, bottom-center, bottom-right");
        System.out.println("Follows classical tic tac toe.");

        System.out.println(" ");
        System.out.println(" ");
        int i = 0;

        while (! GameOver(values)) {

            System.out.printf("Enter the position where you would like to play (Player %s): ", options[i]);
            String position = scanner.nextLine();
            boolean validPosition = false;
            for (int n = 0; n < valuePosition.length; n ++){
                if (position.equals(valuePosition[n][1])){
                    validPosition = true;
                    break;
                }
            }

            if (validPosition){
                for (int j = 0; j < valuePosition.length; j ++){
                    if (valuePosition[j][1].equals(position.trim())){
                        if (values[j] == "X" || values[j] == "O"){
                            System.out.println("This position has already been played choose an other one.");
                        }
                        else{
                            values[j] = options[i];
                            if ( i == 0){
                                i++;
                            }
                            else{
                                i = 0;
                            }
                        }
                    }
                
                }
                System.out.println("");
                System.out.println("");
                System.out.printf("                | %s | %s | %s |\n", values[0], values[1], values[2]);
                System.out.println("                +-----------+");
                System.out.printf("                | %s | %s | %s |\n", values[3], values[4], values[5]);
                System.out.println("                +-----------+");
                System.out.printf("                | %s | %s | %s |\n", values[6], values[7], values[8]);
                System.out.println("");
                System.out.println("");
            }
            else{
                System.out.println("");
                System.out.println("");
                System.out.println("Please ensure you have entered one of the following positions: \n \ntop-left, top-center, top-right,\nmiddle-left, middle-center, middle-right,\nbottom-left, bottom-center, bottom-right\n\n");
            }

        }

        scanner.close();
    }

}