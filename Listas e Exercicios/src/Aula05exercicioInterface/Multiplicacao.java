package Aula05exercicioInterface;

public class Multiplicacao implements OperacaoMatematica{

    @Override
    public int calcula(int a, int b) {
        return a * b;
    }
}
