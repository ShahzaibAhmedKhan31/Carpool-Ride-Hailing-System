/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author HP
 */
public class PremiumPrice {
    
   private String pick_up; //variable for pick up from main class
   private String drop_off; // variable for drop off from main class
   private final int rate = 20; //variable for rate
   private int FP = 0; // variable for Final Price
   
   PremiumPrice(String pick, String drop){
    this.drop_off = drop;
    this.pick_up = pick;
   }
   protected String getPick(){
    return pick_up;
   }
   protected String getDrop(){
    return drop_off;
   }
   //method to calculate and store Final price for individual pick up and drop off locations
   //Note: Spellings jistarah likhin hain pick up aur drop off locations ki wohi rakhna drop down menu mein 
   //Note: Pehla letter Capital hai har location ka
   public int calculate2(){
    switch(getPick()){
        case "Airport":
            switch(getDrop()){
                case "Gulshan":
                    FP = 13*rate;
                    break;
                case "Clifton":
                    FP = 20*rate;
                    break;
                case "Bahadurabad":
                    FP = 14*rate;
                    break;
            }
            break;
        case "Clifton":
            switch(getDrop()){
                case "Airport":
                    FP = 21*rate;
                    break;
                case "Gulshan":
                    FP = 23*rate;
                    break;
                case "Bahadurabad":
                    FP = 10*rate;
                    break;
            }
            break;
        case "Gulshan":
            switch(getDrop()){
                case "Airport":
                    FP = 13*rate;
                    break;
                case "Clifton":
                    FP = 20*rate;
                    break;
                case "Bahadurabad":
                    FP = 9*rate;
                    break;
            }
            break;
        case "Bahadurabad":
            switch(getDrop()){
                case "Airport":
                    FP = 14*rate;
                    break;
                case "Gulshan":
                    FP = 9*rate;
                    break;
                case "Clifton":
                    FP = 10*rate;
                    break;
            }
            break;
    }
       return FP;
   }  
}

