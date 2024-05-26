package me.sit.dev.scanner;


import java.io.*;
import java.util.Scanner;

public class JavaScanner {

    public static void main(String[] args) {
//        calculatorApp();

        writeFromScannerToFile();
//        try {
//            demoScannerFromString();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    private static void writeFromScannerToFile() {
        // Create Scanner
        Scanner scanner = new Scanner(System.in);
        // Receive input (name, age, gender) [Must validate input use while-loop]
        String name = null, gender = null;
        int age = 0;
        System.out.print("Enter name: ");
        name = scanner.nextLine();


        while (true) {
            System.out.print("Enter age: ");
            if(scanner.hasNextInt() ) {
                age = scanner.nextInt();
                if(age > 0) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Age must be greater than 0");
                    scanner.nextLine();
                    continue;
                }
            }
            System.out.println("Please enter a valid number");
            scanner.nextLine();
        }


        while (true) {
            System.out.print("Enter Gender: ");
            if (scanner.hasNext()) {
                gender = scanner.next();
                if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
                    break;
                }
            }
            System.out.println("Gender can only be [Male/Female]");
            scanner.nextLine();
        }

        // Write the input from scanner into file using BufferedOutputStream
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/user.txt");
                BufferedOutputStream writer = new BufferedOutputStream(fileOutputStream)) {
            writer.write(name.getBytes());
            writer.write("\n".getBytes());
            writer.write(String.valueOf(age).getBytes());
            writer.write("\n".getBytes());
            writer.write(gender.getBytes());
        } catch (IOException e) {
            System.out.println("Error while wring files");
        }
        // Close Scanner
        scanner.close();

        // Print data from file using BufferReader
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/user.txt");) {
            Scanner fileScanner = new Scanner(fileInputStream);
            fileScanner.useDelimiter( "");

            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.next());
            }

        } catch (IOException e) {
            System.out.println("File not found");;
        }
    }

        private static void calculatorApp() {
            Scanner in = new Scanner(System.in); //InputStream

            System.out.println("Enter first number: ");
            int a;
            while (true) {
                if (in.hasNextInt()) {
                    a = in.nextInt();
                    break;
                }
                System.out.println("Enter a valid number");
                in.nextLine();
            }

            System.out.println("Please enter second number: ");
            int b;
            while (true) {
                if (in.hasNextInt()) {
                    b = in.nextInt();
                    break;
                }
                System.out.println("Pleas enter a valid number");
                in.nextLine();
            }

            System.out.println("Enter symbols: ");
            String symbol;
            while (true) {
                if (in.hasNext()) {
                    symbol = in.next();
                    if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
                        break;
                    }
                }
                System.out.println("Please enter a valid symbol");
                in.nextLine();
            }

            int result = switch (symbol) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> throw new IllegalStateException("Unexpected value: " + symbol);
            };

            System.out.println("Result: " + result);
        }

        public static void demoScannerFromString () throws FileNotFoundException {
            String s = """
                    This is the first line.
                    12.345656
                    100010  x
                    39  y
                    mx true
                    o
                          4
                    the end""";
//        var sc = new Scanner(s);
            File file = new File("src/main/resources/text.txt");
            if (file.exists()) {
                System.out.println("File exists");
            } else {
                System.out.println("File does not exist");
            }
            var sc = new Scanner(file);
            // แบ่ง token ใช้ regular expression
            sc.useDelimiter("\\s+");
            int i = 0;
            while (sc.hasNext()) {
                if (sc.hasNextBoolean()) {
                    System.out.println(++i + " : boolean = " + sc.nextBoolean());
                } else if (sc.hasNextLong()) {
                    System.out.println(++i + " : long = " + sc.nextLong());
                } else if (sc.hasNext("\\b.\\b")) {
                    System.out.println(++i + " : char = " + sc.next());
                } else if (sc.hasNextInt(2)) {
                    System.out.println(++i + " : binary number = " + sc.nextInt(2));
                } else if (sc.hasNextInt()) {
                    System.out.println(++i + " : int = " + sc.nextInt());
                } else if (sc.hasNextDouble()) {
                    System.out.println(++i + " : double = " + sc.nextDouble());
                } else if (sc.hasNext()) {
                    System.out.println(++i + " : String = " + sc.next());
                }
            }
            System.out.println("END");
        }
    }
