package Aula03;

public class ExercicioAula3 {
    public static void main(String[] args) {
        String[] valores = {"123", "1000", "300"};
        Integer funcionario = Integer.parseInt(valores[0]);
        Double salario = Double.parseDouble(valores[1]);
        Double descontos = Double.parseDouble(valores[2]);

        System.out.print(salario - descontos);

    }
}
