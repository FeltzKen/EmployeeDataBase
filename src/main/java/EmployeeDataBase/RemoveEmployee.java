/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeDataBase;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author KFelt
 */
public class RemoveEmployee {
    public static void removeEmployee(ArrayList<EMPLOYEE> emps) throws IOException, InterruptedException{
        String leftFormat = "| %-1d | %-15s | %-5f | %-5d |%n";
        int toBeRemoved = 0;
        // Set up table
        DisplayEmployees.displayEmployees(emps);
        while(true){
            try{
                toBeRemoved = Main.sc.nextInt(); // Select employee to be removed
                if(toBeRemoved == 0){
                    break;// Exit when 0 selected. Return to main menu.
                }
                emps.remove(toBeRemoved - 1);// Remove employee selected by user.
                break;// Return to main menu.
            }
            catch(Exception e){
                System.out.println(e);
                System.out.print("The input was incorrect. Select employee to remove:");
                Main.sc.next();
            }
        }
    }
}