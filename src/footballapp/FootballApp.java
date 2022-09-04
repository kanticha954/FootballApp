/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballapp;

/**
 *
 * @author ASUS
 */
public class FootballApp {
    public static void main(String[] args) {
      Football goal = new Football();
      new FootballObserver(goal);
     
      System.out.println("Enter Score Thai 1-0 UDE");
      goal.setState("Thai 1-0 UDE");
      
      System.out.println("Enter Score Thai 2-0 UDE");
      goal.setState("Thai 2-0 UDE");

      
   }
}
