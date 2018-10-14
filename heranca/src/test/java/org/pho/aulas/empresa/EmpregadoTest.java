package org.pho.aulas.empresa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    protected static final double FATOR = 0.85;

    protected Empregado empregado;

    @BeforeEach
    public void setUp() {
        empregado = new Empregado("Funcionario", 1000);
    }

    @Test
    public void criacaoNovoEmpregado() {
        String expectedNome = "Funcionario";
        double expectedSalario = 1000;
        double expectedLiquido = 1000 * FATOR;

        assertAll(
            () -> assertEquals(expectedNome, empregado.getNome()),
            () -> assertEquals(expectedSalario, empregado.getSalario()),
            () -> assertEquals(expectedLiquido, empregado.liquido())
        );
    }

}
