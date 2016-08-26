/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseone;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author przyg
 */
public class TestRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        SumThread sum = new SumThread();
        sum.start();
        
        OneToFiveThread count = new OneToFiveThread();
        count.start();
        
        TenAndUpThread up = new TenAndUpThread();
        up.start();
        
        try {
            Thread.sleep(10000);
            up.interrupt();
            System.out.println("Interupting Tread");
        } catch (InterruptedException ex) {
            Logger.getLogger(TestRun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
