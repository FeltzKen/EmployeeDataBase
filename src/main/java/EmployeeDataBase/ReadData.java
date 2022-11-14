/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeDataBase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author KFelt
 */
public class ReadData {
    public static ArrayList<EMPLOYEE> readData(ArrayList<EMPLOYEE> emps) throws IOException { 
    String line = "";
    String[] lineInfo;
    String file = "EmployeesList.txt";
    try(BufferedReader br = new BufferedReader(new FileReader(file))) {
        while ((line = br.readLine()) != null) {
            lineInfo = line.split(",");
            emps.add(new EMPLOYEE(lineInfo[0], Float.parseFloat(lineInfo[2]), Integer.parseInt(lineInfo[1]))); 
        }
    } catch (FileNotFoundException e) {
      //Some error logging
    }
    return emps;
}
}