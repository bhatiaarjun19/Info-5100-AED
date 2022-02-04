/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author maverick1997
 */
public class CarDetailsHistory {
    private ArrayList<CarDetails> history;
    
    public CarDetailsHistory(){
        this.history = new ArrayList<CarDetails>();
    }
    
    public ArrayList<CarDetails> getHistory(){
        return history;
    }
    
    public void setHistory(ArrayList<CarDetails> History){
        this.history = history; 
    }
    
    public CarDetails addNewDetails(){
        CarDetails newCar = new CarDetails();
         history.add(newCar);
         return newCar;
    }
    public void deleteDetails(CarDetails cd){
        history.remove(cd);
    }
    
    
}
