/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author bagale
 */
public class Input_Text_file {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("src/test.txt");
        try (Scanner input = new Scanner(file)) {
                while(input.hasNextLine()){
                    System.out.println(input.nextLine());
                }
                //close so that it doesn't use other unnecessary things that the Scanner uses which aren't useful
                //for this example
            }
        catch (FileNotFoundException e) {
            System.out.println("No such file/ File not found");
           // e.printStackTrace();
   
        }
    }
    /*
//Constructor NOT NEEDED OFC, 
    public Input_Text_file() {
    }
    */
    
}
