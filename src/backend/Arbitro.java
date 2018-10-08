
package backend;

//Subclasse da classe Pessoas
public class Arbitro extends Pessoas {

    //Variaveis de instancia
    private int numeroJogos;
    private String sexo;
    private String tipoArbitro; //true = M; false = F;

    
    //Construtor
    public Arbitro(int numeroJogos, String sexo, String tipoArbitro, String nome, String nascimento, String numeroIden, String grupoSang) {
        super(nome, nascimento, numeroIden, grupoSang);
        this.numeroJogos = numeroJogos;
        this.sexo = sexo;
        this.tipoArbitro = tipoArbitro;
    }

    public Arbitro(int numeroJogos, String sexo, String tipoArbitro) {
        this.numeroJogos = numeroJogos;
        this.sexo = sexo;
        this.tipoArbitro = tipoArbitro;
    }
    
    
    //Gets
    public int getNumeroJogos() {
        return numeroJogos;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipoArbitro() {
        return tipoArbitro;
    }
    
    //Sets
    public void setNumeroJogos(int numeroJogos) {
        this.numeroJogos = numeroJogos;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipoArbitro(String tipoArbitro) {
        this.tipoArbitro = tipoArbitro;
    }

    //toString
    @Override
    public String toString() {
        return "Arbitros{" + "numeroJogos=" + numeroJogos + ", sexo=" + sexo + ", tipoArbitro=" + tipoArbitro + '}';
    }
    
    
    
}