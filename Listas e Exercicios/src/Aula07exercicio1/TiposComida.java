package Aula07exercicio1;

public enum TiposComida {
    JAPONESA("custa R$50"),
    FAST_FOOD("custa R$30"),
    TRADICIONAL("custa R$20");

    private String descricao;

    TiposComida(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }
}
