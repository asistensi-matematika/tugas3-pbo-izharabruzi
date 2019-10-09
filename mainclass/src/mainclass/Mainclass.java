/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.Scanner;

/**
 *
 * @author ROG
 */
public class Mainclass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        linearequation L = new linearequation();
        System.out.print("Input : ");

        L.setA(input.nextDouble());
        L.getA();
        L.setB(input.nextDouble());
        L.getB();
        L.setC(input.nextDouble());
        L.getC();
        L.setD(input.nextDouble());
        L.getD();
        L.setE(input.nextDouble());
        L.getE();
        L.setF(input.nextDouble());
        L.getF();
        System.out.println("\nOutput:");
        System.out.println("Sistem Persamaanya: \n" + L.getA() + "x + " + L.getB() + "y = " + L.getE() + "\n" + L.getC() + "x + " + L.getD() + "y = " + L.getF());
        System.out.println("\nHasilnya:");

        L.main();

        // TODO code application logic here
    }

}
