package org.pho.questionario;

public class Testes {

    public static void main(String[] args) {

        Cruzeiro cruzeiro = new Cruzeiro();

        Submarino submarino = new Submarino();

        System.out.println(cruzeiro instanceof Navio);
        System.out.println(cruzeiro instanceof Navegavel);
        System.out.println(submarino instanceof NavioMilitar);
        System.out.println(submarino instanceof Object);
    }

}
