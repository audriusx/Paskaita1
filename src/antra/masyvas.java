package antra;

import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class masyvas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite masyvo ilgi");
        int masL = getGoodNumber(scanner);
        int[] mas = new int[masL];
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Iveskite" + i + "skaiciu");
            mas[i] = getGoodNumber(scanner);
        }
        printMas(mas);
        System.out.println();
        max(mas);
        System.out.println();
        min(mas);
    }


    public static int max(int[] max) {
        int temp = 0;
        for (int i = 0; i < max.length; i++) {
            if (temp < max[i]) {
                temp = max[i];
            }
        }

        return temp;
    }

    //[12,2,3,5,1] -> [1,5,3,2,12]
    private static void reverse(int[] mas) {
        int[] temp = new int[mas.length];
        int j = mas.length - 1;
        for (int i = 0; i < mas.length; i++) {
            temp[i] = mas[j - i];
        }
    }

    public static void min(int[] mas) {

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] > mas[j]) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }


        }
        System.out.println("Masyvo rikiavimas");
        printMas(mas);

    }

    private static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }

    private static int getGoodNumber(Scanner sc) {
        int i = 0;
        while (true) {
            System.out.println("Iveskite skaiciu");
            try {
                i = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Juk sakiau skaicius");
                sc.nextLine();

            }
        }
        return i;
    }
}
