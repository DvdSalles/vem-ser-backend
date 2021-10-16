package Aula07;

public class Main {
    public static void main(String[] args) {
//        Funcao funcao = new Funcao() {
//            @Override
//            public String gerar(String valor) {
//                return "Sr. "+ valor;
//            }
//
//        };
        Funcao funcaoHomem = valor -> "Sr. "+ valor;
        Funcao funcaoMulher = valor -> "Sra. "+ valor;

        System.out.println(funcaoHomem.gerar("David"));
        System.out.println(funcaoMulher.gerar("Fulana"));
    }
}
