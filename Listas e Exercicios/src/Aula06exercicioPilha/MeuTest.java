package Aula06exercicioPilha;

import org.junit.Test;

import static org.junit.Assert.*;

public class MeuTest {

    @Test
    public void deveTestarSeONumeroEParComSucesso(){
    //SETUP
    int valor = 10;

    //ACT AÇÃO
    boolean ePar = valor % 2 == 0;


    //ASSERT (VERIFICAÇÃO)
    assertFalse(ePar);
    }

    @Test
    public void deveTestarSeONumeroEParSemSucesso(){
        int valor = 11;

        boolean ePar = valor % 2 ==0;

        assertFalse(ePar);
    }

    @Test
    public void deveTestarValorIgual(){
        //SETUP
        int idade = 30;
        String porExtenso = "Maicon tem "+ idade +" anos.";


        //ASSERT
        assertEquals(30, idade);
        assertEquals("Maicon tem 30 anos.", porExtenso);
    }
    @Test
    public void deveTestarValorNaoIgual(){
        //SETUP
        int idade = 30;
        String porExtenso = "Maicon tem "+ idade +" anos.";


        //ASSERT
        assertNotEquals(20, idade);
        assertNotEquals("Maicon tem 20 anos.", porExtenso);
    }
}
