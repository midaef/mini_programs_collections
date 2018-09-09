

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArrayList<String> note = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        String inp = "";
        String inpMore = "";
        sign();
        Scanner userInput = new Scanner(System.in);
        while(true) {
            System.out.println("1.Write to note");
            System.out.println("2.Open note");
            System.out.println("3.Clear note");
            System.out.print("Input value: ");
            inp = userInput.nextLine();
            if (inp.equals("1")) {
                new Main().addNote();
            } else if (inp.equals("2")) {
                new Main().printNote();
            } else if (inp.equals("3")) {
                clearNote();
            } else {
                System.out.println("Input wrong!");
            }
        }
    }

    public static void sign() throws FileNotFoundException, UnsupportedEncodingException {
        String inp = "";
        Scanner userInp = new Scanner(System.in);
        while(true) {
            System.out.println("1.Login");
            System.out.println("2.Register");
            System.out.print("Input value: ");
            inp = userInp.nextLine();
            if (inp.equals("1")) {
                if (login() == 1) {
                    break;
                }
            }
            else if (inp.equals("2")) {
                register();
            }
        }
    }

    public static int login() throws FileNotFoundException {
        String login = "";
        String password = "";
        Scanner sign = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        File file = new File("data.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            data.add(sc.nextLine());
        }
        System.out.print("Input login: ");
        login = sign.nextLine();
        System.out.print("Input password: ");
        password = sign.nextLine();
        for (int i = 0; i < data.size(); i++) {
            if (login.equals(data.get(i)) && password.equals(data.get(i))) {
                System.out.println("Login successful");
                System.out.println("");
                return 1;
            }
        }
        System.out.println("User not found!");
        System.out.println("");
        return 0;
    }

    public static void register() throws FileNotFoundException, UnsupportedEncodingException {
        String login = "";
        String password = "";
        Scanner inpSign = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("data.txt", "UTF-8");
        System.out.print("Input new login: ");
        login = inpSign.nextLine();
        System.out.print("Input new password: ");
        password = inpSign.nextLine();
        writer.println(login);
        writer.println(password);
        writer.close();
        return;
    }

    public void addNote() throws FileNotFoundException, UnsupportedEncodingException {
        String inp = "";
        String inpMore = "";
        readNote();
        Scanner userInput = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("note.txt", "UTF-8");
        System.out.print("Input your note now: ");
        String userWrite = userInput.nextLine();
        note.add(userWrite);
        writer.flush();
        for (String i:note) {
            writer.println(i);
        }
        writer.close();
        System.out.println("File was saved in <txt>!");
        System.out.println("1.Return menu");
        System.out.println("2.Exit");
        System.out.print("Input value: ");
        inpMore = userInput.nextLine();
        if (inpMore.equals("1")) {
        } else if (inpMore.equals("2")) {
            System.exit(0);
        } else {
            System.out.println("Input wrong!");
        }
    }

    public void readNote() throws FileNotFoundException {
        File file = new File("note.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            note.add(sc.nextLine());
        }
    }

    public static void clearNote() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("note.txt", "UTF-8");
        writer.flush();
        writer.close();
        System.out.println("Your note is clear!");
    }

    public void printNote() throws FileNotFoundException {
        readNote();
        if (note.isEmpty()) {
            System.out.println("Your note is clear!");
            System.out.println("Pleas add new note.");
            System.out.println("");
            return;
        }
        System.out.println("Your note:");
        for (int i = 0; i < note.size(); i++) {
            String userNote = note.get(i);
            System.out.println(i+1 + ")" + userNote);
        }
        System.out.println("");
    }

}