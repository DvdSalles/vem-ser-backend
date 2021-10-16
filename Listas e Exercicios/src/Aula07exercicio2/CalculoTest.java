package Aula07exercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculoTest {

    @Test
    public void deveTestarFuncaoCalculoSoma() {
        Calculo calcularSoma = (valor1, valor2) -> valor1 + valor2;


        int valor3 = calcularSoma.calcular(5, 6);


        assertEquals(11, valor3, 0);
    }

    @Test
    public void deveTestarFuncaoCalculoMultiplicacao() {
        Calculo calcularMultiplicacao = (valor1, valor2) -> valor1 * valor2;


        int valor3 = calcularMultiplicacao.calcular(5, 6);


        assertEquals(30, valor3, 0);
    }
}
