/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseone;

/**
 *
 * @author przyg
 */
public class SumThread extends Thread {

    @Override
    public void run() {
        long sum = 0;
     
        for (int i = 1; i <= 1000000000; i++) {
            sum = sum + i;
        }

         
//       long sum = (1000000000 * 1000000001) / 2;
//
        System.out.println(sum);
    }

}
