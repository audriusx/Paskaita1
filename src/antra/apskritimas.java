package antra;

import java.util.Scanner;

public class apskritimas {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite apskritimo spinduli");
        int a = scanner.nextInt();
        int pi = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        double val = pi*(a^2);
        System.out.println("res" + val);

    }
}
