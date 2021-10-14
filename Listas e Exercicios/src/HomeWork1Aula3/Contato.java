package HomeWork1Aula3;

public class Contato {
    String descricao;
    String telefone;
    int tipo;
    String tipoDeContato;

    void imprimirContato(){
        if(this.tipo == 1){
            tipoDeContato = "Residencial";
        }else if(this.tipo == 2){
            tipoDeContato = "Comercial";
        }else{
            tipoDeContato = "Tipo de contato não encontrado";
        }
        System.out.println(this.descricao+" "+this.telefone+" " + tipoDeContato + "." );
    }

}
