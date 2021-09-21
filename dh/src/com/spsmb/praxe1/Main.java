package com.spsmb.praxe1;
import java.util.Scanner;

public class Main {
       public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        if (args[0].equals("help")){
//            System.out.println("s = scitani ");
//            System.out.println("o = odcitani");
//            System.out.println("n = nasobeni");
//            System.out.println("d = deleni");
//            System.exit(-1);
//
//        }
//
//        boolean isValid = false;
//        String[] validOp =  {"s","o","n","d"};
//       for (String s : validOp){
//           if(s.equals(args[0])){
//               isValid=true;
//           }
//       }
//       if (!isValid){
//           System.out.println("neplatna operace");
//           System.exit(-1);
//       }
//
//        System.out.println("zadej prvni cislo:");
//        double a = sc.nextDouble();
//        System.out.println("zadej druhe cislo:");
//        double b = sc.nextDouble();
//
//        switch (args[0]) {
//            case "s":
//                System.out.println(a+b);
//                break;
//            case "o":
//                System.out.println(a-b);
//                break;
//            case "n":
//                System.out.println(a*b);
//                break;
//            case "d":
//                System.out.println(a/b);
//                break;
//            default:
//                System.out.println("tuhle operaci neznam");
//        }
//    }
//}
        Scanner sc = new Scanner(System.in);
        System.out.println("zadejte vetu:");
        String a = sc.nextLine();
        int counter = 0;
        char[] b = a.toCharArray();
        char[] samohlasky = {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char c : b) {
            for (char c1 : samohlasky) {
            if (c == c1){
                counter++;
                break;
            }
        }
        }
        System.out.println(counter);
    }
}