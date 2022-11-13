/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeDataBase;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author KFelt
 */
public class SaveEmployeeList {

    public static void saveEmployeeList(ArrayList<EMPLOYEE> emps) throws FileNotFoundException, IOException, InterruptedException{
        System.out.println(emps.size());
        char SAVE;
        System.out.print("Are you sure Y|N: ");
        String file = "EmployeesList.txt";
        while(true){
            SAVE = Main.sc.next().charAt(0);
            if(Character.toUpperCase(SAVE) == 'Y'){
                System.out.println(emps.size());
                PrintWriter printWriter = new PrintWriter(file);
                for (int i = 0; i < emps.size(); i++){
                    printWriter.println(emps.get(i).getName() + "," + emps.get(i).getPoints() + "," + emps.get(i).getWage());
                }
                printWriter.close();
                break;
            }else if(Character.toUpperCase(SAVE) == 'N'){
                break;
            }else{
                System.out.print("The input was not correct. Are you sure Y|N: ");
            }        
        }
        CLS.main();
    }
}
