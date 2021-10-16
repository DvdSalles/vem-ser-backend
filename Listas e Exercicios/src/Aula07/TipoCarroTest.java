package Aula07;

import org.junit.Test;

public class TipoCarroTest {
    @Test
    public void deveTestarEnum(){
        TipoCarro tipoCarro = TipoCarro.SEDAN;
        System.out.println(tipoCarro);
        System.out.println(tipoCarro.toString());

        TipoCarro tipoCarro1 = TipoCarro.valueOf("SEDAN");
        System.out.println(tipoCarro1);

        for(TipoCarro tipo : TipoCarro.values()){
            System.out.print(tipo);
            System.out.print(" ordinal: "+tipo.ordinal());
            System.out.println(" descrição: "+tipo.getDescricao());
        }
    }
}
