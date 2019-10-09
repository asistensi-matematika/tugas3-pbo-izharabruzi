/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

/**
 *
 * @author ROG
 */
public class linearequation {

    private double a, b, c, d, e, f;

    public linearequation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public linearequation() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    void main() {
        {
            if (cekSolusi()) {

                double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
                String X = String.format("%.2f", x);
                double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
                String Y = String.format("%.2f", y);
                System.out.println("x = " + X + " , " + "y = " + Y);

            } else {
                System.out.println("\nHasilnya:\n"
                        + "Sistem tidak memiliki persamaan");
            }
        }
    }

    public boolean cekSolusi() {
        return (a * d) - (b * c) != 0;
    }

}
