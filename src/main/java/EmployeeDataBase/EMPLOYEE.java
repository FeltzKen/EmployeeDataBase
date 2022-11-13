/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeDataBase;


/**
 * 
 * @author KFelt
 */
public class EMPLOYEE{
    private int points;
    private String name;
    private float wage;
    // constructor with parameters
    public EMPLOYEE(String nameAsString, float wageAsFloat, int pts) {
        this.name = nameAsString;
        this.wage = wageAsFloat;
        this.points = pts;
    }
    // add setter methods for the attributes.
    public void setName(String nameAsString){
        name = nameAsString;
    }
    public void setWage(float wageAsFloat){ 
        wage = wageAsFloat;
    }
    public void setPoints(int pts){
        points = pts;
    }
    // add getter methods for the attributes.
    public String getName(){ 
        return name;
    }
    public float getWage(){ 
        return wage;
    }
    public int getPoints(){ 
        return points;
    }
    public EMPLOYEE(){
        // Empty constructor
    }
}
