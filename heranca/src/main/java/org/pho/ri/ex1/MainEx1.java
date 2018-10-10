package org.pho.ri.ex1;

import org.pho.ri.ex1.core.DecoradorDeFiguras;
import org.pho.ri.ex1.core.decorators.DecoradorDeFigurasLinha;
import org.pho.ri.ex1.core.decorators.DecoradorDeFigurasPreenchimento;
import org.pho.ri.ex1.core.decorators.features.Cor;
import org.pho.ri.ex1.core.decorators.features.Linha;
import org.pho.ri.ex1.figuras.Figura;
import org.pho.ri.ex1.figuras.impl.Circulo;
import org.pho.ri.ex1.figuras.impl.Quadrado;

public class MainEx1 {

    public static void main(String[] args) {
        Figura circulo = new Circulo(5);

        Figura quadrado = new Quadrado( 4);

        DecoradorDeFiguras decoradorDeFigurasPreenchimento = new DecoradorDeFigurasPreenchimento(circulo, Cor.BRANCO);

        DecoradorDeFiguras decoradorDeFigurasLinha = new DecoradorDeFigurasLinha(quadrado, Linha.PONTILHADO);

        System.out.println("Círculo: ");
        System.out.printf("Área.......: %f\n", decoradorDeFigurasPreenchimento.calcularArea());
        System.out.printf("Perímetro..: %f\n", decoradorDeFigurasPreenchimento.calcularPerimetro());
        System.out.printf("Descrição..: %s\n", decoradorDeFigurasPreenchimento.descricao());

        System.out.println();

        System.out.println("Quadrado: ");
        System.out.printf("Área.......: %f\n", decoradorDeFigurasLinha.calcularArea());
        System.out.printf("Perímetro..: %f\n", decoradorDeFigurasLinha.calcularPerimetro());
        System.out.printf("Descrição..: %s\n", decoradorDeFigurasLinha.descricao());
    }

}
