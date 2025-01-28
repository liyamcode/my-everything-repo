import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num,  answer;
        boolean isprime = true;
        
        // asks user to input a number
        System.out.print("Enter a number:  ");
        num = input.nextInt();
        
        // loop starts from 2 and goes up to num-1
        for(int i = 2; i < num; i++){
            answer = num % i;
            // if number has no remainder(besides from being divided by ONLY 1 and itself) when divided by i, it is not a prime number
            if (answer == 0){
                isprime = false;
                break;
            }
        }   
        
        // if isprime is true, the number is prime
        if (isprime){
            System.out.print("your number is prime");
        } else {
            // if isprime is false, the number is not prime
            System.out.print("your number is not prime");
        }
    }
}
