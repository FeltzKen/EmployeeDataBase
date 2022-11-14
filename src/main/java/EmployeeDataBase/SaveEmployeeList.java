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
        char SAVE;
        System.out.print("Are you sure Y|N: ");// Verify save request.
        String file = "EmployeesList.txt";// Name of file that is used to save and load employee data.
        while(true){
            SAVE = Main.sc.next().charAt(0);// scan input for character value.
            if(Character.toUpperCase(SAVE) == 'Y'){// if yes perform save actions.
                PrintWriter printWriter = new PrintWriter(file);// set new writer to write data to supplied file.
                for (int i = 0; i < emps.size(); i++){// Loop through employee array list and add values to csv.
                    printWriter.println(emps.get(i).getName() + "," + emps.get(i).getPoints() + "," + emps.get(i).getWage());
                }
                printWriter.close();
                break;
            }else if(Character.toUpperCase(SAVE) == 'N'){// if no go back to the main menu.
                break;
            }else{
                System.out.print("The input was not correct. Are you sure Y|N: ");
            }        
        }
        CLS.main();
    }
}