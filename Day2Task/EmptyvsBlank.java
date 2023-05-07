package Day2;

import java.util.Scanner;

public class EmptyvsBlank {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = input.nextLine();

            if (str.isEmpty()) {
                System.out.println("The string is empty.");
            } else {
                System.out.println("The string is not empty.");
            }

            if (str.isBlank()) {
                System.out.println("The string is blank.");
            } else {
                System.out.println("The string is not blank.");
            }
        }
    }



//        String str1 = ""; // empty string
//        String str2 = "  "; // whitespace string
//        String str3 = "hello"; // non-empty string
//
//        System.out.println(str1.isEmpty()); // true
//        System.out.println(str1.isBlank()); // true
//
//        System.out.println(str2.isEmpty()); // false
//        System.out.println(str2.isBlank()); // true
//
//        System.out.println(str3.isEmpty()); // false
//        System.out.println(str3.isBlank()); // false
//    }
//}