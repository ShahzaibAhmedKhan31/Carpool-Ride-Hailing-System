/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author HP
 */

 public class Civic implements RideCars {
    public PrintWriter outFile;
    public String getCarName(){
        return "Civic 1.5 Turbo";
    }
    
    public String getCarNumberPlate(){
        return "CCC-333";
    }
    
    public String getDriverName(){
        return "Farooq Furqan";
    }
    
    public String getDriverNumber(){
        return "03331234567";
    }
    
    public String getCarType(){
        return "Deluxe";
    }
    
    public String getCarColor(){
        return "Grey";
    }    
    public String toString(){
        return "Car Type: "+ getCarType()+ System.getProperty("line.separator") +"Car Name: " + getCarName() + System.getProperty("line.separator") + "Car Color: "+getCarColor() + System.getProperty("line.separator") + "Car Number Plate: " + getCarNumberPlate()+ System.getProperty("line.separator") + "Driver Name: "+ getDriverName()+ System.getProperty("line.separator") + "Driver PhoneNumber: "+getDriverNumber();
    }
    public void Filing(String a,String b,String c,int d) throws FileNotFoundException {
         Verify obj=new Verify();
         if (obj.counter==0){
         outFile=new PrintWriter("Verfication1.txt");
         }
         if (obj.counter==1){
         outFile=new PrintWriter("Verification2.txt");
         }
         if (obj.counter==2){
         outFile=new PrintWriter("Verification3.txt");
         }
        
        outFile.println(a);
        outFile.println("Expected Fair:" + d);
        outFile.println("Your Pickup Location: " + b);
        outFile.println("Your DropOff Location: " + c);
        outFile.close();
    }
}