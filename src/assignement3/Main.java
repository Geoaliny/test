/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement3;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("LIST, INFO, CREATE_DIR, RENAME, COPY, MOVE, DELETE");
        System.out.print("Select the desired operation: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        try {
            Operatii op = Operatii.valueOf(input);
            System.out.print("Operation accepted ");
            switch (op) {
                case LIST:
                    Functii.list();
                    break;
                case INFO:
                    Functii.info();
                    break;
                case CREATE_DIR:
                    Functii.createDir();
                    break;
                case RENAME:
                    Functii.rename();
                    break;
                case COPY:
                    Functii.copy();
                    break;
                case MOVE:
                    Functii.move();
                    break;
                case DELETE:
                    Functii.delete();
                    break;
                default:
                    System.out.println("*");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Operation does not exist." + "\nTry again.");
        }
    }
}
  
    

