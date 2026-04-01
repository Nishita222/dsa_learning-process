import java.util.Scanner;
public class UserDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.print("Enter your name: ");
        String name = sc.next();  // single word

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your contact number: ");
        long contact = sc.nextLong();

        System.out.print("Enter your height (in cm): ");
        float height = sc.nextFloat();

        // Output using normal concatenation
        System.out.println("\n--- User Details ---");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age + " years");
        System.out.println("Contact : " + contact);
        System.out.println("Height  : " + height + " cm");

        sc.close();
    }
}