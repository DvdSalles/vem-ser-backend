package com.dbc;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um desses estados, não se esqueça de digitar o nome dele corretamente: Goiás, Bahia, Amazonas");
        String estado = scanner.nextLine();
        if(estado.equalsIgnoreCase("Goiás")) {
            System.out.println("Agora escolha entre Goiania e Anápolis: ");
            String cidade = scanner.nextLine();
            if(cidade.equalsIgnoreCase("Anápolis")) {
                System.out.println("Anápolis é muito conhecida pela festa do piqui, com quase 400 mil habitantes possui um IDH de 0,737.");
            }else if(cidade.equalsIgnoreCase("Goiania")) {
                System.out.println("Goiania tem uma festa do piqui maior que a de Anápolis, isto se deve a sua população de 1,5 milhão de habitantes e um IDH de 0,799");
            }else{
                System.out.println("ERRO: CIDADE NÃO ENCONTRADA!");
            }
        }else if(estado.equalsIgnoreCase("Bahia")) {
            System.out.println("Agora escolha entre Salvador e Barreiras: ");
            String cidade = scanner.nextLine();
            if(cidade.equalsIgnoreCase("Salvador")) {
                System.out.println("Barreiras é muito conhecida pela festa do AXÉ, com quase 400 mil habitantes possui um IDH de 0,737.");
            }else if(cidade.equalsIgnoreCase("Barreiras")) {
                System.out.println("Salvador tem uma festa do AXÉ maior que a de Barreiras, isto se deve a sua população de 1,5 milhão de habitantes e um IDH de 0,799");
            }else{
                System.out.println("ERRO: CIDADE NÃO ENCONTRADA!");
        }
        }else if(estado.equalsIgnoreCase("Amazonas")) {
            System.out.println("Agora escolha entre Manaus e Parintins: ");
            String cidade = scanner.nextLine();
            if (cidade.equalsIgnoreCase("Parintins")) {
                System.out.println("Parintins é muito conhecida pela festa do indio, com quase 400 mil habitantes possui um IDH de 0,737.");
            } else if (cidade.equalsIgnoreCase("Manaus")) {
                System.out.println("Manaus tem uma festa do indio maior que a de Parintins, isto se deve a sua população de 1,5 milhão de habitantes e um IDH de 0,799");
            } else {
                System.out.println("ERRO: CIDADE NÃO ENCONTRADA!");
            }
        }else {
            System.out.println("ERRO: ESTADO NÃO ENCONTRADO");
        }
        }
    }