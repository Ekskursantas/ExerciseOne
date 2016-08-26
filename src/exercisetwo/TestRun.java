/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisetwo;

/**
 *
 * @author przyg
 */
public class TestRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Even number = new Even();
        EvenThread1 t1 = new EvenThread1(number);
        EvenThread2 t2 = new EvenThread2(number);

        t1.start();
        t2.start();
    }

}

// Even though two different Threads, but there is only one Even class that is being called. That means it is being used twice without reseting theh integers in it.
// If we wanted to make the two numbers even we need to put a int n = 0; in the next() method then the n will be reseted after calling the next() method every time. 