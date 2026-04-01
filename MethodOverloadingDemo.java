class Calculator {
    void add(int a, int b) {
        System.out.println("Adding two integers: " + a + " + " + b + " = " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + " + " + b + " + " + c + " = " + (a + b + c));
    }
    void add(double a, double b) {
        System.out.println("Adding two doubles: " + a + " + " + b + " = " + (a + b));
    }
    void add(int a, double b) {
        System.out.println("Adding int and double: " + a + " + " + b + " = " + (a + b));
    }
    void add(double a, int b) {
        System.out.println("Adding double and int: " + a + " + " + b + " = " + (a + b));
    }
    void add(String a, String b) {
        System.out.println("Concatenating strings: \"" + a + "\" + \"" + b + "\" = " + (a + b));
    }
    int add(int x, int y, boolean returnOnly) {
        int sum = x + y;
        if (returnOnly) {
            return sum;
        } else {
            System.out.println("Sum (not returned): " + sum);
            return sum;
        }
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("=== Method Overloading Demonstration ===\n");
        calc.add(10, 20);                  
        calc.add(5, 10, 15);            
        calc.add(3.5, 7.8);                
        calc.add(5, 2.5);                  
        calc.add(4.2, 8);                  
        calc.add("Hello", "World");        
        System.out.println("\nReturning value from overloaded method:");
        int result = calc.add(100, 200, true);
        System.out.println("Returned sum = " + result);
    }
}