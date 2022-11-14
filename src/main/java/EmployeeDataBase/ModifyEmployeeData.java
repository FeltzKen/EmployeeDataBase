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
public class ModifyEmployeeData {
    /**
     * Modify an attribute of an employee.
     * @param emps
     */
    public static void modifyEmployeeData(ArrayList<EMPLOYEE> emps) throws IOException, InterruptedException{  
    String leftFormat1 = "| %-3d | %-15s | %-5f | %-5d |%n";
    String leftFormat2 = "| %-3d | %-10s | %-15s |%n";
    String newStringValue = "";
    int newIntValue = 0;
    float newFloatValue = 0.0f;
    int valueToBeModified = 0;
    int employeeSelected = 0;
        while(true){
        // Call method to display employees.
            DisplayEmployees.displayEmployees(emps);
            while(true){// Loop to get employee selection.
                try{
                    employeeSelected = Main.sc.nextInt();
                    break;
                }
                catch(Exception e){
                    System.out.println("The input was incorrect. Select employee to modify:");
                    Main.sc.next();// Consume input.
                }
            }// End of employee selection loop.
            if(employeeSelected == 0 || employeeSelected < 0 || employeeSelected > emps.size()){
                break;// Return to main menu if 0 selected.
            }
            // Set up and populate next table. 
            System.out.printf("|-----+------------+-----------------+%n");
            System.out.printf(leftFormat2, 1, "Name", emps.get(employeeSelected - 1).getName()); 
            System.out.printf(leftFormat2, 2, "Wage", emps.get(employeeSelected - 1).getWage()); 
            System.out.printf(leftFormat2, 3, "Points", emps.get(employeeSelected - 1).getPoints()); 
            System.out.printf("| 0   | GO BACK    |                 |%n");
            System.out.printf("|-----+------------+-----------------+%n");
            System.out.print("Select the value modify:");           
            // Loop to select the attribute that will be modified.
            while(true){
                try{
                    valueToBeModified = Main.sc.nextInt();
                    break;
                }
                catch(Exception e){
                    System.out.println("The input was incorrect. Select the value modify:");
                    Main.sc.next();// Consume input.
                }
            }// End attribute selection loop.
            while(true){
                switch(valueToBeModified){
                    case 1:// case for changing employee name.
                        System.out.print("Enter the new name:");
                        while(true){
                            try{
                                newStringValue = Main.sc.nextLine();// scan input for string value.
                                if(newStringValue != ""){
                                emps.get(employeeSelected - 1).setName(newStringValue);
                                break;
                                }
                            }catch(Exception e){
                                System.out.print("The input was incorrect. Enter the new value:");
                                Main.sc.next();// Consume input.
                            }
                        }
                        break;
                    case 2:// case for changing the employee wage.
                        System.out.print("Enter the new wage:");
                        while(true){
                            try{
                                newFloatValue = Main.sc.nextFloat();// scan input for float value.
                                emps.get(employeeSelected - 1).setWage(newFloatValue);
                                break;
                            }catch(Exception e){
                                System.out.print("The input was incorrect. Enter the new wage:");
                                Main.sc.next();// Consume input.
                            }
                        }
                        break;
                    case 3:// case for changing employee points.
                        System.out.print("Enter the new points:");
                        while(true){
                            try{
                                newIntValue = Main.sc.nextInt();// scan input for integer value.
                                emps.get(employeeSelected - 1).setPoints(newIntValue);
                                break;
                            }catch(Exception e){
                                System.out.print("The input was incorrect. Enter the new points:");
                                Main.sc.next();// Consume input.
                            }
                        }
                        break;
                    case 0:
                }                   
                break;
            }           
        }    
    }
}