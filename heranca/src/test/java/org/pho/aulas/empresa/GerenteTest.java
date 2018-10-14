package org.pho.aulas.empresa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest extends EmpregadoTest {

    private static final double BONUS = 200.0;

    @BeforeEach
    public void setUp() {
        empregado = new Gerente("Gerente", 2000.0, BONUS);
    }

    @Test
    @Override
    public void criacaoNovoEmpregado() {
        String expectedNome = "Gerente";
        double expectedSalario = 2000;
        double expectedLiquido = 2000 * FATOR + BONUS;

        assertAll(
            () -> assertEquals(expectedNome, empregado.getNome()),
            () -> assertEquals(expectedSalario, empregado.getSalario()),
            () -> assertEquals(expectedLiquido, empregado.liquido())
        );
    }
}
