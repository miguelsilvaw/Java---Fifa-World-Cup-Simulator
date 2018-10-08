package backend;

//Subclasse da classe Pessoas
public class Staff extends Pessoas {

    //Variaveis de instancia
    private String sexo; 
    private String funcao;
    private String organizacao; //Se pertence organizacao do Mundial, Selecoes, etc.
    
    //Construtor
    public Staff(String sexo, String funcao, String organizacao, String nome, String dataNascimento, String numeroID, String grupoSanguineo) {
        super(nome, dataNascimento, numeroID, grupoSanguineo);
        this.sexo = sexo;
        this.funcao = funcao;
        this.organizacao = organizacao;
    }

    //Gets
     public String getSexo() {
        return sexo;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getOrganizacao() {
        return organizacao;
    }
    
    //Sets
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setOrganizacao(String organizacao) {
        this.organizacao = organizacao;
    }
    
    
    

}
