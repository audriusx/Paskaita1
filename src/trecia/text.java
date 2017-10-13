package trecia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class text {

    public static void main(String[] args) {
        try{
        BufferedReader bf = new BufferedReader(new FileReader(new File("testData.txt")));
        String line;
        while((line = bf.readLine()) !=null) {
            System.out.println(line);
        }

        }catch (IOException e){
        e.printStackTrace();

        }
    }
}
