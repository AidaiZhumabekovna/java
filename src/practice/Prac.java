package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {

        Map<String,Integer> user = new HashMap<>();
        String log = "aidai@gmail.com";
        int pas = 123435;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your login");

        for (int loginTry = 0; loginTry < 3; loginTry++) {
            if(sc.next().equals(log)){
                user.put(log, pas);
                System.out.println("you are successfully entered");
                break;
            }else{
                System.err.println("Your login is invalid,you have "+ (2-loginTry)+ " chanche");
//                break;
            }
        }

        int passTry = 3;
        while (passTry > 0) {
            passTry--;
            if(sc.nextInt() == pas){
                System.out.println("successfully enterd");
                break;
            }else{
                System.out.println("Your password is wrong,you have"+ (passTry)+ " chanche");
            }
        }


        System.out.println(user);
//        System.out.println("Please enter your second login");
//        String login2 = sc.next();
//
//        if(login.length() > login2.length()){
//            System.out.println("Short login is: "+ login2);
//        }else{
//            System.out.println("Short login is: "+login);
//        }





    }
}
