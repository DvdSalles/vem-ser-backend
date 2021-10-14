package Aula05exercicioInterface;

public class Main {
    public static void main(String[] args) {
        Soma soma1 = new Soma();
        Subtracao sub1 = new Subtracao();
        Multiplicacao mult1 = new Multiplicacao();
        Divisao div1 = new Divisao();

        soma1.calcula(15,3);
        sub1.calcula(15,3);
        mult1.calcula(15,3);
        div1.calcula(15,0);

        System.out.println(soma1.calcula(15,3));
        System.out.println(sub1.calcula(15,3));
        System.out.println(mult1.calcula(15,3));
        System.out.println(div1.calcula(15,5));
    }
}
