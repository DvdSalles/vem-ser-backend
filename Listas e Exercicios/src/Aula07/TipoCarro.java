package Aula07;

public enum TipoCarro {
    SEDAN("Sedan"),
    ESPORTIVO("Esportivo"),
    HATCH("Hatch"),
    SUV("Suv");

    private String descricao;

    TipoCarro(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
