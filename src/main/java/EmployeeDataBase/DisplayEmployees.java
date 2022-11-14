/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeDataBase;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.lang.StackTraceElement;
/**
 *
 * @author KFelt
 */
public class DisplayEmployees {

    public static void displayEmployees(ArrayList<EMPLOYEE> emps) throws IOException, InterruptedException{
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();// create stacktrace array.
        StackTraceElement e = stacktrace[2];// get stack trace member that is the calling function.
        String methodName = e.getMethodName();// set get calling method as a string
        DecimalFormat floatFormat = new DecimalFormat("#.00");
        String leftFormat = "| %-3s | %-15s | %-7s | %-6s |%n";
        System.out.println("+-----+-----------------+---------+--------+");// set up table and populate employee data.
        System.out.println("| #   | Name            | Wage    | Points |");
        System.out.println("+-----+-----------------+---------+--------+");
        for(var i = 0; i < emps.size(); i++){
            System.out.printf(
                    leftFormat,
                    i+1,
                    emps.get(i).getName(), 
                    "$"+floatFormat.format(emps.get(i).getWage()), 
                    emps.get(i).getPoints());  
        }    
        if(methodName != "main"){// Check for how the bottom of the table should be set up.
            System.out.println("+-----+-----------------+---------+--------+");
            System.out.printf(leftFormat, 0, "GO BACK", "", "");
            System.out.println("+-----+-----------------+---------+--------+");
            if(methodName == "modifyEmployeeData"){// Display when calling method is modifyEmployeeData.
                System.out.print("Select employee to modify:");
            }
            if(methodName == "removeEmployee"){// Display when calling method is removeEmployee.
                System.out.print("Select employee to remove:");
            }
        }else{// Display when calling method is main.
            System.out.println("+-----+-----------------+---------+--------+");
            System.out.print("Press enter to continue...");
            System.in.read();
            CLS.main();
        }       
    }
}