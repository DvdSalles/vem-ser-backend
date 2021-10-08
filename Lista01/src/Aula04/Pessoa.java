package Aula04;

public class Pessoa {
   private String nome;
   private String sobrenome;
   private int idade;
   private String whatsApp;

   public Pessoa(){

   }

   public Pessoa(String nome,String sobrenome){
       this.nome = nome;
       this.sobrenome = sobrenome;
   }



   public void setNome(String nome){
       this.nome = nome;
   }
   public String getNome(){
       return nome;
   }
   public void setSobrenome(String sobrenome){
       this.sobrenome = sobrenome;
   }
   public String getSobrenome(){
       return sobrenome;
   }
   public void setIdade(int idade){
       this.idade = idade;
   }
   public int getIdade(){
       return idade;
   }
   public void setWhatsApp(String whats){
       this.whatsApp = whats;
   }
   public String getWhatsApp(){
       return whatsApp;
   }

    public void conversar(Pessoa pessoa) {
       System.out.println(this.nome + " conversou com " + pessoa.nome);
    }

    public String retornarNomeCompleto() {
       return nome + " " + sobrenome;
    }

    public boolean ehMaiorDeIdade() {
       return idade >= 18;
    }

    public void mandarWhats(Pessoa pessoa, String msg) {
        System.out.println(nome + " enviou: " + msg + " para " + pessoa.nome);
    }
}
