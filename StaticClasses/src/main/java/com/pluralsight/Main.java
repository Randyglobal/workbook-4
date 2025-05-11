package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display("Enter Prefix: e.g(Mr., Mrs., Miss., Dr.)");
        String prefix = scanner.nextLine();
        display("Enter FirstName: ");
        String firstName = scanner.nextLine();
        display("Enter MiddleName: ");
        String middleName = scanner.nextLine();
        display("Enter LastName: ");
        String lastName = scanner.nextLine();
        display("Enter Surffix: e.g(PhD, Jr, III)");
        String surffix = scanner.nextLine();

        display("FirstName and LastName " + NameFomatter.format(firstName, lastName));
        display("CompleteName " +NameFomatter.format(prefix, firstName, middleName, lastName, surffix));
        display(" " + NameFomatter.format("Mr. Randy Imbia, PhD"));
    }
    public static void display(String message){
        System.out.println(message);
    }
}
