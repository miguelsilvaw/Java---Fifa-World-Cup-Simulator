package backend;

//Superclasse para registar e listar pessoas.
public class Pessoas {

    //Variaveis de instancia
    private String nome;
    private String dataNascimento;
    private String numeroID;
    private String grupoSanguineo;

  
    //Construtor
      public Pessoas(String nome, String dataNascimento, String numeroID, String grupoSanguineo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroID = numeroID;
        this.grupoSanguineo = grupoSanguineo;
    }

    public Pessoas() {
     }

    //Gets
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }
    
    //Sets
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
    
    
    
}