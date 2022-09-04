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
      Football football = new Football();
      new FootballObserver(football);

      goal = football.setState(1-0);
      System.out.println("Enter Score Thai"+goal+"UAE");	
      System.out.println("Second state change: 10");	
      football.setState(10);
   }
}
