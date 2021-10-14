package Aula05exercicioInterface;

public class Divisao implements OperacaoMatematica{

    @Override
    public int calcula(int a, int b) {
        if(b == 0){
            b = 1;
            return a / b;
        }else{
            return a / b;
        }

    }
}
