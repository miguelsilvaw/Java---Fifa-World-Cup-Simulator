package backend;


//Subclass da classe Pessoas
public class Jogador extends Pessoas {

    //variaveis de instancia
    private int numeroCamisola;
    private float pesoJogador;
    private float alturaJogador;
    private int numeroInternalizacoes;
    private int numeroCamarelos;
    private int numeroCvermelhos;
    private int numeroGolosMarcados;

    
    
    //Construtor
    public Jogador( String nome, String dataNascimento, String numeroID, String grupoSanguineo,int numeroCamisola, float pesoJogador, float alturaJogador, int numeroInternalizacoes) {
        super(nome, dataNascimento, numeroID, grupoSanguineo);
        this.numeroCamisola = numeroCamisola;
        this.pesoJogador = pesoJogador;
        this.alturaJogador = alturaJogador;
        this.numeroInternalizacoes = numeroInternalizacoes;
       
        
    }

    //Gets
    public int getNumeroCamisola() {
        return numeroCamisola;
    }

    public float getPesoJogador() {
        return pesoJogador;
    }

    public float getAlturaJogador() {
        return alturaJogador;
    }

    public int getNumeroInternalizacoes() {
        return numeroInternalizacoes;
    }

    public int getNumeroCamarelos() {
        return numeroCamarelos;
    }

    public int getNumeroCvermelhos() {
        return numeroCvermelhos;
    }

    public int getGolosMarcados() {
        return numeroGolosMarcados;
    }
    
    //Sets
    public void setNumeroCamisola(int numeroCamisola) {
        if (numeroCamisola >= 1 && numeroCamisola <= 99){
        this.numeroCamisola = numeroCamisola;
        }
    }
    
    public void setPesoJogador(float pesoJogador) {
        this.pesoJogador = pesoJogador;
    }

    public void setAlturaJogador(float alturaJogador) {
        this.alturaJogador = alturaJogador;
    }

    public void setNumeroInternalizacoes(int numeroInternalizacoes) {
        this.numeroInternalizacoes = numeroInternalizacoes;
    }

    public void setNumeroCamarelos(int numeroCamarelos) {
        this.numeroCamarelos = numeroCamarelos;
    }

    public void setNumeroCvermelhos(int numeroCvermelhos) {
        this.numeroCvermelhos = numeroCvermelhos;
    }

    public void setGolosMarcados(int golosMarcados) {
        this.numeroGolosMarcados = golosMarcados;
    }
    

    //Adicionar um golo ao numero de golos de um jogador
    public void goloMarcado(){
       numeroGolosMarcados++;
  }
    
    //Adicionar um cartao amarelo ao numero de cartoes amarelos de um jogador
    public void adicionarCartaoAmarelo(){
        numeroCamarelos++;
    }
    
    //Adicionar um cartao vermelho ao numero de cartoes vermelhos de um jogador
    public void adicionarCartaoVermelho(){
        numeroCvermelhos++;
    }
   
    //Caso um jogador marque um auto-golo, este nao conta nos golos.
    public void autoGolo(){
        numeroGolosMarcados--;
    }
    
    

}
