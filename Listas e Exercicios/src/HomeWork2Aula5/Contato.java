package HomeWork2Aula5;

public class Contato {
    private String descricao;
    private String telefone;
    private Integer tipo; //1 - Residencial  2 - Comercial

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public void imprimirContato(){
        System.out.printf("Descrição: %s %nTelefone: %s %nTipo: %d %n",this.descricao,this.telefone,this.tipo);
    }
}
