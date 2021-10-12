package Lista01ex4_OO;

import java.util.Scanner;

public class Info extends Cidade{
    Scanner scanner = new Scanner(System.in);


    private String info1 = "Anápolis é muito conhecida pela festa do piqui, com quase 400 mil habitantes possui um IDH de 0,737.";
    private String info2 = "Goiania tem uma festa do piqui maior que a de Anápolis, isto se deve a sua população de 1,5 milhão de habitantes e um IDH de 0,799.";
    private String info3 = "Barreiras é muito conhecida pela festa do AXÉ, com quase 400 mil habitantes possui um IDH de 0,737.";
    private String info4 = "Salvador tem uma festa do AXÉ maior que a de Barreiras, isto se deve a sua população de 1,5 milhão de habitantes e um IDH de 0,799.";
    private String info5 = "Parintins é muito conhecida pela festa do indio, com quase 400 mil habitantes possui um IDH de 0,737.";
    private String info6 = "Manaus tem uma festa do indio maior que a de Parintins, isto se deve a sua população de 1,5 milhão de habitantes e um IDH de 0,799.";

    public void pesquisar(){
        System.out.println("Digite o número do estado desejado: ");
        System.out.println("1- "+getEstado1());
        System.out.println("2- "+getEstado2());
        System.out.println("3- "+getEstado3());
        int opcaoEstado = scanner.nextInt();
        if(opcaoEstado <= 3 && opcaoEstado > 0){
            scanner.nextLine();

            System.out.println("Digite o número da cidade desejada: ");
            switch (opcaoEstado){
                case 1:
                    System.out.println("1- "+getCidade1());
                    System.out.println("2- "+getCidade2());
                    break;
                case 2:
                    System.out.println("3- "+getCidade3());
                    System.out.println("4- "+getCidade4());
                    break;
                case 3:
                    System.out.println("5- "+getCidade5());
                    System.out.println("6- "+getCidade6());
                    break;
                default:
                    System.err.println("Opção inválida!");
                    this.pesquisar();
                    break;
            }
            int opcaoCidade = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoCidade){
                case 1:
                    System.out.println(getInfo1());
                    break;
                case 2:
                    System.out.println(getInfo2());
                    break;
                case 3:
                    System.out.println(getInfo3());
                    break;
                case 4:
                    System.out.println(getInfo4());
                    break;
                case 5:
                    System.out.println(getInfo5());
                    break;
                case 6:
                    System.out.println(getInfo6());
                    break;
                default:
                    System.err.println("Opção inválida!");
                    this.pesquisar();
                    break;
            }
        }else{
            System.err.println("Opção inválida!");
            this.pesquisar();
        }

    }

    public String getInfo1() {
        return info1;
    }

    public String getInfo2() {
        return info2;
    }

    public String getInfo3() {
        return info3;
    }

    public String getInfo4() {
        return info4;
    }

    public String getInfo5() {
        return info5;
    }

    public String getInfo6() {
        return info6;
    }
}
