/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeDataBase;

import static EmployeeDataBase.Main.sc;
import java.io.IOException;

/**
 *
 * @author KFelt
 */
public class MainMenu {
    
    public static int mainMenu() throws IOException, InterruptedException{
        CLS.main();
        String menuFormat = "| %-2d| %-35s |%n";
        int selection;
        System.out.printf("+---+-------------------------------------+%n");
        System.out.printf("| # | Please choose an option from below. |%n");
        System.out.printf("+---|-------------------------------------+%n");
        System.out.printf(menuFormat, 1, "Add new employees.");
        System.out.printf("|   |                                     |%n");
        System.out.printf(menuFormat, 2, "Modify existing employee data.");
        System.out.printf("|   |                                     |%n");
        System.out.printf(menuFormat, 3, "Remove employee.");
        System.out.printf("|   |                                     |%n");
        System.out.printf(menuFormat, 4, "Display employees.");
        System.out.printf("|   |                                     |%n");
        System.out.printf(menuFormat, 5, "Save employee list.");
        System.out.printf("|   |                                     |%n");

        // Add more menu otions above this line.
        System.out.printf("+---+-------------------------------------+%n");
        System.out.printf(menuFormat, 0, "Exit.");
        System.out.printf("+---+-------------------------------------+%n");
        System.out.println("Please make sure to save your changes before exiting the program.");
        System.out.print("Please make a selection:");
        while(true){
            try{
                selection = sc.nextInt();
                break;
            }
            catch(Exception e){
                System.out.println("The input was incorrect. Please enter a valid number");
                sc.next();
            }
        }
        return selection;
    }
}