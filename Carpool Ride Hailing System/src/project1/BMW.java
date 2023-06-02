/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author HP
 */
public class BMW implements RideCars {
    public PrintWriter outFile;
    public String getCarName(){
        return "BMW M3";
    }
    
    public String getCarNumberPlate(){
        return "AAA-111";
    }
    
    public String getDriverName(){
        return "Arsalan Shah";
    }
    
    public String getDriverNumber(){
        return "03131234567";
    }
    
    public String getCarType(){
        return "Premium";
    }
    
    public String getCarColor(){
        return "Black";
    }
    
    public String toString(){
         return "Car Type: "+ getCarType()+ System.getProperty("line.separator") +"Car Name: " + getCarName() + System.getProperty("line.separator") + "Car Color: "+getCarColor() + System.getProperty("line.separator") + "Car Number Plate: " + getCarNumberPlate()+ System.getProperty("line.separator") + "Driver Name: "+ getDriverName()+ System.getProperty("line.separator") + "Driver PhoneNumber: "+getDriverNumber();
    }
     public void Filing(String a,String b, String c,int d) throws FileNotFoundException {
       Verify obj=new Verify();
         if (obj.counter==0){
         outFile=new PrintWriter("Verfication1.txt");
         }
         if (obj.counter==1){
         outFile=new PrintWriter("Verfication2.txt");
         }
         if (obj.counter==2){
         outFile=new PrintWriter("Verfication3.txt");
         }
        outFile.println(a);
        outFile.println("Expected Fair:" + d);
        outFile.println("Your Pickup Location: " + b);
        outFile.println("Your DropOff Location: " + c);
        outFile.close();
    }
}
