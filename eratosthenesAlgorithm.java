import java.util.Scanner;
public class eratosthenesAlgorithm {
    public static void main(String[] args){
        // Sieve of Eratosthenes Algorithm
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Please enter the length of the sequence of number of which you desire to see the prime numbers: ");
        number = scanner.nextInt();
        System.out.println("you chose: " + number);

        boolean[] prime = new boolean[number + 1] ;
        for (int i = 0; i <= number; i++){
            prime[i] = true;
        }
        for (int i = 2; i <Math.floor(Math.sqrt(number)); i++){
            if (prime[i]){
                for (int j = i * i; j <= number; j += i) { // Mark multiples of i as non-prime
                    prime[j] = false;
                }
            }
            else{}
        }
        System.out.println(" ");
        for (int i = 0; i < number; i ++){
            if (prime[i]){
                System.out.println(i + " is a prime number");
                System.out.println(" ");
            }
        }
        scanner.close();

    }
}
