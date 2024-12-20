package utils;

import java.util.Scanner;

public class PrintValueUtil {
    static Scanner scanner = new Scanner(System.in);

    private PrintValueUtil() {
    }

    public static int printIntValue(String message) {
        printMessage(message);
        return scanner.nextInt();
    }

    public static String printStringValue(String message) {
        printMessage(message);
        return scanner.nextLine();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
