package antra;

import java.util.Scanner;

public class trecia {

    /*12*12
    20-13
    23+34
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du skaicius ir operacija pvz x+y");
        String insertVal = scanner.nextLine();
        String[] split = insertVal.split("");
        int result =0;
        if (split.length == 3){
            antra calculator = new antra();
            try{
            int numb = Integer.valueOf(split[0]);
            int numbSec = Integer.valueOf(split[2]);


                switch (split[1]) {

                case "+":
                    calculator.suma(numb, numbSec);
                    break;
                case "-":
                    result = calculator.skirtumas(numb, numbSec);
                    break;
                case "*":
                    result = calculator.sandauga(numb, numbSec);
                    break;
            }
            System.out.println("Rezultatas ->>" + result);
        }catch (NumberFormatException e){
            System.out.println("Blogai ivestas formatas");

            }

        }else {
            System.out.println("Paleisk programa is naujo");
        }
    }
}
