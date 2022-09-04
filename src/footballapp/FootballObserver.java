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
public class FootballObserver extends Observer{

    public FootballObserver(Football goal){
      this.goal = goal;
      this.goal.attach(this);
   }
    
   @Override
   public void update() {
      System.out.println( "Binary String: " + Integer.toBinaryString( goal.getState() ) ); 
   }
}
