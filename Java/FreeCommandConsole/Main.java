

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            String username = System.getProperty("user.name");
            System.out.print(username + ">>> ");
            String i = sc.nextLine();
            cmd(i);
        }

    }

    public static void cmd(String arg) {
        String s = "get";
        if (arg.equals(s)) {
          get();
        }

    }

    public static void get() {
        System.out.println("Read");
    }

}
