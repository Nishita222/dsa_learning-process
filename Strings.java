// //ALREADY EXISTING METHODS IN STRING CLASS
// public class Strings{
//     public static void main(String[] args){
//         //CONCATENATION
//         String firstName = "nishita";   
//         String lastName = "singh";
//         String fullName = firstName +" "+ lastName; //" " --> ALSO IS A STRING BUT IT GETS DELETED AFTER THE RUN AS WE DIDNT STORE IT IN ANYTHING
//         System.out.println(fullName);
//         System.out.println(fullName.length());  //print the length of the string

//         //charAt() method -->TO PRINT ALL CHARACTERS IN THE STRING
//         System.out.println(fullName.charAt(6));
//         for (int i = 0; i < fullName.length(); i++) {
//             System.out.println(fullName.charAt(i));  // prints each char in different rows
//         }

//         String name1 = "nishita";
//         String name2 = "nishita";
//         //compare 
//         // it checks three things:
//         //1. s1>s2     : +ve value return---- hello cello h>c
//         // 2. s1 == s2 :  0
//         // 3. s1<s2    : -ve value return---- hello wello h<w
//         // // we use function .compareTo()
//         // // why dont we just use == operator to compare two strings? because it will compare the reference of the string not the value of the string
//         // //i.e in some cases it will return true even if the strings are not equal because they are stored in the same memory location but in some cases 
//         // // it will return false even if the strings are equal because they are stored in different memory location
//         // //or simply == doesnt always give the correct answer
//         // if (name1.compareTo(name2) == 0){
//         //     System.out.println("Strings are equal");
//         // }else{
//         //     System.out.println("strings are not equal");
//         // }

//         if (new String("nishita") == new String("nishita")){  //it will return false because they are stored in different memory location
//             System.out.println("Strings are equal");         // Strings in Java are objects, and == checks whether both references point to the same object, not whether their contents are equal.
//         }else{
//             System.out.println("strings are not equal");
//         }
//     }
// }


//SUBSTRING
// public class Strings{
//     public static void main(String[] args){
//         String name = "nishita";
//---------------//substring(startIndex, endIndex) --> it will return the substring from startIndex to endIndex-1
//         System.out.println(name.substring(0, 4)); // it will print nish because it will print from index 0 to index 3

//         String sentence = "my name is nishita"; // if you write 0 to 4 substrings from 0 to 3 get printed but if you write 10 to sentence.length() it will print from index 10 to the last index because we have given the length of the string as the end index  
//         System.out.println(sentence.substring(10, sentence.length())); // it will print nishita because it will print from index 10 to the last index

//         //indexOf() --> it will return the index of the first occurrence of the specified character
//         System.out.println(sentence.indexOf("nishita")); // it will return 11 because nishita starts from index 11
//     }
        
// }

//parseInt() method --> it is used to convert a string to an integer
// public class Strings{
//     public static void main(String[] args){
//         String number = "123";
//         int num = Integer.parseInt(number); // it will convert the string "123" to the integer 123
//         System.out.println(num ); // it will print 123 because we have converted the string to an integer
//     }
// }

//toString() method --> it is used to convert an object to a string
// public class Strings{
//     public static void main(String[] args){
//         int num = 123;
//         String number = Integer.toString(num); // it will convert the integer 123 to the string "123"
//         System.out.println(number); // it will print "123" because we have converted the integer to a string
//         System.out.println(number.getClass()); // it will print class java.lang.String because we have converted the integer to a string
//     }
// }


//homework problem: Take an array of Strings input from the user & find 
// the cumulative (combined) length of all those strings.
// import java.util.Scanner;
// public class Strings{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String[] array = new String[size];
//         int totLength =0;
    
        
//         for(int i=0; i<size; i++) {
//             array[i] = sc.next();
//             totLength += array[i].length();
//         }
//         System.out.println(totLength);
//         sc.close();

//     }
// }



// HOMEWORK PROBLEM: Input a string from the user. Create a new string 
// called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
// Example : original = “eabcdef’ ; result = “iabcdif”

// import java.util.*;
// public class Strings{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String result = "";     

//         for ( int i =0 ; i <str.length();i++){
//             if (str.charAt(i) == 'e'){   // 'e' is a character and "e" is a string
//                 result = result + 'i';
//             }else {
//             result = result + str.charAt(i);
//             }
//         }
//         System.out.println(result);
//         sc.close();
//     }
// }


// Homework problem :Input an email from the user. You have to create a username from the email by 
// deleting the part that comes after ‘@’. Display that username to the user.
//Example : email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 

// import java.util.*;
// public class Strings{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         String email = sc.nextLine();
//         String username = "" ;

//         for (int i =0 ; i < email.length(); i++){
//             if (email.charAt(i) =='@'){
//                 break;
//             }
//             username = username + email.charAt(i);
//         }
//         System.out.println(username);
//         sc.close();
//     }
// }

//----------------------StringBuilder--------------------------------------------------------------------------------------------------------
// StringBuilder is a class in Java that is used to create mutable strings.
// public class Strings{
//     public static void main(String[] args){
//         StringBuilder sb = new StringBuilder("nishita");

//         // character at some index
//         System.out.println(sb.charAt(4));

//         // set character at index 0
//         sb.setCharAt(0, 'N'); // it will change the character at index 0 to 'N'
//         System.out.println(sb);

//         //insert(index, char) --> it will insert the character at the specified index
//         sb.insert(1,'i');
//         System.out.println(sb);

//         //delete(BeginIndex,EndIndex) 
//         sb.delete(1,5);
//         System.out.println(sb);

//         StringBuilder strb =  new StringBuilder("h");
//         strb.append('e');
//         strb.append('l');
//         System.out.println(strb);
//         int x  = strb.length();
//         System.out.println(x);

//     }
// }


//printing reverse string
public class Strings{
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("nishita");
        // for (int i = str.length()-1; i>=0;i--){
        //     System.out.print(str.charAt(i));
        // }
        //--------------------------OR------------------------------------
        for (int i =0; i<str.length()/2;i++){
            int frontIndex = i;
            int backIndex = str.length()-1-i;

            char frontChar = str.charAt(frontIndex);
            char backChar = str.charAt(backIndex);
            str.setCharAt(frontIndex, backChar);
            str.setCharAt(backIndex, frontChar);
        }
        System.out.println(str);
    }
}