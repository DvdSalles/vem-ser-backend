package Lista01ex6_OO;

import java.util.Scanner;

public class Tradutor {
    Scanner scanner = new Scanner(System.in);

    private String palavra1 = "Cachorro";
    private String palavra1i = "Dog";
    private String palavra2 = "Tempo";
    private String palavra2i = "Time";
    private String palavra3 = "Amor";
    private String palavra3i = "Love";
    private String palavra4 = "Cidade";
    private String palavra4i = "City";
    private String palavra5 = "Feliz";
    private String palavra5i = "Happy";

    public String getPalavra1() {
        return palavra1;
    }

    public String getPalavra1i() {
        return palavra1i;
    }

    public String getPalavra2() {
        return palavra2;
    }

    public String getPalavra2i() {
        return palavra2i;
    }

    public String getPalavra3() {
        return palavra3;
    }

    public String getPalavra3i() {
        return palavra3i;
    }

    public String getPalavra4() {
        return palavra4;
    }

    public String getPalavra4i() {
        return palavra4i;
    }

    public String getPalavra5() {
        return palavra5;
    }

    public String getPalavra5i() {
        return palavra5i;
    }

    public void traduzir(){
        System.out.println("Digite a palavra que você quer traduzir: ");
        String palavra = scanner.nextLine();
        if(palavra.equalsIgnoreCase(getPalavra1())){
            System.out.println(getPalavra1i());
        }else if(palavra.equalsIgnoreCase(getPalavra1i())){
            System.out.println(getPalavra1());
        }else if(palavra.equalsIgnoreCase(getPalavra2())){
            System.out.println(getPalavra2i());
        }else if(palavra.equalsIgnoreCase(getPalavra2i())){
            System.out.println(getPalavra2());
        }else if(palavra.equalsIgnoreCase(getPalavra3())){
            System.out.println(getPalavra3i());
        }else if(palavra.equalsIgnoreCase(getPalavra3i())){
            System.out.println(getPalavra3());
        }else if(palavra.equalsIgnoreCase(getPalavra4())){
            System.out.println(getPalavra4i());
        }else if(palavra.equalsIgnoreCase(getPalavra4i())){
            System.out.println(getPalavra4());
        }else if(palavra.equalsIgnoreCase(getPalavra5())){
            System.out.println(getPalavra5i());
        }else if(palavra.equalsIgnoreCase(getPalavra5i())){
            System.out.println(getPalavra5());
        }else{
            System.err.printf("Palavra não encontrada! %n");
        }
        this.traduzir();
    }
}
