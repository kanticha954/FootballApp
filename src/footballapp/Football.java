/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballapp;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ASUS
 */
public class Football {

    /**
     * @param args the command line arguments
     */
    
   private List<Observer> observers = new ArrayList<Observer>();
   private String state;

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
     
    }

    
}
