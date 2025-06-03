import java.util.*;
import java.lang.Math;
public class App{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to the Calculator!");
        try{
            do{
                System.out.println("What would you like to do?");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("6. Square Root");
                System.out.println("7. Power");
                System.out.println("8. Factorial");
                System.out.println("9. Modulus");
                System.out.println("10. Logarithm");
                System.out.println("11. Convert celsius to Fahrenheit");
                System.out.println("12. Convert Fahrenheit to Celsius");
                System.out.println("13. Convert INR to USD");
                System.out.println("14. Convert USD to INR");
                System.out.println("15. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1: //Addition
                        System.out.println("Enter number of elements to add:");
                        int n = sc.nextInt();
                        System.out.println("The sum is: " + Addition(n));
                        break;
                    case 2: //Subtraction
                        System.out.println("Enter number of elements to subtract:");
                        n = sc.nextInt();
                        System.out.println("The difference is: " + Subtraction(n));
                        break;
                    case 3: //Multiplication
                        System.out.println("Enter number of elements to multiply:");
                        n = sc.nextInt();
                        System.out.println("The product is: " + Multiplication(n));
                        break;
                    case 4: //Division    
                        System.out.println("Enter two numbers to divide:");
                        double num1 = sc.nextDouble();
                        double num2 = sc.nextDouble();
                        if (num2 != 0) {
                            System.out.println("The result is: " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    case 6: //Square Root    
                        System.out.println("Enter a number to find its square root:");
                        double num = sc.nextDouble();
                        if (num >= 0) {
                            System.out.println("The square root is: " + Math.sqrt(num));
                        } else {
                            System.out.println("Error: Cannot find square root of a negative number.");
                        }
                        break;
                    case 7: //Power
                        System.out.println("Enter base and exponent:");
                        double base = sc.nextDouble();
                        double exponent = sc.nextDouble();
                        System.out.println("The result is: " + Math.pow(base, exponent));
                        break;
                    case 8: //Factorial
                        System.out.println("Enter a number to find its factorial:");
                        int fact = sc.nextInt();
                        System.out.println("Factorial of " + fact + " is: " + Factorial(fact));
                        break;
                    case 9: //Modulus
                        System.out.println("Enter two numbers to find modulus:");
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        if (b != 0) {
                            System.out.println("The modulus is: " + (a % b));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    case 10: //Logarithm
                        System.out.println("Enter a number to find its logarithm:");
                        double logNum = sc.nextDouble();
                        if (logNum > 0) {
                            System.out.println("The logarithm is: " + Math.log(logNum));
                        } else {
                            System.out.println("Error: Logarithm of non-positive numbers is undefined.");
                        }
                        break;
                    case 11: //Convert Celsius to Fahrenheit
                        System.out.println("Enter temperature in Celsius:");
                        double celsius = sc.nextDouble();
                        double fahrenheit = (celsius * 9/5) + 32;
                        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
                        break;
                    case 12: //Convert Fahrenheit to Celsius
                        System.out.println("Enter temperature in Fahrenheit:");
                        fahrenheit = sc.nextDouble();
                        celsius = (fahrenheit - 32) * 5/9;
                        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
                        break;
                    case 13: //Convert INR to USD
                        System.out.println("Enter amount in INR:");
                        double inr = sc.nextDouble();
                        double usd = inr / 85.4012; // Example conversion rate
                        System.out.println(inr + " INR is " + usd + " USD.");
                        break;
                    case 14: //Convert USD to INR   
                        System.out.println("Enter amount in USD:");
                        usd = sc.nextDouble();
                        inr = usd * 85.4012; // Example conversion rate
                        System.out.println(usd + " USD is " + inr + " INR.");
                        break;
                    case 15: //Exit
                        System.out.println("Thank you for using the Calculator! Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
            while (choice != 15);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    public static int Addition(int n){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter " + n + " numbers to add:");
        for(int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        return sum;
    }
    public static int Subtraction(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " numbers to subtract:");
        int diff = sc.nextInt();
        for(int i = 1; i < n; i++) {
            diff -= sc.nextInt();
        }
        return diff;
    }
    public static int Multiplication(int n){
        Scanner sc = new Scanner(System.in);
        int product = 1;
        System.out.println("Enter " + n + " numbers to multiply:");
        for(int i = 0; i < n; i++) {
            product *= sc.nextInt();
        }
        return product;
    }
    public static int Factorial(int n){
        if(n < 0) {
            System.out.println("Error: Factorial of a negative number is not defined.");
            return -1;
        }
        else if(n == 0 || n == 1) {
            return 1;
        }
        else return n * Factorial(n - 1);
    }
}