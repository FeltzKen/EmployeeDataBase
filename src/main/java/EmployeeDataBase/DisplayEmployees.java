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
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[2];
        String methodName = e.getMethodName();
        DecimalFormat floatFormat = new DecimalFormat("#.00");
        String leftFormat = "| %-3s | %-15s | %-7s | %-6s |%n";
        System.out.printf("+-----+-----------------+---------+--------+%n");
        System.out.printf("| #   | Name            | Wage    | Points |%n");
        System.out.printf("+-----+-----------------+---------+--------+%n");
        for(var i = 0; i < emps.size(); i++){
            System.out.printf(
                    leftFormat,
                    i+1,
                    emps.get(i).getName(), 
                    "$"+floatFormat.format(emps.get(i).getWage()), 
                    emps.get(i).getPoints());  
        }    
        if(methodName != "main"){
            System.out.printf("+-----+-----------------+---------+--------+%n");
            System.out.printf(leftFormat, 0, "GO BACK", "", "");
        }
        System.out.printf("+-----+-----------------+---------+--------+%n");
        if(methodName != "main"){
            if(methodName == "modifyEmployeeData"){
                System.out.print("Select employee to modify:");
            }
            if(methodName == "removeEmployee"){
                System.out.print("Select employee to remove:");
            }

        }else{
            System.out.print("Press enter to continue...");
            System.in.read();
            CLS.main();
        }
        
    }
}
