// import java.util.Scanner;
// public class Greetings_using_switch{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int button= sc.nextInt();
//         switch (button) {
//             case 1: System.out.println("hello");
//             break;
//             case 2: System.out.println("namaste");
//             break;
//             case 3: System.out.println("bonjour");
//             break;        
//             default:System.out.println("invalid input");
//         }
//     }
    
// }

import java.util.*;
public class Greetings_using_switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        string pattern = sc.nextLine();
        switch (pattern) {
            case a: System.out.println("HELLO");
                break;
            case b:System.out.println("NAMASTE");
            break;
            case c: System.out.println("BONJOURE");
            break;
            default:
                break;
        }
    }
}