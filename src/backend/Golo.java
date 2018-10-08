package backend;

//Saber informação sobre golos.
public class Golo {
    
    //Variaveis de instancia
    private Jogador marcadorGolo; //Jogador que marcou golo
    private String tipoGolo; //Penalty, Pé esquerdo, Pé Direito, Cabeça..
    private int minutoGolo; //Minuto em que marcou o golo
    private boolean autoGolo; //True = auto golo; false = golo normal.

    
    
    //Construtor
    public Golo(Jogador marcadorGolo, String tipoGolo, int minutoGolo, boolean autoGolo) {
        this.marcadorGolo = marcadorGolo;
        this.tipoGolo = tipoGolo;
        this.minutoGolo = minutoGolo;
        this.autoGolo = autoGolo;
    }

    //Gets
    public Jogador getMarcadorGolo() {
        return marcadorGolo;
    }

    public String getTipoGolo() {
        return tipoGolo;
    }

    public int getMinutoGolo() {
        return minutoGolo;
    }

    public boolean isAutoGolo() {
        return autoGolo;
    }
    
    //Sets
    public void setMarcadorGolo(Jogador marcadorGolo) {
        this.marcadorGolo = marcadorGolo;
    }

    public void setTipoGolo(String tipoGolo) {
        this.tipoGolo = tipoGolo;
    }

    /*Jogo normal + pronlongamento tem no maximo 120 minutos e para nao existerem
    golos em minutos negativos */
     public void setMinutoGolo(int minutoGolo) {
        if (minutoGolo >= 0 && minutoGolo <= 120){
        this.minutoGolo = minutoGolo;
        }
    }
    public void setAutoGolo(boolean autoGolo) {
        this.autoGolo = autoGolo;
    }
    
    
    
    
    






}

