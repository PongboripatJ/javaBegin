/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package int103;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        demo(); 
    }

    public static void demo() {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("\\n");
        String prompt = """
                        
                Select Options Here
                1. Create Profile
                2. Create Playlist
                3. Exit
                Your Answer is [1-3]        """;
        System.out.println(prompt);
        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (line.isBlank()) {
                System.out.println(prompt);
                continue;
            }
            Scanner ans = new Scanner(line);
            ans.useDelimiter("\\n");
            if (ans.hasNext("[1|2|3]")) {
                int i = ans.nextInt();
                switch (i) {
                    case 1 -> {
                        System.out.println("Option 1 : Create Profile");
                    }
                    case 2 -> {
                        System.out.println("Option 2 : Create Playlist");
                    }
                    case 3 -> {
                        System.out.println("Option 3 : Exit");
                    }
                }
                switch (i) {
                    case 1 -> {
                        System.out.print("Enter your username : ");
                        Scanner n = new Scanner(System.in);
                        n.useDelimiter("\\n");
                        String name = n.next();
                        System.out.print("Enter your Age : ");
                        int age = n.nextInt();
                        System.out.println("Username : " + name);
                        System.out.println("Age : " + age+'y');
                        System.out.println("Create profile Success!");
                    }
                    case 2 -> {
                        System.out.print("Enter playlist name : ");
                        Scanner n = new Scanner(System.in);
                        String name = n.next();
                        System.out.println("Create playlist : " + name);
                        System.out.println("Create playlist Success!");
                    }
                    case 3 -> {
                        break;
                    }
                }
                break;
            } else {
                System.out.println(prompt);
                continue;
            }
        }
        System.out.println("Thank You :)");
    }
}
