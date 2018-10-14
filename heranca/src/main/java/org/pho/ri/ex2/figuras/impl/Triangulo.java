package org.pho.ri.ex2.figuras.impl;

import org.pho.ri.ex2.figuras.Figura;

public abstract class Triangulo implements Figura {

    protected boolean existe(double a, double b, double c) {
        boolean condition1 = (Math.signum(b - c) < a) && a < (b + c);
        boolean condition2 = (Math.signum(a - c) < b) && b < (a + c);
        boolean condition3 = (Math.signum(a - b) < c) && c < (a + b);

        return condition1 && condition2 && condition3;
    }

}
