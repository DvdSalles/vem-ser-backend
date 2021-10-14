package HomeWork1Aula3;

public class Endereco {
    int tipo;
    String logradouro;
    int numero;
    String complemento;
    String cep;
    String cidade;
    String estado;
    String pais;
    String tipoDeEndereco;

    void imprimirEndereco() {
        if (this.tipo == 1) {
            tipoDeEndereco = "Residencial";
        } else if (this.tipo == 2) {
            tipoDeEndereco = "Comercial";
        } else {
            tipoDeEndereco = "Tipo de endereço não encontrado";
        }
        System.out.println("Tipo de endereço: " + tipoDeEndereco);
        System.out.println("Logradouro: " + this.logradouro);
        System.out.println("Número: " + this.numero);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("CEP: " + this.cep);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        System.out.println("País: " + this.pais);
    }
}
