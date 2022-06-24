package EX1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry extends Exception {
    
    private static Scanner sc = new Scanner(System.in);

    public byte readByte(String message) {
        byte read = 0;
        try {
            System.out.println(message);
            read = sc.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Error de formato");
            sc.nextLine();
            read = readByte(message);
        }
        return read;
    }

    public int readInt(String message) {
        int read = 0;
        boolean next;
        do {
            try {
                next = false;
                System.out.println(message);
                read = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error de formato");
                sc.next();
                next = true;
            }
        } while (next);
        return read;
    }

    public float readFloat(String message) {
        float read = 0;
        try {
            System.out.println(message);
            read = sc.nextFloat();

        } catch (InputMismatchException e) {
            System.out.println("Error de formato");
            sc.nextLine();
            read = readFloat(message);
        }
        return read;
    }

    public double readDouble(String message) {
        double read = 0;
        try {
            System.out.println(message);
            read = sc.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Error de formato");
            sc.nextLine();
            read = readDouble(message);
        }
        return read;
    }

    public char readChar(String message) {
        char read = ' ';
        String letter;
        System.out.println(message);
        try {
            letter = sc.next();
            if (letter.length() > 1) {
                throw new Exception();
            } else {
                read = letter.charAt(0);
            }
        } catch (Exception e) {
            System.out.println("Ha introducido más de un carácter");
            read = readChar(message);
        }
        return read;
    }

    public String readString(String message) {
        String letter;
        System.out.println(message);
        try {
            letter = sc.next();
            if (letter.length() > 10) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Ha introducido más de 10 carácteres");
            letter = readString(message);
        }
        return letter;
    }

    public boolean readYesNo(String message){
        String readYN;
        boolean next = false;
        try {
            System.out.println(message);
            readYN = sc.next();
            next = false;
            if (readYN.equalsIgnoreCase("s")) {
                next = true;
                System.out.println("correcto");
            } else if (readYN.equalsIgnoreCase("n")) {
                next = false;
                System.out.println("incorrecto");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Introduzca S o N");
            sc.nextLine();
            readYesNo(message);
        }
        return next;
    }
}