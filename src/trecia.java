import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trecia {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuota km skaiciu");
        double km = getCorrectValue(sk);
        System.out.println("Kuro sanaudos");
        double l = getCorrectValue(sk);
        average(km, l);

    }

    private static double average(double km, double l){
        return (l * 100) / km;
    }

    private static double getCorrectValue(Scanner scanner) {
        double response = 0.0;
        while (true){
            try {
                response = scanner.nextDouble();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Ivesta bloga reiksme,pakartok");
            }
    }
        return response;

    }
}

