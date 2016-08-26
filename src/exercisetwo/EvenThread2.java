/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisetwo;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author przyg
 */
public class EvenThread2 extends Thread {

    private Even run;

    public EvenThread2(Even run) {
        this.run = run;
    }

    @Override
    public void run() {
        synchronized (run) {
            try {
                sleep(1000);
                int number = run.next();
                System.out.println(number);
            } catch (InterruptedException ex) {
                Logger.getLogger(EvenThread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
