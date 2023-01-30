//package Set;
//
//import java.util.*;
//
//import static jdk.nashorn.internal.objects.Global.print;
//import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
//
//public class SaveInDB {
//    public static void main(String[] args) {
//        //Scanner -> create login(3 users) -> save in HashSet -> find short login -> message have to do long login
//
//
////        System.out.println(lengthLogin);
//
////        HashSet<String> data = new HashSet<>();
////        data.add("aidai@gmail.com");
////        data.add("kanzada@gmail.com");
////        data.add("burulai@gmail.com");
////        data.add("nurperi@gmail.com");
////
////        Scanner sc = new Scanner(System.in);
////        String lengthLogin = sc.next();
////        System.out.println(lengthLogin);
////        for (int i = 0; i < data; i++) {
////        }
//
//
////            Scanner scan = new Scanner(System.in);
////            HashSet<String> log = new HashSet<>();
////            String login1;
////            System.out.println("Create first login:");
////            log.add(login1 = scan.next());
////            System.out.println("Your login: " + login1.concat("@gmail.ru"));
////            System.out.println("Create first Password:");
////            String password1 = scan.next().trim();
////            System.out.println("Confirm Password: ");
////            while (0 < 3) {
////                String confirmingPassword1 = scan.next();
////                if (confirmingPassword1.equals(password1)) {
////                    System.out.println("Created");
////                    break;
////                } else {
////                    System.err.println("Wrong password");
////
////                }
////            }
////            String login2;
////            System.out.println("Create second login:");
////            log.add(login2 = scan.next());
////            System.out.println("Your login: " + login2.concat("@gmail.com"));
////            System.out.println("Create second Password:");
////            String password2 = scan.next().trim();
////            System.out.println("Confirm Password:");
////            while (0 < 3) {
////                String confirmingPassword2 = scan.next();
////                if (confirmingPassword2.equals(password2)) {
////                    System.out.println("Created");
////                    break;
////                } else {
////                    System.err.println("Wrong password");
////                }
////            }
////            String login3;
////            System.out.println("Create third login:");
////            log.add(login3 = scan.next());
////            System.out.println("Your login: " + login2.concat("@gmail.com"));
////            System.out.println("Create third Password:");
////            String password3 = scan.next();
////            System.out.println("Confirm Password:");
////            while (0 < 3) {
////                String confirmingPassword3 = scan.next();
////                if (confirmingPassword3.equals(password2)) {
////                    System.out.println("Created");
////                    break;
////                } else {
////                    System.err.println("Wrong password");
////                }
////            }
////            while (0 < 3) {
////                if (login1.length() < login2.length()) {
////                    System.out.println("Your login1 is too short. Please make it longer!");
////                    log.remove(login1);
////                    log.add(login1 = scan.next());
////                    if (login1.length() < 4) {
////                        System.out.println("Make it longer");
////                        log.remove(login1);
////                        log.add(login1 = scan.next());
////                        if (login1.length() >= 4) {
////                            System.out.println("Successfully changed");
////                            break;
////                        } else {
////                            System.err.println("Error");
////                        }
////                    }
////                    if (login1.length() >= login2.length()) {
////                        System.out.println("Successfully changed");
////                        break;
////                    } else {
////                        System.err.println("Error");
////                    }
////                } else if (login2.length() < login1.length()) {
////                    System.out.println("Your login2 is too short, Please make it longer!");
////                    log.remove(login2);
////                    log.add(login2 = scan.next());
////                    if (login2.length() < 4) {
////                        System.out.println("Make it longer");
////                        log.remove(login2);
////                        log.add(login2 = scan.next());
////                        if (login2.length() >= 4) {
////                            System.out.println("Successfully changed");
////                            break;
////                        } else {
////                            System.err.println("Error");
////                        }
////                    }
////                    if (login2.length() >= login1.length()) {
////                        System.out.println("Successfully changed");
////                        break;
////                    } else {
////                        System.err.println("Error");
////                    }
////                } else if (login3.length() < login1.length() || login3.length() < login2.length()) {
////                    System.out.println("Your login3 is too short, Please make it longer!");
////
////                }
////                log.remove(login3);
////                log.add(login3 = scan.next());
////                if (login3.length() < 4) {
////                    System.out.println("Make it longer");
////                    log.remove(login3);
////                    log.add(login3 = scan.next());
////                    if (login3.length() >= 4) {
////                        System.out.println("Successfully changed");
////                        break;
////                    } else {
////                        System.err.println("Error");
////                    }
////                }
////                if (login3.length() >= login1.length() && login3.length() >= login2.length()) {
////                    System.out.println("Successfully changed");
////                    break;
////                } else {
////                    System.err.println("Error");
////                }
////            }
//
//        Scanner sc = new Scanner(System.in);
//        String login = sc.next();
//        String login2 = sc.next();
//        String login3 = sc.next();
//        if(login.length() > 4 && login2.length() > 4 && login3.length() > 4){
//            HashSet longLogins = new HashSet();
//            longLogins.add(login);
//            longLogins.add(login2);
//            longLogins.add(login3);
//            System.out.println(longLogins);
//        }
//        if(login.length() < 4){
//            System.out.println("short");
//        }else if (login2.length() < 4){
//            System.out.println("short");
//        }else if(login3.length() < 4){
//            System.out.println("short");
//        }
//        }
//
//}
