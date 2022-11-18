/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeDataBase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author KFelt
 */
public class CreateEmployee{

    public static void createEmployee(ArrayList<EMPLOYEE> emps) throws FileNotFoundException, IOException, InterruptedException{
        String EXITWORD = "DONE";
        String tempString = "";
        while(true){
            System.out.print("Enter name to add employee, or type done when you are finsished:");
            tempString = Main.sc.next();
            if(EXITWORD.equalsIgnoreCase(tempString)){
                break;
            }
            emps.add(new EMPLOYEE());
            System.out.println(emps.size());
            emps.get(emps.size()-1).setName(tempString);
            System.out.print("Enter the number of points " + emps.get(emps.size()-1).getName() + " has:");
            while(true){
            try{
                emps.get(emps.size()-1).setPoints(Main.sc.nextInt());
                break;
            }
            catch(Exception e){
                System.out.print("The input was incorrect. Please enter a valid number:");
                Main.sc.next();
            }
            }
            System.out.print("Enter the wage for " + emps.get(emps.size()-1).getName() + ":");
            while(true){
                try{
                    emps.get(emps.size()-1).setWage(Main.sc.nextFloat());
                    break;
                }
                catch(Exception e){
                    System.out.print("The input was incorrect. Please enter a valid number:");
                    Main.sc.next();
                }
            }           
        }
        DisplayEmployees.displayEmployees(emps);        
    }
}