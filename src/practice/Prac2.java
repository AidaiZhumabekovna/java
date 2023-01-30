package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Map<String, Integer> user = new HashMap<>();
        String login = "aidai@gmail.com";
        int password = 2222;
        System.out.println("PLease enter login");
        Scanner sc = new Scanner(System.in);
//        String loginLength = sc.next();
//        int passLength = sc.nextInt();


        for (int logTry = 0; logTry < 3; logTry++) {
            if (sc.next().length() > 4) {
                if (sc.next().equals(login)) {
                    System.out.println(" successfully");
                    System.out.println("PLease enter password");
                    for (int passTry = 0; passTry < 3; passTry++) {
                        if (sc.nextInt() > 4) {
                            if (sc.nextInt() == password) {
                                System.out.println("successfully entered");
                                user.put(login, password);
                                break;
                            } else {
                                System.out.println("wrong password, please try again");
                            }
                        }
                        break;
                    }

                } else{
                    System.out.println("invalid login");
                }
//                else {
//                    System.out.println("your login is short, please write long login");
//                    System.out.println("your password is short");
//                    System.out.println(sc.next());  //  ???????????
//                    break;
//                }
            }
            System.out.println("User:" + user);
        }
    }
}
