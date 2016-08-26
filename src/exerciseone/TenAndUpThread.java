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
public class TenAndUpThread extends Thread {

    @Override
    public void run() {
        int starting = 10;
        try {
            while (true) {

                System.out.println(starting);
                starting++;
                sleep(3000);
            }
        } catch (InterruptedException ex) {
            System.out.println("Thread Interupted");

        }
    }

}
