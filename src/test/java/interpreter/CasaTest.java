package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasaTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Casa casa = new Casa();
        casa.setPotencia(4500.0);
        casa.setTempo(15.0);

        assertEquals(54.0, casa.calcularConta());
    }

}