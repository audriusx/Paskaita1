import  java.util.Scanner;


/**...*/
public class Antra{
public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite svori");
        int weight = sc.nextInt();
        System.out.println("Iveskite ugi");
        double height = sc.nextDouble();

        //double kmi = weight / (height* height);
        // double kmi = weight / (height* height);
        System.out.println("kmi" + kmi(weight, height));
        }

        private static double kmi (int weight, double height){
        return weight / (height * height);
        }
}
