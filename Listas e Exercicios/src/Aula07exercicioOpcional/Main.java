package Aula07exercicioOpcional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        int i = 1;
        lista.add(new Pessoa(i++, "Paulo", 6500, "Desenvolvedor"));
        lista.add(new Pessoa(i++, "Pedro", 5300, "Desenvolvedor"));
        lista.add(new Pessoa(i++, "Joel", 6000, "Arquiteto"));
        lista.add(new Pessoa(i++, "Henrique", 1000, "Estagiário"));
        lista.add(new Pessoa(i++, "Gabriel", 1000, "Estagiário"));
        lista.add(new Pessoa(i++, "Gustavo", 18000, "Diretor"));

        //1- listar todas as pessoas:
//        lista.stream().forEach(System.out::println);


        //2- filtrar todas as pessoas com salario maior do que 5 mil:
//        List<Pessoa> maisQue5Mil = lista.stream().filter(pessoa -> pessoa.getSalario()>5000.0)
//                .collect(Collectors.toList());
//        maisQue5Mil.stream().forEach(System.out::println);


        //3- filtrar todas as pessoas que são desenvolvedoras e organizar por salário crescente:
//        List<Pessoa> desenvolvedoresOrg = lista.stream()
//                .filter(pessoa -> {
//                    return pessoa.getCargo().equalsIgnoreCase("Desenvolvedor");
//                })
//                .collect(Collectors.toList());
//                desenvolvedoresOrg.sort(Comparator.comparing(o -> o.getSalario()));
//                desenvolvedoresOrg.stream().forEach(System.out::println);


        //4- fazer a média salarial de todos:
//        double mediaSalarial = lista.stream()
//                .mapToDouble(Pessoa::getSalario)
//                .average()
//                .getAsDouble();
//        System.out.println(mediaSalarial);


        //5- verificar na lista (utilizando o método anyMatch) se tem alguém que ganha mais do que 20 mil:
//        boolean alguemMaisDe20Mil = lista.stream()
//                .anyMatch(pessoa -> pessoa.getSalario() > 20000);
//        System.out.println(alguemMaisDe20Mil);


        //6- retornar um Map contendo os ids e os nomes dos colaboradores:
        Map<Integer, String> mapaIdNomes = lista.stream()
                .collect(Collectors.toMap(Pessoa::getId, Pessoa::getNome));
        System.out.println(mapaIdNomes);

        //7- com o mapa da 6, retornar o nome com o id=2:
        String nomeId2 = mapaIdNomes.get(2);
        System.out.println(nomeId2);

    }
}
