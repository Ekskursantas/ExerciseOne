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
public class OneToFiveThread extends Thread {

    @Override
    public void run() {
        int counter = 5;
        try {
            for (int i = 1; i <= 5; i++) {

                System.out.println(i);
                sleep(2000);

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(OneToFiveThread.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
