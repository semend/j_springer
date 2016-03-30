/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author falc0n
 */
public class RaceDemo extends Racer {
    public static void main(String[] args){
        Racer racer = new Racer();
        Thread tortoise = new Thread(racer, "Tortoise");
        Thread hare = new Thread(racer, "Hare");
        tortoise.start();
        hare.start();
    }
    
}